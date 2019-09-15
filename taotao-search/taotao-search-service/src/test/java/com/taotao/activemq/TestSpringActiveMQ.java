package com.taotao.activemq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpringActiveMQ {

    @Test
    public void testActiveMQConsumer() throws IOException{
        // 初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");
        // 等待接收消息
        System.in.read();
    }
}