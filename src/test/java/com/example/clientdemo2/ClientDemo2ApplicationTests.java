package com.example.clientdemo2;

import com.example.clientdemo2.entity.Agreement;
import com.example.clientdemo2.http.HttpUtil;
import com.example.clientdemo2.service.AgreementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDemo2ApplicationTests {
    @Autowired
    private AgreementService agreementService;

    @Test
    public void contextLoads() {
        List<Agreement> list = agreementService.list();
        System.out.println(list);
    }

    @Test
    public void test001() {
        String url = "http://localhost:20004/test001";
        //String s = HttpUtil.httpClientSendPost(url, data);
        //String s = HttpUtil.httpURLSendPost(url, data);
        /*String s=HttpUtil.sendGet(url, "key=123");
        System.out.println(s);*/

        String sr=HttpUtil.sendPost(url, "key=123&v=456");
        System.out.println(sr);
    }

}
