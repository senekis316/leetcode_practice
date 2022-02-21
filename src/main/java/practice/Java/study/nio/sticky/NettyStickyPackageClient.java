package practice.Java.study.nio.sticky;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.MessageToByteEncoder;

import java.net.InetSocketAddress;

public class NettyStickyPackageClient {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup eventExecutors = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventExecutors)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                        nioSocketChannel.pipeline()
                            .addLast(new NettyStickyClientEncoder())
                            .addLast(new NettyStickyClientHandler());
                    }
                });

            ChannelFuture channelFuture = bootstrap.connect(new InetSocketAddress(7000)).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            eventExecutors.shutdownGracefully();
        }
    }

    public static class NettyStickyClientHandler extends SimpleChannelInboundHandler<MessageProtocol> {

        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            for (int i = 0 ; i < 5 ; i++) {
                String msg = "weather is cold! +" + i;
                byte[] content = msg.getBytes("utf-8");
                int length = content.length;

                MessageProtocol messageProtocol = new MessageProtocol();
                messageProtocol.setLen(length);
                messageProtocol.setContent(content);

                ctx.writeAndFlush(messageProtocol);
            }
        }

        @Override
        protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageProtocol messageProtocol) throws Exception {

        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            ctx.close();
        }
    }

    public static class NettyStickyClientEncoder extends MessageToByteEncoder<MessageProtocol> {

        @Override
        protected void encode(ChannelHandlerContext ctx, MessageProtocol messageProtocol, ByteBuf out) throws Exception {
            out.writeInt(messageProtocol.getLen());
            out.writeBytes(messageProtocol.getContent());
        }

    }
}
