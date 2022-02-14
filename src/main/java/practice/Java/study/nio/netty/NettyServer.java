package practice.Java.study.nio.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.CharsetUtil;


public class NettyServer {

    public static void main(String[] args) throws InterruptedException {

        // 创建BossGroup 和 WorkGroup
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workGroup = new NioEventLoopGroup(8);

        try {
            // 创建服务器端的启动对象
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workGroup) // 设置两个线程组
                .channel(NioServerSocketChannel.class) // 使用NioSocketChannel作为服务器的通道实现
                .option(ChannelOption.SO_BACKLOG, 128) // 设置线程队列得到连接个数
                .childOption(ChannelOption.SO_KEEPALIVE, true) // 设置保持活动连接状态
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    // 设置workgroup的eventloop对应的管道设置处理器
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new NettyServerHandler());
                    }
                });

            System.out.println("Server is ready...");

            // 绑定一个端口并且同步, 生成一个ChannelFuture对象
            ChannelFuture channelFuture = serverBootstrap.bind(6668).sync();

            // 注册事件监听器
            channelFuture.addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture channelFuture) throws Exception {
                    if (channelFuture.isSuccess()) {
                        System.out.println("监听端口6668成功");
                    } else {
                        System.out.println("监听端口6668失败");
                    }
                }
            });


            // 对关闭通道进行监听
            channelFuture.channel().closeFuture().sync();

        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

    }

    public static class NettyServerHandler extends ChannelInboundHandlerAdapter {

        // 读取客户端发送数据
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

            ctx.pipeline().channel().eventLoop().execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10 * 1000);
                        ctx.writeAndFlush(Unpooled.copiedBuffer("hello, 客户端", CharsetUtil.UTF_8));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            // ByteBuf是Netty提供的, Nio提供的是ByteBuffer
            ByteBuf buf = (ByteBuf) msg;
            System.out.println("客户端地址:" + ctx.channel().remoteAddress());
            System.out.println("客户端发送消息是:" + buf.toString(CharsetUtil.UTF_8));
        }

        // 读取完数据，返回数据给客户端
        @Override
        public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
            // writeAndFlush将数据写入到缓存并刷新
            ctx.writeAndFlush(Unpooled.copiedBuffer("hello, 客户端", CharsetUtil.UTF_8));
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            ctx.close();
        }
    }

}
