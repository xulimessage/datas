package com.leo.datas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "gaj_people")
public class Person implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String YHZGX_ZW;
	private String YHZGX;
	private String HYZK_ZW;
	private String CSDXZ;
	private String FWCS;
	private String QTDZ;
	private String JG_GJDQ_ZW;
	private String XM;
	private String CSD_GJDQ_ZW;
	private String ZY;
	private String MZ_ZW;
	private String HH;
	private String CSRQ;
	private String XB_ZW;
	private String PCSDM_ZW;
	private String WHCD_ZW;
	private String HJDZ;
	private String PCSDM;
	private String BYZK_ZW;

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", YHZGX_ZW='" + YHZGX_ZW + '\'' +
				", YHZGX='" + YHZGX + '\'' +
				", HYZK_ZW='" + HYZK_ZW + '\'' +
				", CSDXZ='" + CSDXZ + '\'' +
				", FWCS='" + FWCS + '\'' +
				", QTDZ='" + QTDZ + '\'' +
				", JG_GJDQ_ZW='" + JG_GJDQ_ZW + '\'' +
				", XM='" + XM + '\'' +
				", CSD_GJDQ_ZW='" + CSD_GJDQ_ZW + '\'' +
				", ZY='" + ZY + '\'' +
				", MZ_ZW='" + MZ_ZW + '\'' +
				", HH='" + HH + '\'' +
				", CSRQ='" + CSRQ + '\'' +
				", XB_ZW='" + XB_ZW + '\'' +
				", PCSDM_ZW='" + PCSDM_ZW + '\'' +
				", WHCD_ZW='" + WHCD_ZW + '\'' +
				", HJDZ='" + HJDZ + '\'' +
				", PCSDM='" + PCSDM + '\'' +
				", BYZK_ZW='" + BYZK_ZW + '\'' +
				", XZ='" + XZ + '\'' +
				", GMSFHM='" + GMSFHM + '\'' +
				", JG_SSQX_ZW='" + JG_SSQX_ZW + '\'' +
				", SG='" + SG + '\'' +
				", HSLBS='" + HSLBS + '\'' +
				", CYM='" + CYM + '\'' +
				", CSD_SSXQ_ZW='" + CSD_SSXQ_ZW + '\'' +
				", HKXZ='" + HKXZ + '\'' +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String XZ;
	private String GMSFHM;
	private String JG_SSQX_ZW;
	private String SG;
	private String HSLBS;
	private String CYM;
	private String CSD_SSXQ_ZW;
	private String HKXZ;
	public String getBYZK_ZW() {
		return BYZK_ZW;
	}
	public String getCSD_GJDQ_ZW() {
		return CSD_GJDQ_ZW;
	}
	public String getCSD_SSXQ_ZW() {
		return CSD_SSXQ_ZW;
	}
	public String getCSDXZ() {
		return CSDXZ;
	}
	public String getCSRQ() {
		return CSRQ;
	}
	public String getCYM() {
		return CYM;
	}
	public String getFWCS() {
		return FWCS;
	}
	public String getGMSFHM() {
		return GMSFHM;
	}
	public String getHH() {
		return HH;
	}
	public String getHJDZ() {
		return HJDZ;
	}
	public String getHKXZ() {
		return HKXZ;
	}
	public String getHSLBS() {
		return HSLBS;
	}
	public String getHYZK_ZW() {
		return HYZK_ZW;
	}
	public String getJG_GJDQ_ZW() {
		return JG_GJDQ_ZW;
	}
	public String getJG_SSQX_ZW() {
		return JG_SSQX_ZW;
	}
	public String getMZ_ZW() {
		return MZ_ZW;
	}
	public String getPCSDM() {
		return PCSDM;
	}
	public String getPCSDM_ZW() {
		return PCSDM_ZW;
	}
	public String getQTDZ() {
		return QTDZ;
	}
	public String getSG() {
		return SG;
	}
	public String getWHCD_ZW() {
		return WHCD_ZW;
	}
	public String getXB_ZW() {
		return XB_ZW;
	}
	public String getXM() {
		return XM;
	}
	public String getXZ() {
		return XZ;
	}
	public String getYHZGX() {
		return YHZGX;
	}
	public String getYHZGX_ZW() {
		return YHZGX_ZW;
	}
	public String getZY() {
		return ZY;
	}
	public void setBYZK_ZW(String bYZK_ZW) {
		BYZK_ZW = bYZK_ZW;
	}
	public void setCSD_GJDQ_ZW(String cSD_GJDQ_ZW) {
		CSD_GJDQ_ZW = cSD_GJDQ_ZW;
	}
	public void setCSD_SSXQ_ZW(String cSD_SSXQ_ZW) {
		CSD_SSXQ_ZW = cSD_SSXQ_ZW;
	}
	public void setCSDXZ(String cSDXZ) {
		CSDXZ = cSDXZ;
	}
	public void setCSRQ(String cSRQ) {
		CSRQ = cSRQ;
	}
	public void setCYM(String cYM) {
		CYM = cYM;
	}
	public void setFWCS(String fWCS) {
		FWCS = fWCS;
	}
	public void setGMSFHM(String gMSFHM) {
		GMSFHM = gMSFHM;
	}
	public void setHH(String hH) {
		HH = hH;
	}
	public void setHJDZ(String hJDZ) {
		HJDZ = hJDZ;
	}
	public void setHKXZ(String hKXZ) {
		HKXZ = hKXZ;
	}
	public void setHSLBS(String hSLBS) {
		HSLBS = hSLBS;
	}
	public void setHYZK_ZW(String hYZK_ZW) {
		HYZK_ZW = hYZK_ZW;
	}
	public void setJG_GJDQ_ZW(String jG_GJDQ_ZW) {
		JG_GJDQ_ZW = jG_GJDQ_ZW;
	}
	public void setJG_SSQX_ZW(String jG_SSQX_ZW) {
		JG_SSQX_ZW = jG_SSQX_ZW;
	}
	public void setMZ_ZW(String mZ_ZW) {
		MZ_ZW = mZ_ZW;
	}
	public void setPCSDM(String pCSDM) {
		PCSDM = pCSDM;
	}
	public void setPCSDM_ZW(String pCSDM_ZW) {
		PCSDM_ZW = pCSDM_ZW;
	}
	public void setQTDZ(String qTDZ) {
		QTDZ = qTDZ;
	}
	public void setSG(String sG) {
		SG = sG;
	}
	public void setWHCD_ZW(String wHCD_ZW) {
		WHCD_ZW = wHCD_ZW;
	}
	public void setXB_ZW(String xB_ZW) {
		XB_ZW = xB_ZW;
	}
	public void setXM(String xM) {
		XM = xM;
	}
	public void setXZ(String xZ) {
		XZ = xZ;
	}
	public void setYHZGX(String yHZGX) {
		YHZGX = yHZGX;
	}
	public void setYHZGX_ZW(String yHZGX_ZW) {
		YHZGX_ZW = yHZGX_ZW;
	}
	public void setZY(String zY) {
		ZY = zY;
	}


}
