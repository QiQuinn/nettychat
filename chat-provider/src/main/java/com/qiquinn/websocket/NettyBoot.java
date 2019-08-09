package com.qiquinn.websocket;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/8
 * @Modified By:
 */
@Component
public class NettyBoot implements ApplicationListener<ContextRefreshedEvent>
{

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent()==null)
        {
            WebSocketServer.getWebSocketServerInstance().start();
            System.out.println("=============== netty启动 =================");
        }
    }
}
