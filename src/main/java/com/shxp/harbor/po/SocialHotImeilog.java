package com.shxp.harbor.po;

import java.io.Serializable;
import java.util.Date;

/**
 * social_hot_imeilog
 * @author 
 */
public class SocialHotImeilog implements Serializable {
    private Integer id;

    /**
     * IMEI
     */
    private String imei;

    /**
     * IMSI
     */
    private String imsi;

    /**
     * 站点编号
     */
    private String wsiteid;

    /**
     * 代理编号
     */
    private String wagentid;

    /**
     * 采集时间
     */
    private Date starttime;

    /**
     * 归属地
     */
    private String location;

    /**
     * 手机型号
     */
    private String model;

    /**
     * 采集文件名称
     */
    private String filename;

    /**
     * 导入时间
     */
    private Date importtime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 采集派出所编号
     */
    private String policeStationid;

    /**
     * 采集区域编号（金山、闵行等）
     */
    private String policeAreaid;

    /**
     * 采集省份编号
     */
    private String policeProvinceid;

    /**
     * 是否统计0：为统计，1：统计
     */
    private String isstatic;

    private Integer istrans;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getWsiteid() {
        return wsiteid;
    }

    public void setWsiteid(String wsiteid) {
        this.wsiteid = wsiteid;
    }

    public String getWagentid() {
        return wagentid;
    }

    public void setWagentid(String wagentid) {
        this.wagentid = wagentid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getImporttime() {
        return importtime;
    }

    public void setImporttime(Date importtime) {
        this.importtime = importtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPoliceStationid() {
        return policeStationid;
    }

    public void setPoliceStationid(String policeStationid) {
        this.policeStationid = policeStationid;
    }

    public String getPoliceAreaid() {
        return policeAreaid;
    }

    public void setPoliceAreaid(String policeAreaid) {
        this.policeAreaid = policeAreaid;
    }

    public String getPoliceProvinceid() {
        return policeProvinceid;
    }

    public void setPoliceProvinceid(String policeProvinceid) {
        this.policeProvinceid = policeProvinceid;
    }

    public String getIsstatic() {
        return isstatic;
    }

    public void setIsstatic(String isstatic) {
        this.isstatic = isstatic;
    }

    public Integer getIstrans() {
        return istrans;
    }

    public void setIstrans(Integer istrans) {
        this.istrans = istrans;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SocialHotImeilog other = (SocialHotImeilog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImei() == null ? other.getImei() == null : this.getImei().equals(other.getImei()))
            && (this.getImsi() == null ? other.getImsi() == null : this.getImsi().equals(other.getImsi()))
            && (this.getWsiteid() == null ? other.getWsiteid() == null : this.getWsiteid().equals(other.getWsiteid()))
            && (this.getWagentid() == null ? other.getWagentid() == null : this.getWagentid().equals(other.getWagentid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getImporttime() == null ? other.getImporttime() == null : this.getImporttime().equals(other.getImporttime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPoliceStationid() == null ? other.getPoliceStationid() == null : this.getPoliceStationid().equals(other.getPoliceStationid()))
            && (this.getPoliceAreaid() == null ? other.getPoliceAreaid() == null : this.getPoliceAreaid().equals(other.getPoliceAreaid()))
            && (this.getPoliceProvinceid() == null ? other.getPoliceProvinceid() == null : this.getPoliceProvinceid().equals(other.getPoliceProvinceid()))
            && (this.getIsstatic() == null ? other.getIsstatic() == null : this.getIsstatic().equals(other.getIsstatic()))
            && (this.getIstrans() == null ? other.getIstrans() == null : this.getIstrans().equals(other.getIstrans()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImei() == null) ? 0 : getImei().hashCode());
        result = prime * result + ((getImsi() == null) ? 0 : getImsi().hashCode());
        result = prime * result + ((getWsiteid() == null) ? 0 : getWsiteid().hashCode());
        result = prime * result + ((getWagentid() == null) ? 0 : getWagentid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getImporttime() == null) ? 0 : getImporttime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPoliceStationid() == null) ? 0 : getPoliceStationid().hashCode());
        result = prime * result + ((getPoliceAreaid() == null) ? 0 : getPoliceAreaid().hashCode());
        result = prime * result + ((getPoliceProvinceid() == null) ? 0 : getPoliceProvinceid().hashCode());
        result = prime * result + ((getIsstatic() == null) ? 0 : getIsstatic().hashCode());
        result = prime * result + ((getIstrans() == null) ? 0 : getIstrans().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imei=").append(imei);
        sb.append(", imsi=").append(imsi);
        sb.append(", wsiteid=").append(wsiteid);
        sb.append(", wagentid=").append(wagentid);
        sb.append(", starttime=").append(starttime);
        sb.append(", location=").append(location);
        sb.append(", model=").append(model);
        sb.append(", filename=").append(filename);
        sb.append(", importtime=").append(importtime);
        sb.append(", remark=").append(remark);
        sb.append(", policeStationid=").append(policeStationid);
        sb.append(", policeAreaid=").append(policeAreaid);
        sb.append(", policeProvinceid=").append(policeProvinceid);
        sb.append(", isstatic=").append(isstatic);
        sb.append(", istrans=").append(istrans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}