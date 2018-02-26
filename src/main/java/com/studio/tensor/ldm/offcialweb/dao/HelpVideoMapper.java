package com.studio.tensor.ldm.offcialweb.dao;

import java.util.List;

import com.studio.tensor.ldm.offcialweb.pojo.HelpVideo;

public interface HelpVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HelpVideo record);

    int insertSelective(HelpVideo record);

    HelpVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HelpVideo record);

    int updateByPrimaryKey(HelpVideo record);
    
    List<HelpVideo> selectAll();
}