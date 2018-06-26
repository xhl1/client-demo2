package com.example.clientdemo2.dao;

import com.example.clientdemo2.entity.Agreement;
import com.mdl.common.mapper.MdlMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AgreementDao
 * @Package com.example.clientdemo2.dao
 * @Description:
 * @Date 2018/6/1上午 11:19
 */
@Component
public interface AgreementDao extends MdlMapper<Agreement>{
    @Select(" SELECT * FROM t_group_agreement WHERE id=#{id}")
    Agreement findAgreement(@Param("id") Long id);
}
