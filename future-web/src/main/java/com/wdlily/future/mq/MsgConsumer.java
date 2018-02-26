package com.wdlily.future.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 15:28
 */
@Component
@Slf4j
public class MsgConsumer {


    @JmsListener(destination = "future-sms")
    public void receiveMessage(Object message) {

        log.info("【消息消费者】消息内容 = {}", message);

    }


    @JmsListener(destination = JmsConfig.TOPIC, containerFactory = "jmsListenerContainerTopic")
    public void onTopicMessage(String msg) {
        log.info("接收到topic消息：{}", msg);
    }

    @JmsListener(destination = JmsConfig.QUEUE, containerFactory = "jmsListenerContainerQueue")
    public void onQueueMessage(String msg) {
        log.info("接收到queue消息：{}", msg);
    }


}
