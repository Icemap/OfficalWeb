package com.studio.tensor.ldm.offcialweb.dao;

import com.studio.tensor.ldm.offcialweb.pojo.TypicalProgramInfo;

public interface TypicalProgramInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypicalProgramInfo record);

    int insertSelective(TypicalProgramInfo record);

    TypicalProgramInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypicalProgramInfo record);

    int updateByPrimaryKey(TypicalProgramInfo record);
}