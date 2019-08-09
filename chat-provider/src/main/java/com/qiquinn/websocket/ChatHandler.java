package com.qiquinn.websocket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @Author:QiQuinn
 * @Desicription: 消息处理的handler，用于websocket专门处理的对象，frame是消息的载体
 * @Date:Created in 2019/8/7
 * @Modified By:
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame>
{
    /* 用于管理客户端channel的东西 */
    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    private Logger log = LoggerFactory.getLogger(ChatHandler.class);
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame message) throws Exception
    {
        /* 发送消息 */
        String  clientMessage = message.text();
        for (Channel channel : clients)
        {
            channel.writeAndFlush(new TextWebSocketFrame("[服务器接收时间: ]"+ new Date().getTime()+" 消息:"+clientMessage));
        }
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        /* 客户端连接服务端之后，把客户端的channel放入到ChannelGroup中进行管理 */
        Channel channel = ctx.channel();
        clients.add(channel);
        log.info(channel.id().asShortText()+"客户端加入!");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception
    {
        /* 当触发handlerRemove,channleGroup会自动移除对客户端的channel */
        Channel channel = ctx.channel();
        clients.remove(channel); //可以不写
        log.info("客户端长关闭连接：ID: "+channel.id().asLongText()+"   客户端短Id: "+channel.id().asShortText());
    }
}

