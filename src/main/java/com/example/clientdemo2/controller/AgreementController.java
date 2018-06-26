package com.example.clientdemo2.controller;

import com.example.clientdemo2.entity.Agreement;
import com.example.clientdemo2.mq.MessageSender;
import com.example.clientdemo2.service.AgreementService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: AgreementController
 * @Package com.example.clientdemo2.controller
 * @Description:
 * @Date 2018/6/1上午 11:22
 */
@RestController
public class AgreementController {
    private Logger logger = Logger.getLogger(AgreementController.class);

    @Autowired
    private AgreementService agreementService;

    @Autowired
    private MessageSender messageSender;

    @GetMapping("list")
    public List<Agreement> list() {
        return agreementService.list();
    }

    /*
     * 消费消息
     * */
    @PostMapping(value = "/mq/consume/{id}")
    public void mqConsume(@PathVariable("id") Long id) {
        logger.info("AgreementController接收为:" + id);
    }

    @PostMapping("/mq/list")
    public String mqList() {
        messageSender.sendMq(1L);
        return "success";
    }

    /**
     * 服务被调用
     * */
    @PostMapping("/feign/get/find")
    public Agreement findAgreement(@RequestBody Agreement agreement) {
        return agreementService.findAgreement(agreement.getId());
    }
}
