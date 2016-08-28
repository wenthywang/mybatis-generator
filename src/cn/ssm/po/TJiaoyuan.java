package cn.ssm.po;

public class TJiaoyuan {
    private Integer jiaojuanId;

    private Integer stuId;

    private Integer shitiId;

    private Integer timuId;

    private String timuDaan;

    public Integer getJiaojuanId() {
        return jiaojuanId;
    }

    public void setJiaojuanId(Integer jiaojuanId) {
        this.jiaojuanId = jiaojuanId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getShitiId() {
        return shitiId;
    }

    public void setShitiId(Integer shitiId) {
        this.shitiId = shitiId;
    }

    public Integer getTimuId() {
        return timuId;
    }

    public void setTimuId(Integer timuId) {
        this.timuId = timuId;
    }

    public String getTimuDaan() {
        return timuDaan;
    }

    public void setTimuDaan(String timuDaan) {
        this.timuDaan = timuDaan == null ? null : timuDaan.trim();
    }
}