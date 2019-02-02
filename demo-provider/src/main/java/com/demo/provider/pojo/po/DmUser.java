package com.demo.provider.pojo.po;

import java.io.Serializable;

public class DmUser implements Serializable {
    private static final long serialVersionUID = 5620609206524996229L;
    private Integer dmUserId;

    private String dmUserPassword;

    public Integer getDmUserId() {
        return dmUserId;
    }

    public void setDmUserId(Integer dmUserId) {
        this.dmUserId = dmUserId;
    }

    public String getDmUserPassword() {
        return dmUserPassword;
    }

    public void setDmUserPassword(String dmUserPassword) {
        this.dmUserPassword = dmUserPassword == null ? null : dmUserPassword.trim();
    }
}