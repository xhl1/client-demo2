package com.example.clientdemo2.mq;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MessageSender
 * @Package com.example.clientdemo.mq.hello2
 * @Description:
 * @Date 2018/5/31下午 7:02
 */
@EnableBinding(MessageBinder.class)
public class MessageSender {
    private Logger logger = Logger.getLogger(MessageSender.class);
    @Autowired
    @Output(MessageBinder.TEST_OUTPuT)
    private MessageChannel messageOutput;




    public void sendMq(Long message){
        String context="now message".concat(new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(new Date()));
        logger.info("SendMq发送成功时间:"+context+"\n"+"SendMq接收数据为:"+message);
        messageOutput.send(MessageBuilder.withPayload(message).build());
    }
}