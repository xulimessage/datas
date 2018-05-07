package com.leo.datas.domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@Table(name = "all_people")
public class Gmsfzh {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String XM;
    private String SFZHM;
    private int resource;
    private boolean status;
    private String birthday;
    private boolean fangwuxinxi_is_done;
    private boolean cheliangxinxi_is_done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getSFZHM() {
        return SFZHM;
    }

    public void setSFZHM(String SFZHM) {
        this.SFZHM = SFZHM;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isFangwuxinxi_is_done() {
        return fangwuxinxi_is_done;
    }

    public void setFangwuxinxi_is_done(boolean fangwuxinxi_is_done) {
        this.fangwuxinxi_is_done = fangwuxinxi_is_done;
    }

    public boolean isCheliangxinxi_is_done() {
        return cheliangxinxi_is_done;
    }

    public void setCheliangxinxi_is_done(boolean cheliangxinxi_is_done) {
        this.cheliangxinxi_is_done = cheliangxinxi_is_done;
    }

    @Override
    public String toString() {
        return "Gmsfzh{" +
                "id=" + id +
                ", XM='" + XM + '\'' +
                ", SFZHM='" + SFZHM + '\'' +
                ", resource=" + resource +
                ", status=" + status +
                ", birthday='" + birthday + '\'' +
                ", fangwuxinxi_is_done=" + fangwuxinxi_is_done +
                ", cheliangxinxi_is_done=" + cheliangxinxi_is_done +
                '}';
    }
}
