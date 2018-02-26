package com.wdlily.future.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 15:12
 */
@Component
public class MsgProducer {

    @Autowired
    private JmsTemplate jmsTemplate;


    public void createMessage(Destination destination, Object message) {

        jmsTemplate.convertAndSend(destination, message);
    }


}
