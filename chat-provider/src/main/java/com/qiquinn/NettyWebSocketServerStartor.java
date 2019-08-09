package com.qiquinn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.qiquinn","com.qiquinn.utils.idworker"})
@MapperScan("com.qiquinn.dao")
public class NettyWebSocketServerStartor
{
    public static void main( String[] args )
    {
        SpringApplication.run(NettyWebSocketServerStartor.class,args);
    }
}
