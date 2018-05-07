package com.leo.datas.domain;

import io.lettuce.core.dynamic.annotation.CommandNaming;

import javax.persistence.*;

@Entity
@Table(name = "jgj_gy_vehicle_api")
public class CheLiangInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String XH;
    private String HPZL;
    private String HPHM;
    private String SFZMHM;
    private String SFZMMC;
    private String SYR;
    private String CCDJRQ;
    private String ZT;
    private String SJHM;
    private String CLLX;
    private String CLPP1;
    private String CLXH;
    private String ZZCMC;
    private String GXRQ;
    private String HPQYSJ;
    private String ZSXZQH;
    private String ZSXXDZ;
    private String HDZK;
    private String sfzhm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXH() {
        return XH;
    }

    public void setXH(String XH) {
        this.XH = XH;
    }

    public String getHPZL() {
        return HPZL;
    }

    public void setHPZL(String HPZL) {
        this.HPZL = HPZL;
    }

    public String getHPHM() {
        return HPHM;
    }

    public void setHPHM(String HPHM) {
        this.HPHM = HPHM;
    }

    public String getSFZMHM() {
        return SFZMHM;
    }

    public void setSFZMHM(String SFZMHM) {
        this.SFZMHM = SFZMHM;
    }

    public String getSFZMMC() {
        return SFZMMC;
    }

    public void setSFZMMC(String SFZMMC) {
        this.SFZMMC = SFZMMC;
    }

    public String getSYR() {
        return SYR;
    }

    public void setSYR(String SYR) {
        this.SYR = SYR;
    }

    public String getCCDJRQ() {
        return CCDJRQ;
    }

    public void setCCDJRQ(String CCDJRQ) {
        this.CCDJRQ = CCDJRQ;
    }

    public String getZT() {
        return ZT;
    }

    public void setZT(String ZT) {
        this.ZT = ZT;
    }

    public String getSJHM() {
        return SJHM;
    }

    public void setSJHM(String SJHM) {
        this.SJHM = SJHM;
    }

    public String getCLLX() {
        return CLLX;
    }

    public void setCLLX(String CLLX) {
        this.CLLX = CLLX;
    }

    public String getCLPP1() {
        return CLPP1;
    }

    public void setCLPP1(String CLPP1) {
        this.CLPP1 = CLPP1;
    }

    public String getCLXH() {
        return CLXH;
    }

    public void setCLXH(String CLXH) {
        this.CLXH = CLXH;
    }

    public String getZZCMC() {
        return ZZCMC;
    }

    public void setZZCMC(String ZZCMC) {
        this.ZZCMC = ZZCMC;
    }

    public String getGXRQ() {
        return GXRQ;
    }

    public void setGXRQ(String GXRQ) {
        this.GXRQ = GXRQ;
    }

    public String getHPQYSJ() {
        return HPQYSJ;
    }

    public void setHPQYSJ(String HPQYSJ) {
        this.HPQYSJ = HPQYSJ;
    }

    public String getZSXZQH() {
        return ZSXZQH;
    }

    public void setZSXZQH(String ZSXZQH) {
        this.ZSXZQH = ZSXZQH;
    }

    public String getZSXXDZ() {
        return ZSXXDZ;
    }

    public void setZSXXDZ(String ZSXXDZ) {
        this.ZSXXDZ = ZSXXDZ;
    }

    public String getHDZK() {
        return HDZK;
    }

    public void setHDZK(String HDZK) {
        this.HDZK = HDZK;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    @Override
    public String toString() {
        return "CheLiangInfo{" +
                "id=" + id +
                ", XH='" + XH + '\'' +
                ", HPZL='" + HPZL + '\'' +
                ", HPHM='" + HPHM + '\'' +
                ", SFZMHM='" + SFZMHM + '\'' +
                ", SFZMMC='" + SFZMMC + '\'' +
                ", SYR='" + SYR + '\'' +
                ", CCDJRQ='" + CCDJRQ + '\'' +
                ", ZT='" + ZT + '\'' +
                ", SJHM='" + SJHM + '\'' +
                ", CLLX='" + CLLX + '\'' +
                ", CLPP1='" + CLPP1 + '\'' +
                ", CLXH='" + CLXH + '\'' +
                ", ZZCMC='" + ZZCMC + '\'' +
                ", GXRQ='" + GXRQ + '\'' +
                ", HPQYSJ='" + HPQYSJ + '\'' +
                ", ZSXZQH='" + ZSXZQH + '\'' +
                ", ZSXXDZ='" + ZSXXDZ + '\'' +
                ", HDZK='" + HDZK + '\'' +
                ", sfzhm='" + sfzhm + '\'' +
                '}';
    }
}
