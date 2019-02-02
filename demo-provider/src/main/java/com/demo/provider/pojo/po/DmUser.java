package com.demo.provider.pojo.po;

/**
 * Title: DmUser
 * Description:  TODO (这里用一句话描述这个类的作用)
 *
 * @author yuhong
 * @Company com.jdschool
 * @date 2019/2/2 16:56
 */
public class DmUser {
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