package com.example.clientdemo2.mq;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MqMessageConsumer
 * @Package com.example.clientdemo.mq.hello2
 * @Description:  消费者
 * @Date 2018/6/1上午 10:19
 */
@EnableBinding(MessageBinder.class)
public class MqMessageConsumer {
    private Logger logger = Logger.getLogger(MqMessageConsumer.class);


    @StreamListener(MessageBinder.TEST_HELLO_INPUT)
    public void receive(Message<String> message) {
        String context = "now receive ".concat(new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(new Date()));
        logger.info("接收时间:" + context);
        logger.info("接收数据:" + message);

        try {
            String payload = message.getPayload();
            logger.info("消息内容:" + payload);

        } catch (Exception e) {
            logger.info("接收消息异常处理:" + e);
            throw new RuntimeException(e);
        }
    }


}
