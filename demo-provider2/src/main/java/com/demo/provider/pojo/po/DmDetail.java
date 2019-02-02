package com.demo.provider.pojo.po;

public class DmDetail {
    private Integer dmDetailId;

    private String dmDetailName;

    private Boolean dmDetailGender;

    public Integer getDmDetailId() {
        return dmDetailId;
    }

    public void setDmDetailId(Integer dmDetailId) {
        this.dmDetailId = dmDetailId;
    }

    public String getDmDetailName() {
        return dmDetailName;
    }

    public void setDmDetailName(String dmDetailName) {
        this.dmDetailName = dmDetailName == null ? null : dmDetailName.trim();
    }

    public Boolean getDmDetailGender() {
        return dmDetailGender;
    }

    public void setDmDetailGender(Boolean dmDetailGender) {
        this.dmDetailGender = dmDetailGender;
    }
}