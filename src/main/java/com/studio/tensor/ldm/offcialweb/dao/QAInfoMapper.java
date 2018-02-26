package com.studio.tensor.ldm.offcialweb.dao;

import java.util.List;

import com.studio.tensor.ldm.offcialweb.pojo.QAInfo;

public interface QAInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QAInfo record);

    int insertSelective(QAInfo record);

    QAInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QAInfo record);

    int updateByPrimaryKey(QAInfo record);
    
    List<QAInfo> selectAll();
}