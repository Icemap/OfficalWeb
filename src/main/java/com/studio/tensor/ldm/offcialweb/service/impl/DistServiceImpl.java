package com.studio.tensor.ldm.offcialweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.tensor.ldm.offcialweb.dao.DistMapper;
import com.studio.tensor.ldm.offcialweb.pojo.Dist;

@Service
public class DistServiceImpl
{
	@Autowired
	DistMapper distMapper;
	
	public String getDist(String name)
	{
		String value = distMapper.selectByPrimaryKey(name).getValue();
		
		return value == null ? "" : value;
	}
	
	public Boolean updateDist(String name, String value)
	{
		Dist dist = new Dist();
		dist.setName(name);
		dist.setValue(value);
		return distMapper.updateByPrimaryKey(dist) == 1;
	}
	
	public List<Dist> selectAll()
	{
		return distMapper.selectAll();
	}
}
