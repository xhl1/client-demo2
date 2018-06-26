package com.example.clientdemo2.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: Agreement
 * @Package com.example.clientdemo2.entity
 * @Description:
 * @Date 2018/6/1上午 11:12
 */
@Data
@Table(name = "t_group_agreement")
public class Agreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long groupId;
    private Integer agreementStatus;
    private Long creatorId;
    private String creatorName;
    private Long createTime;
    private Long updateTime;

}
