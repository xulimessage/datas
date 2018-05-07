package com.leo.datas.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "gongan")
public class ZuRquestPara implements Serializable{
    private String url;
    private String appkey;
    private String appid;
    private String spendId;
    private String sendOrder;


    private String xm;
    private String gmsfhm;
    private String type;
    private String pageSize;
    private boolean isDone;

    @Override
    public String toString() {
        return "ZuRquestPara{" +
                "url='" + url + '\'' +
                ", appkey='" + appkey + '\'' +
                ", appid='" + appid + '\'' +
                ", spendId='" + spendId + '\'' +
                ", sendOrder='" + sendOrder + '\'' +
                ", xm='" + xm + '\'' +
                ", gmsfhm='" + gmsfhm + '\'' +
                ", type='" + type + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", isDone=" + isDone +
                ", pageN='" + pageN + '\'' +
                '}';
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSpendId() {
        return spendId;
    }

    public void setSpendId(String spendId) {
        this.spendId = spendId;
    }

    public String getSendOrder() {
        return sendOrder;
    }

    public void setSendOrder(String sendOrder) {
        this.sendOrder = sendOrder;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getGmsfhm() {
        return gmsfhm;
    }

    public void setGmsfhm(String gmsfhm) {
        this.gmsfhm = gmsfhm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageN() {
        return pageN;
    }

    public void setPageN(String pageN) {
        this.pageN = pageN;
    }

    private String pageN;

}
