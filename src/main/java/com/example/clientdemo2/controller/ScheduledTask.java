package com.example.clientdemo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: ScheduledTask
 * @Package com.example.clientdemo2
 * @Description:
 * @Date 2018/6/11下午 3:03
 */
@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
    /*
    * 每隔5秒执行,单位ms
    * */
   // @Scheduled(fixedRate = 5000)
    public void testFixRate(){
        System.out.println("我每隔5秒冒泡一次:"+dateFormat.format(new Date()));
    }
}
