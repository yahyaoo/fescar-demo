package com.demo.provider.pojo.po;

/**
 * Title: DmDetail
 * Description:  TODO (这里用一句话描述这个类的作用)
 *
 * @author yuhong
 * @Company com.jdschool
 * @date 2019/2/2 16:58
 */
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