package com.studio.tensor.ldm.offcialweb.pojo;

import java.util.List;

public class HelpRootInfo
{
	private Integer id;

    private String title;

    private List<HelpInfo> helpInfo;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

	public List<HelpInfo> getHelpInfo()
	{
		return helpInfo;
	}

	public void setHelpInfo(List<HelpInfo> helpInfo)
	{
		this.helpInfo = helpInfo;
	}
}
