package com.gkzy.mng.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "privilege")
public class Privilege {
    private Integer privilegeId;

    private String privilege;

    private Integer gdp001;

    private String gdp002;

    private Date gdp003;

    private String gdp004;

    private Date gdp005;

    private String gdp006;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "privilege_id")
    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
    @Column(name = "privilege")
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }
    @Column(name = "gdp001")
    public Integer getGdp001() {
        return gdp001;
    }

    public void setGdp001(Integer gdp001) {
        this.gdp001 = gdp001;
    }
    @Column(name = "gdp002")
    public String getGdp002() {
        return gdp002;
    }

    public void setGdp002(String gdp002) {
        this.gdp002 = gdp002 == null ? null : gdp002.trim();
    }
    @Column(name = "gdp003")
    public Date getGdp003() {
        return gdp003;
    }

    public void setGdp003(Date gdp003) {
        this.gdp003 = gdp003;
    }
    @Column(name = "gdp004")
    public String getGdp004() {
        return gdp004;
    }

    public void setGdp004(String gdp004) {
        this.gdp004 = gdp004 == null ? null : gdp004.trim();
    }
    @Column(name = "gdp005")
    public Date getGdp005() {
        return gdp005;
    }

    public void setGdp005(Date gdp005) {
        this.gdp005 = gdp005;
    }
    @Column(name = "gdp006")
    public String getGdp006() {
        return gdp006;
    }

    public void setGdp006(String gdp006) {
        this.gdp006 = gdp006 == null ? null : gdp006.trim();
    }
}