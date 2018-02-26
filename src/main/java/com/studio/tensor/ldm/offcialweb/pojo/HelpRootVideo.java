package com.studio.tensor.ldm.offcialweb.pojo;

import java.util.List;

public class HelpRootVideo
{
	private Integer id;

    private String title;

    private List<HelpVideo> helpVideo;
    
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

	public List<HelpVideo> getHelpVideo()
	{
		return helpVideo;
	}

	public void setHelpVideo(List<HelpVideo> helpVideo)
	{
		this.helpVideo = helpVideo;
	}
}
