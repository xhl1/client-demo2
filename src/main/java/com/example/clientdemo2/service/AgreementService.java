package com.example.clientdemo2.service;

import com.example.clientdemo2.dao.AgreementDao;
import com.example.clientdemo2.entity.Agreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AgreementService
 * @Package com.example.clientdemo2.service
 * @Description:
 * @Date 2018/6/1上午 11:20
 */
@Service
public class AgreementService {
    @Autowired
    private AgreementDao agreementDao;

    public List<Agreement> list() {
        return agreementDao.selectAll();
    }

    public Agreement findAgreement(Long id) {
        return agreementDao.findAgreement(id);
    }
}
