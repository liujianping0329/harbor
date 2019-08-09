package com.shxp.harbor.po;

import java.io.Serializable;

/**
 * social_site_info
 * @author 
 */
public class SocialSiteInfo implements Serializable {
    /**
     * 站点编号
     */
    private String siteId;

    /**
     * 站点名称
     */
    private String siteName;

    /**
     * 站点X坐标
     */
    private String siteX;

    /**
     * 站点Y坐标
     */
    private String siteY;

    /**
     * 父节点编号
     */
    private String parentid;

    /**
     * 站点类型0：表示省份，1：表示区域，2：表示站点，3：表示站点详情点位
     */
    private String siteType;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 端口
     */
    private String port;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 今天采集数量
     */
    private Long numToday;

    /**
     * 全部采集数量
     */
    private Long numTotal;

    private String lac;

    private String agentid;

    private static final long serialVersionUID = 1L;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteX() {
        return siteX;
    }

    public void setSiteX(String siteX) {
        this.siteX = siteX;
    }

    public String getSiteY() {
        return siteY;
    }

    public void setSiteY(String siteY) {
        this.siteY = siteY;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getNumToday() {
        return numToday;
    }

    public void setNumToday(Long numToday) {
        this.numToday = numToday;
    }

    public Long getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(Long numTotal) {
        this.numTotal = numTotal;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
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
        SocialSiteInfo other = (SocialSiteInfo) that;
        return (this.getSiteId() == null ? other.getSiteId() == null : this.getSiteId().equals(other.getSiteId()))
            && (this.getSiteName() == null ? other.getSiteName() == null : this.getSiteName().equals(other.getSiteName()))
            && (this.getSiteX() == null ? other.getSiteX() == null : this.getSiteX().equals(other.getSiteX()))
            && (this.getSiteY() == null ? other.getSiteY() == null : this.getSiteY().equals(other.getSiteY()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getSiteType() == null ? other.getSiteType() == null : this.getSiteType().equals(other.getSiteType()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getNumToday() == null ? other.getNumToday() == null : this.getNumToday().equals(other.getNumToday()))
            && (this.getNumTotal() == null ? other.getNumTotal() == null : this.getNumTotal().equals(other.getNumTotal()))
            && (this.getLac() == null ? other.getLac() == null : this.getLac().equals(other.getLac()))
            && (this.getAgentid() == null ? other.getAgentid() == null : this.getAgentid().equals(other.getAgentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        result = prime * result + ((getSiteName() == null) ? 0 : getSiteName().hashCode());
        result = prime * result + ((getSiteX() == null) ? 0 : getSiteX().hashCode());
        result = prime * result + ((getSiteY() == null) ? 0 : getSiteY().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getSiteType() == null) ? 0 : getSiteType().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getNumToday() == null) ? 0 : getNumToday().hashCode());
        result = prime * result + ((getNumTotal() == null) ? 0 : getNumTotal().hashCode());
        result = prime * result + ((getLac() == null) ? 0 : getLac().hashCode());
        result = prime * result + ((getAgentid() == null) ? 0 : getAgentid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteId=").append(siteId);
        sb.append(", siteName=").append(siteName);
        sb.append(", siteX=").append(siteX);
        sb.append(", siteY=").append(siteY);
        sb.append(", parentid=").append(parentid);
        sb.append(", siteType=").append(siteType);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", phone=").append(phone);
        sb.append(", numToday=").append(numToday);
        sb.append(", numTotal=").append(numTotal);
        sb.append(", lac=").append(lac);
        sb.append(", agentid=").append(agentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}