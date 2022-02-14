package practice.Java.study.nio.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;

public class NettyClient {

    public static void main(String[] args) throws InterruptedException {

        // 客户端需要一个事件循环组
        EventLoopGroup eventExecutors = new NioEventLoopGroup();

        try {
            // 创建客户端启动对象
            Bootstrap bootStrap = new Bootstrap();

            // 设置相关参数
            bootStrap.group(eventExecutors) //设置线程组
                .channel(NioSocketChannel.class) // 设置客户端通道的实现类
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                        nioSocketChannel.pipeline().addLast(new NettyClientHandler());
                    }
                });

            System.out.println("客户端 ok");

            // 启动客户端, 连接服务器
            ChannelFuture channelFuture = bootStrap.connect(new InetSocketAddress(6668)).sync();

            // 监听channel关闭事件
            channelFuture.channel().closeFuture().sync();

        } finally {
            eventExecutors.shutdownGracefully();
        }

    }

    public static class NettyClientHandler extends ChannelInboundHandlerAdapter {

        // 客户端发送数据
        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            ctx.writeAndFlush(Unpooled.copiedBuffer("hello, server", CharsetUtil.UTF_8));
        }

        // 读取服务器端返回的数据
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            ByteBuf byteBuf = (ByteBuf) msg;
            System.out.println("服务器端地址:" + ctx.channel().remoteAddress());
            System.out.println("服务器发送消息是:" + byteBuf.toString(CharsetUtil.UTF_8));
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            ctx.close();
        }
    }

}
