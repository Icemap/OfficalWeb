package com.studio.tensor.ldm.offcialweb.dao;

import java.util.List;

import com.studio.tensor.ldm.offcialweb.pojo.CarouselPicInfo;

public interface CarouselPicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarouselPicInfo record);

    int insertSelective(CarouselPicInfo record);

    CarouselPicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarouselPicInfo record);

    int updateByPrimaryKey(CarouselPicInfo record);
    
    List<CarouselPicInfo> selectAll();
    
    List<CarouselPicInfo> selectByTag(String tag);
}