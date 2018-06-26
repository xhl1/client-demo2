package com.example.clientdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringCloudApplication
@EnableTransactionManagement
@EnableFeignClients
@EnableAspectJAutoProxy
@EnableScheduling //开启定时任务注解
public class ClientDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientDemo2Application.class, args);
    }
}
