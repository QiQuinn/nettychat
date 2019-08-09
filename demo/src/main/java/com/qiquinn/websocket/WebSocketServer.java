package com.qiquinn.websocket;

import com.qiquinn.CustomHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/7
 * @Modified By:
 */
public class WebSocketServer
{
    public static void main(String[] args) throws Exception
    {
        EventLoopGroup mainGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try
        {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(mainGroup,workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new WebSocketInitialzer());
            ChannelFuture channelFuture = serverBootstrap.bind(8888).sync();
            channelFuture.channel().closeFuture().sync();
        }
        finally
        {
            mainGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }


    }
}
