package com.studio.tensor.ldm.offcialweb.dao;

import java.util.List;

import com.studio.tensor.ldm.offcialweb.pojo.Dist;

public interface DistMapper {
    int deleteByPrimaryKey(String name);

    int insert(Dist record);

    int insertSelective(Dist record);

    Dist selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Dist record);

    int updateByPrimaryKey(Dist record);
    
    List<Dist> selectAll();
}