package com.wdlily.future.msg;

import com.wdlily.future.mq.MsgProducer;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 15:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MsgTest {

    @Autowired
    private MsgProducer msgProducer;

    @Autowired
    private Topic topic;

    @Autowired
    private Queue queue;

    /**
     * 测试队列
     */
    @Test
    public void send(){

        String message = "future test 001";

        Destination destination = new ActiveMQQueue("future-sms");

        for (int i = 0; i < 10; i++) {
            msgProducer.createMessage(destination, message + i);
        }

    }

    /**
     * 测试话题+ 队列
     */
    @Test
    public void doubleTest(){

        for (int i = 0; i < 10; i++) {
            msgProducer.createMessage(topic, "topic message " + i);

            msgProducer.createMessage(queue, "queue message " + i);
        }


    }







}
