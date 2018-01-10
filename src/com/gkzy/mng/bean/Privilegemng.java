package com.gkzy.mng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "privilegemng")
public class Privilegemng {
    private Integer privilegemngId;
    private Integer privilegeId;
    private Integer menuoneId;
    private Integer privilegeState;
    private Integer gdp001;
    private String gdp002;
    private Date gdp003;
    private String gdp004;
    private Date gdp005;
    private String gdp006;
    
    private List<Privilege> privilegeList = new ArrayList<Privilege>();
    private List<MenuOne> menuOneList = new ArrayList<MenuOne>();

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "privilegemng_id")
    private Integer getPrivilegemngId() {
        return privilegemngId;
    }

    private void setPrivilegemngId(Integer privilegemngId) {
        this.privilegemngId = privilegemngId;
    }
    @Column(name = "privilege_id")
    private Integer getPrivilegeId() {
        return privilegeId;
    }

    private void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
    @Column(name = "menuone_id")
    private Integer getMenuoneId() {
        return menuoneId;
    }

    private void setMenuoneId(Integer menuoneId) {
        this.menuoneId = menuoneId;
    }
    @Column(name = "privailege_state")
    private Integer getPrivilegeState() {
        return privilegeState;
    }

    private void setPrivilegeState(Integer privilegeState) {
        this.privilegeState = privilegeState;
    }
    @Column(name = "gdp001")
    private Integer getGdp001() {
        return gdp001;
    }

    private void setGdp001(Integer gdp001) {
        this.gdp001 = gdp001;
    }
    @Column(name = "gdp002")
    private String getGdp002() {
        return gdp002;
    }

    private void setGdp002(String gdp002) {
        this.gdp002 = gdp002 == null ? null : gdp002.trim();
    }
    @Column(name = "gdp003")
    private Date getGdp003() {
        return gdp003;
    }

    private void setGdp003(Date gdp003) {
        this.gdp003 = gdp003;
    }
    @Column(name = "gdp004")
    private String getGdp004() {
        return gdp004;
    }

    private void setGdp004(String gdp004) {
        this.gdp004 = gdp004 == null ? null : gdp004.trim();
    }
    @Column(name = "gdp005")
    private Date getGdp005() {
        return gdp005;
    }

    private void setGdp005(Date gdp005) {
        this.gdp005 = gdp005;
    }
    @Column(name = "gdp006")
    private String getGdp006() {
        return gdp006;
    }

    private void setGdp006(String gdp006) {
        this.gdp006 = gdp006 == null ? null : gdp006.trim();
    }

    @ManyToMany(targetEntity=Privilege.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name = "privilege_privilegemng",
    		   joinColumns = @JoinColumn(name = "privilegemng_id",referencedColumnName = "privilegemng_id"),
    		   inverseJoinColumns = @JoinColumn(name = "privilege_id",referencedColumnName = "privilege_id")
    		)
	public List<Privilege> getPrivilegeList() {
		return privilegeList;
	}

	public void setPrivilegeList(List<Privilege> privilegeList) {
		this.privilegeList = privilegeList;
	}

	 @ManyToMany(targetEntity=MenuOne.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	 @JoinTable(name = "menuone_privilegemng",
	    		   joinColumns = @JoinColumn(name = "privilegemng_id",referencedColumnName = "privilegemng_id"),
	    		   inverseJoinColumns = @JoinColumn(name = "menuone_id",referencedColumnName = "menuone_id")
	    		)
	public List<MenuOne> getMenuOneList() {
		return menuOneList;
	}
	public void setMenuOneList(List<MenuOne> menuOneList) {
		this.menuOneList = menuOneList;
	}

}