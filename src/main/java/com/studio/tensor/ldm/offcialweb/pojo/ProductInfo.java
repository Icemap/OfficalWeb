package com.studio.tensor.ldm.offcialweb.pojo;

import java.util.Date;

public class ProductInfo {
    private Integer id;

    private String title;

    private String des;

    private String jumpUrl;

    private Integer picSort;

    private String picUrl;

    private String downloadVersion;

    private Date downloadUpdateDate;

    private Double downloadSize;

    private String downloadPrice;

    private String downloadUrl;

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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl == null ? null : jumpUrl.trim();
    }

    public Integer getPicSort() {
        return picSort;
    }

    public void setPicSort(Integer picSort) {
        this.picSort = picSort;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getDownloadVersion() {
        return downloadVersion;
    }

    public void setDownloadVersion(String downloadVersion) {
        this.downloadVersion = downloadVersion == null ? null : downloadVersion.trim();
    }

    public Date getDownloadUpdateDate() {
        return downloadUpdateDate;
    }

    public void setDownloadUpdateDate(Date downloadUpdateDate) {
        this.downloadUpdateDate = downloadUpdateDate;
    }

    public Double getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Double downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getDownloadPrice() {
        return downloadPrice;
    }

    public void setDownloadPrice(String downloadPrice) {
        this.downloadPrice = downloadPrice == null ? null : downloadPrice.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }
}