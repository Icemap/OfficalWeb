package com.studio.tensor.ldm.offcialweb.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.studio.tensor.ldm.offcialweb.pojo.CarouselPicInfo;
import com.studio.tensor.ldm.offcialweb.pojo.HelpInfo;
import com.studio.tensor.ldm.offcialweb.pojo.HelpVideo;
import com.studio.tensor.ldm.offcialweb.pojo.ProductInfo;
import com.studio.tensor.ldm.offcialweb.pojo.QAInfo;
import com.studio.tensor.ldm.offcialweb.pojo.TypicalProgramInfo;
import com.studio.tensor.ldm.offcialweb.service.impl.DistServiceImpl;
import com.studio.tensor.ldm.offcialweb.service.impl.UIServiceImpl;

@Controller
@RequestMapping("/ui")
public class UIController
{
	Gson gson = new Gson();
	
	@Autowired
	UIServiceImpl uiServiceImpl;
	
	@Autowired
	DistServiceImpl distServiceImpl;
	
	@ResponseBody
	@RequestMapping("/carousePic/insert")
	public Object carousePicInsert(String json)
	{
		CarouselPicInfo info = gson.fromJson(json, CarouselPicInfo.class);
		info.setTime(new Date());
		info.setId(null);
		return uiServiceImpl.carousePicInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/carousePic/update")
	public Object carousePicUpdate(String json)
	{
		CarouselPicInfo info = gson.fromJson(json, CarouselPicInfo.class);
		info.setTime(new Date());
		return uiServiceImpl.carousePicUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/carousePic/delete")
	public Object carousePicDelete(Integer id)
	{
		return uiServiceImpl.carousePicDelete(id);
	}
	
	@ResponseBody
	@RequestMapping("/carousePic/selectByTag")
	public Object carousePicSelectByTag(String tag)
	{
		return uiServiceImpl.carousePicSelectByTag(tag);
	}
	
	@ResponseBody
	@RequestMapping("/carousePic/selectAll")
	public Object carousePicSelectAll()
	{
		return uiServiceImpl.carousePicSelectAll();
	}
	
	@ResponseBody
	@RequestMapping("/helpInfo/insert")
	public Object helpInfoInsert(String json)
	{
		HelpInfo info = gson.fromJson(json, HelpInfo.class);
		info.setId(null);
		return uiServiceImpl.helpInfoInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/helpInfo/update")
	public Object helpInfoUpdate(String json)
	{
		HelpInfo info = gson.fromJson(json, HelpInfo.class);
		return uiServiceImpl.helpInfoUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/helpInfo/delete")
	public Object helpInfoDelete(Integer id)
	{
		return uiServiceImpl.helpInfoDelete(id);
	}

	@ResponseBody
	@RequestMapping("/helpInfo/getTree")
	public Object getHelpInfoTree()
	{
		return uiServiceImpl.helpInfoSelectTree();
	}
	
	@ResponseBody
	@RequestMapping("/helpVideo/insert")
	public Object helpVideoInsert(String json)
	{
		HelpVideo info = gson.fromJson(json, HelpVideo.class);
		info.setId(null);
		return uiServiceImpl.helpVideoInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/helpVideo/update")
	public Object helpVideoUpdate(String json)
	{
		HelpVideo info = gson.fromJson(json, HelpVideo.class);
		return uiServiceImpl.helpVideoUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/helpVideo/delete")
	public Object helpVideoDelete(Integer id)
	{
		return uiServiceImpl.helpInfoDelete(id);
	}

	@ResponseBody
	@RequestMapping("/helpVideo/getTree")
	public Object helpVideoSelectTree()
	{
		return uiServiceImpl.helpVideoSelectTree();
	}
	
	@ResponseBody
	@RequestMapping("/product/insert")
	public Object productInsert(String json)
	{
		ProductInfo info = gson.fromJson(json, ProductInfo.class);
		info.setId(null);
		info.setDownloadUpdateDate(new Date());
		return uiServiceImpl.productInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/product/update")
	public Object productUpdate(String json)
	{
		ProductInfo info = gson.fromJson(json, ProductInfo.class);
		info.setDownloadUpdateDate(new Date());
		return uiServiceImpl.productUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/product/delete")
	public Object productDelete(Integer id)
	{
		return uiServiceImpl.productDelete(id);
	}

	@ResponseBody
	@RequestMapping("/product/selectAll")
	public Object productSelectAll()
	{
		return uiServiceImpl.productSelectAll();
	}

	@ResponseBody
	@RequestMapping("/qa/insert")
	public Object qaInsert(String json)
	{
		QAInfo info = gson.fromJson(json, QAInfo.class);
		info.setId(null);
		return uiServiceImpl.qaInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/qa/update")
	public Object qaUpdate(String json)
	{
		QAInfo info = gson.fromJson(json, QAInfo.class);
		return uiServiceImpl.qaUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/qa/delete")
	public Object qaDelete(Integer id)
	{
		return uiServiceImpl.qaDelete(id);
	}

	@ResponseBody
	@RequestMapping("/qa/getTree")
	public Object qaSelectTree()
	{
		return uiServiceImpl.qaSelectTree();
	}

	@ResponseBody
	@RequestMapping("/typicalProgram/insert")
	public Object typicalProgramInsert(String json)
	{
		TypicalProgramInfo info = gson.fromJson(json, TypicalProgramInfo.class);
		info.setId(null);
		return uiServiceImpl.typicalProgramInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/typicalProgram/update")
	public Object typicalProgramUpdate(String json)
	{
		TypicalProgramInfo info = gson.fromJson(json, TypicalProgramInfo.class);
		return uiServiceImpl.typicalProgramUpdate(info);
	}
	
	@ResponseBody
	@RequestMapping("/typicalProgram/delete")
	public Object typicalProgramDelete(Integer id)
	{
		return uiServiceImpl.typicalProgramDelete(id);
	}

	@ResponseBody
	@RequestMapping("/typicalProgram/selectAll")
	public Object typicalProgramSelectAll()
	{
		return uiServiceImpl.typicalProgramSelectAll();
	}
	
	@ResponseBody
	@RequestMapping("/dist/get")
	public Object distGet(String name)
	{
		return distServiceImpl.getDist(name);
	}
	
	@ResponseBody
	@RequestMapping("/dist/update")
	public Object distUpdate(String name, String value)
	{
		return distServiceImpl.updateDist(name, value);
	}

	@ResponseBody
	@RequestMapping("/dist/selectAll")
	public Object distSelectAll()
	{
		return distServiceImpl.selectAll();
	}
}
