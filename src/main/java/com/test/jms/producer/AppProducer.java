package com.test.jms.producer;

import com.test.jms.producer.service.ProducerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class AppProducer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producer = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            producer.sendMessage("发送数据" + i);
        }

    }

}
