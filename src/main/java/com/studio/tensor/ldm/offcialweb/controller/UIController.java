package com.studio.tensor.ldm.offcialweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.studio.tensor.ldm.offcialweb.pojo.CarouselPicInfo;
import com.studio.tensor.ldm.offcialweb.service.impl.UIServiceImpl;

@Controller
@RequestMapping("/ui")
public class UIController
{
	Gson gson = new Gson();
	
	@Autowired
	UIServiceImpl uiServiceImpl;
	
	@ResponseBody
	@RequestMapping("/carousePic/insert")
	public Object carousePicInsert(String json)
	{
		CarouselPicInfo info = gson.fromJson(json, CarouselPicInfo.class);
		return uiServiceImpl.carousePicInsert(info);
	}
	
	@ResponseBody
	@RequestMapping("/carousePic/update")
	public Object carousePicUpdate(String json)
	{
		CarouselPicInfo info = gson.fromJson(json, CarouselPicInfo.class);
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
	@RequestMapping("/helpInfo/getTree")
	public Object getHelpInfoTree()
	{
		return uiServiceImpl.helpInfoSelectTree();
	}
}
