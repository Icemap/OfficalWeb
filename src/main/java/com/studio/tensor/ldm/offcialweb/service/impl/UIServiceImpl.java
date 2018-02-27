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
import com.studio.tensor.ldm.offcialweb.pojo.HelpRootVideo;
import com.studio.tensor.ldm.offcialweb.pojo.HelpVideo;
import com.studio.tensor.ldm.offcialweb.pojo.ProductInfo;
import com.studio.tensor.ldm.offcialweb.pojo.QAInfo;
import com.studio.tensor.ldm.offcialweb.pojo.QARootInfo;
import com.studio.tensor.ldm.offcialweb.pojo.TypicalProgramInfo;
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

	public Boolean helpInfoDelete(Integer id)
	{
		return helpInfoMapper.deleteByPrimaryKey(id) == 1;
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

	public Boolean helpVideoInsert(HelpVideo helpVideo)
	{
		return helpVideoMapper.insertSelective(helpVideo) == 1;
	}

	public Boolean helpVideoUpdate(HelpVideo helpVideo)
	{
		return helpVideoMapper.updateByPrimaryKeySelective(helpVideo) == 1;
	}

	public Boolean helpVideoDelete(Integer id)
	{
		return helpVideoMapper.deleteByPrimaryKey(id) == 1;
	}
	
	public List<HelpRootVideo> helpVideoSelectTree()
	{
		List<HelpVideo> helpVideoList = helpVideoMapper.selectAll();
		
		List<HelpRootVideo> helpRootVideos = new ArrayList<>();
		for(HelpVideo hv : helpVideoList)
		{
			if(ByteBooleanUtils.byte2Boolean(hv.getIsRoot()))
			{
				HelpRootVideo hrv = new HelpRootVideo();
				hrv.setId(hv.getId());
				hrv.setTitle(hv.getTitle());
				hrv.setHelpVideo(new ArrayList<>());
				helpRootVideos.add(hrv);
			}
		}
		
		for(HelpVideo hv : helpVideoList)
		{
			if(!ByteBooleanUtils.byte2Boolean(hv.getIsRoot()))
			{
				for(int i = 0;i < helpRootVideos.size();i++)
				{
					if(helpRootVideos.get(i).getId().intValue() == hv.getBelongId())
					{
						helpRootVideos.get(i).getHelpVideo().add(hv);
					}
				}
			}
		}
		
		return helpRootVideos; 
	}

	public Boolean productInsert(ProductInfo productInfo)
	{
		return productInfoMapper.insertSelective(productInfo) == 1;
	}

	public Boolean productUpdate(ProductInfo productInfo)
	{
		return productInfoMapper.updateByPrimaryKeySelective(productInfo) == 1;
	}

	public Boolean productDelete(Integer id)
	{
		return productInfoMapper.deleteByPrimaryKey(id) == 1;
	}

	public List<ProductInfo> productSelectAll()
	{
		return productInfoMapper.selectAll();
	}
	
	public Boolean qaInsert(QAInfo qaInfo)
	{
		return qaInfoMapper.insertSelective(qaInfo) == 1;
	}

	public Boolean qaUpdate(QAInfo qaInfo)
	{
		return qaInfoMapper.updateByPrimaryKeySelective(qaInfo) == 1;
	}

	public Boolean qaDelete(Integer id)
	{
		return qaInfoMapper.deleteByPrimaryKey(id) == 1;
	}

	public List<QARootInfo> qaSelectTree()
	{
		List<QAInfo> qaList = qaInfoMapper.selectAll();
		
		List<QARootInfo> qaRootInfos = new ArrayList<>();
		for(QAInfo qa : qaList)
		{
			if(ByteBooleanUtils.byte2Boolean(qa.getIsRoot()))
			{
				QARootInfo qar = new QARootInfo();
				qar.setId(qa.getId());
				qar.setTitle(qa.getTitle());
				qar.setQaInfo(new ArrayList<>());
				qaRootInfos.add(qar);
			}
		}
		
		for(QAInfo qa : qaList)
		{
			if(!ByteBooleanUtils.byte2Boolean(qa.getIsRoot()))
			{
				for(int i = 0;i < qaRootInfos.size();i++)
				{
					if(qaRootInfos.get(i).getId().intValue() == qa.getBelongId())
					{
						qaRootInfos.get(i).getQaInfo().add(qa);
					}
				}
			}
		}
		
		return qaRootInfos;
	}

	public Boolean typicalProgramInsert(TypicalProgramInfo typicalProgramInfo)
	{
		return typicalProgramInfoMapper.insertSelective(typicalProgramInfo) == 1;
	}
	
	public Boolean typicalProgramUpdate(TypicalProgramInfo typicalProgramInfo)
	{
		return typicalProgramInfoMapper.updateByPrimaryKeySelective(typicalProgramInfo) == 1;
	}
	
	public Boolean typicalProgramDelete(Integer id)
	{
		return typicalProgramInfoMapper.deleteByPrimaryKey(id) == 1;
	}

	public List<TypicalProgramInfo> typicalProgramSelectAll()
	{
		return typicalProgramInfoMapper.selectAll();
	}
}
