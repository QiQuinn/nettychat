package com.qiquinn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.qiquinn")
public class NettyWebSocketServerStartor
{
    public static void main( String[] args )
    {
        SpringApplication.run(NettyWebSocketServerStartor.class,args);
    }
}
