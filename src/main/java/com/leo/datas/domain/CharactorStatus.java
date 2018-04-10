package com.leo.datas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "charactorstatus")
public class CharactorStatus implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String Content;

    @Override
    public String toString() {
        return "CharactorStatus{" +
                "id=" + id +
                ", Content='" + Content + '\'' +
                ", IsDone=" + IsDone +
                '}';
    }

    public boolean isDone() {
        return IsDone;
    }

    public void setDone(boolean done) {
        IsDone = done;
    }

    private boolean IsDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }


}
