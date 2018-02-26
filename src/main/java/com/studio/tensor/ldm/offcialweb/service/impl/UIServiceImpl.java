package com.studio.tensor.ldm.offcialweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.tensor.ldm.offcialweb.dao.CarouselPicInfoMapper;
import com.studio.tensor.ldm.offcialweb.dao.HelpInfoMapper;
import com.studio.tensor.ldm.offcialweb.dao.HelpVideoMapper;
import com.studio.tensor.ldm.offcialweb.dao.ProductInfoMapper;
import com.studio.tensor.ldm.offcialweb.dao.QAInfoMapper;
import com.studio.tensor.ldm.offcialweb.dao.TypicalProgramInfoMapper;
import com.studio.tensor.ldm.offcialweb.pojo.CarouselPicInfo;
import com.studio.tensor.ldm.offcialweb.pojo.HelpInfo;
import com.studio.tensor.ldm.offcialweb.pojo.HelpRootInfo;
import com.studio.tensor.ldm.offcialweb.utils.ByteBooleanUtils;

@Service
public class UIServiceImpl
{
	@Autowired
	CarouselPicInfoMapper carouselPicInfoMapper;
	
	@Autowired
	HelpInfoMapper helpInfoMapper;
	
	@Autowired
	HelpVideoMapper helpVideoMapper;
	
	@Autowired
	ProductInfoMapper productInfoMapper;
	
	@Autowired
	QAInfoMapper qaInfoMapper;
	
	@Autowired
	TypicalProgramInfoMapper typicalProgramInfoMapper;
	
	public Boolean carousePicInsert(CarouselPicInfo info)
	{
		return carouselPicInfoMapper.insertSelective(info) == 1;
	}
	
	public Boolean carousePicUpdate(CarouselPicInfo info)
	{
		return carouselPicInfoMapper.updateByPrimaryKeySelective(info) == 1;
	}
	
	public Boolean carousePicDelete(Integer id)
	{
		return carouselPicInfoMapper.deleteByPrimaryKey(id) == 1;
	}
	
	public List<CarouselPicInfo> carousePicSelectByTag(String tag)
	{
		return carouselPicInfoMapper.selectByTag(tag);
	}
	
	public List<CarouselPicInfo> carousePicSelectAll()
	{
		return carouselPicInfoMapper.selectAll();
	}
	
	public Boolean helpInfoInsert(HelpInfo helpInfo)
	{
		return helpInfoMapper.insertSelective(helpInfo) == 1;
	}

	public Boolean helpInfoUpdate(HelpInfo helpInfo)
	{
		return helpInfoMapper.updateByPrimaryKeySelective(helpInfo) == 1;
	}

	public List<HelpRootInfo> helpInfoSelectTree()
	{
		List<HelpInfo> helpInfoList = helpInfoMapper.selectAll();
		
		List<HelpRootInfo> helpRootInfos = new ArrayList<>();
		for(HelpInfo hi : helpInfoList)
		{
			if(ByteBooleanUtils.byte2Boolean(hi.getIsRoot()))
			{
				HelpRootInfo hri = new HelpRootInfo();
				hri.setId(hi.getId());
				hri.setTitle(hi.getTitle());
				hri.setHelpInfo(new ArrayList<>());
				helpRootInfos.add(hri);
			}
		}
		
		for(HelpInfo hi : helpInfoList)
		{
			if(!ByteBooleanUtils.byte2Boolean(hi.getIsRoot()))
			{
				for(int i = 0;i < helpRootInfos.size();i++)
				{
					if(helpRootInfos.get(i).getId().intValue() == hi.getBelongId())
					{
						helpRootInfos.get(i).getHelpInfo().add(hi);
					}
				}
			}
		}
		
		return helpRootInfos;
	}
}
