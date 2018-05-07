package com.leo.datas.domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@DynamicUpdate
@Table(name = "charactorstatus")
public class CharactorStatus implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Override
    public String toString() {
        return "CharactorStatus{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", changhurenkouIsDone=" + changhurenkouIsDone +
                ", zanzhurenkouIsDone=" + zanzhurenkouIsDone +
                ", jiashirenIsDone=" + jiashirenIsDone +
                '}';
    }

    private String content;

    private boolean changhurenkouIsDone;

    private boolean zanzhurenkouIsDone;

    private  boolean jiashirenIsDone;

    public boolean isChanghurenkouIsDone() {
        return changhurenkouIsDone;
    }

    public void setChanghurenkouIsDone(boolean changhurenkouIsDone) {
        this.changhurenkouIsDone = changhurenkouIsDone;
    }

    public boolean isZanzhurenkouIsDone() {
        return zanzhurenkouIsDone;
    }

    public void setZanzhurenkouIsDone(boolean zanzhurenkouIsDone) {
        this.zanzhurenkouIsDone = zanzhurenkouIsDone;
    }

    public boolean isJiashirenIsDone() {
        return jiashirenIsDone;
    }

    public void setJiashirenIsDone(boolean jiashirenIsDone) {
        this.jiashirenIsDone = jiashirenIsDone;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
