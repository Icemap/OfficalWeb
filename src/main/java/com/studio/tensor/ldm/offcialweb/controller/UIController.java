package com.studio.tensor.ldm.offcialweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studio.tensor.ldm.offcialweb.service.impl.UIServiceImpl;

@Controller
@RequestMapping("/ui")
public class UIController
{
	@Autowired
	UIServiceImpl uiServiceImpl;
	
	@ResponseBody
	@RequestMapping("/helpInfo/getTree")
	public Object getHelpInfoTree()
	{
		return uiServiceImpl.helpInfoSelectTree();
	}
}
