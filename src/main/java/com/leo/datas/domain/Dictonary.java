package com.leo.datas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "interface_directory")
public class Dictonary implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int parent_id;
    private int level_id;
    private String interface_url;
    private String appid;
    private boolean is_provide;
    private boolean is_exits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }

    public String getInterface_url() {
        return interface_url;
    }

    public void setInterface_url(String interface_url) {
        this.interface_url = interface_url;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public boolean isIs_provide() {
        return is_provide;
    }

    public void setIs_provide(boolean is_provide) {
        this.is_provide = is_provide;
    }

    public boolean isIs_exits() {
        return is_exits;
    }

    public void setIs_exits(boolean is_exits) {
        this.is_exits = is_exits;
    }

    @Override
    public String toString() {
        return "Dictonary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", level_id=" + level_id +
                ", interface_url='" + interface_url + '\'' +
                ", appid='" + appid + '\'' +
                ", is_provide=" + is_provide +
                ", is_exits=" + is_exits +
                '}';
    }
}
