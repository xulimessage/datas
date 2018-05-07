package com.leo.datas.domain;

import javax.persistence.*;

@Entity
@Table(name = "gtj_fangwuDJlist")
public class FangWUInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String total;
    private String zt;
    private String fwid;
    private String ywh;
    private String qlr;
    private String zjhm;
    private String bdcdyh;
    private String bdczh;
    private String fwmj;
    private String fwxz;
    private String zl;
    private String cqly;
    private String sfzhm;
    private String xm;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getFwid() {
        return fwid;
    }

    public void setFwid(String fwid) {
        this.fwid = fwid;
    }

    public String getYwh() {
        return ywh;
    }

    public void setYwh(String ywh) {
        this.ywh = ywh;
    }

    public String getQlr() {
        return qlr;
    }

    public void setQlr(String qlr) {
        this.qlr = qlr;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getBdcdyh() {
        return bdcdyh;
    }

    public void setBdcdyh(String bdcdyh) {
        this.bdcdyh = bdcdyh;
    }

    public String getBdczh() {
        return bdczh;
    }

    public void setBdczh(String bdczh) {
        this.bdczh = bdczh;
    }

    public String getFwmj() {
        return fwmj;
    }

    public void setFwmj(String fwmj) {
        this.fwmj = fwmj;
    }

    public String getFwxz() {
        return fwxz;
    }

    public void setFwxz(String fwxz) {
        this.fwxz = fwxz;
    }

    public String getZl() {
        return zl;
    }

    public void setZl(String zl) {
        this.zl = zl;
    }

    public String getCqly() {
        return cqly;
    }

    public void setCqly(String cqly) {
        this.cqly = cqly;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Override
    public String toString() {
        return "FangWUInfo{" +
                "id=" + id +
                ", total='" + total + '\'' +
                ", zt='" + zt + '\'' +
                ", fwid='" + fwid + '\'' +
                ", ywh='" + ywh + '\'' +
                ", qlr='" + qlr + '\'' +
                ", zjhm='" + zjhm + '\'' +
                ", bdcdyh='" + bdcdyh + '\'' +
                ", bdczh='" + bdczh + '\'' +
                ", fwmj='" + fwmj + '\'' +
                ", fwxz='" + fwxz + '\'' +
                ", zl='" + zl + '\'' +
                ", cqly='" + cqly + '\'' +
                ", sfzhm='" + sfzhm + '\'' +
                ", xm='" + xm + '\'' +
                '}';
    }
}
