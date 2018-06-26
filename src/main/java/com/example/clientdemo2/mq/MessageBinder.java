package com.example.clientdemo2.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @ClassName: MessageBinder
 * @Package com.example.clientdemo.mq.hello2
 * @Description: 定义mq连接
 * @Date 2018/5/31下午 6:56
 */
public interface MessageBinder {
    //生产者
    String TEST_OUTPuT="testOutput";

    //消费者
    String TEST_HELLO_INPUT = "testHelloInput";


    @Input(TEST_HELLO_INPUT)
    MessageChannel messageInput();
    @Output(TEST_OUTPuT)
    MessageChannel messageOutput();
}
