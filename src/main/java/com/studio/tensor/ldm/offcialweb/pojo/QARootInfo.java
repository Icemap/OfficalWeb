package com.studio.tensor.ldm.offcialweb.pojo;

import java.util.List;

public class QARootInfo {
    private Integer id;

    private String title;

    private List<QAInfo> qaInfo;
    
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

	public List<QAInfo> getQaInfo()
	{
		return qaInfo;
	}

	public void setQaInfo(List<QAInfo> qaInfo)
	{
		this.qaInfo = qaInfo;
	}
}