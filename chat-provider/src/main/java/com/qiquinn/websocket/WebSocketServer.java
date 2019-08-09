package com.qiquinn.websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

/**
 * @Author:QiQuinn
 * @Desicription: netty服务启动配置类
 * @Date:Created in 2019/8/7
 * @Modified By:
 */
@Component
public class WebSocketServer
{
    private EventLoopGroup mainGroup;
    private EventLoopGroup workGroup;
    private ServerBootstrap serverBootstrap;
    private ChannelFuture channelFuture;

    public WebSocketServer()
    {
        mainGroup = new NioEventLoopGroup();
        workGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(mainGroup,workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new WebSocketInitialzer());
    }
    /**
      * @Author:QiQuinn
      * @Desicription: 绑定端口启动netty
      * @Date:Created in 2019/8/8 15:47
      * @param
      *@return void
      * @Modified By:
     */
    public void start()
    {
        this.channelFuture = serverBootstrap.bind(8888);
    }

    private static class SingletionWebSocketServer
    {
        static final WebSocketServer instance = new WebSocketServer();
    }

    public static WebSocketServer getWebSocketServerInstance()
    {
        return SingletionWebSocketServer.instance;
    }
}
