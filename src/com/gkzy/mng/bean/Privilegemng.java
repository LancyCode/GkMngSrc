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
    private String gdp001;
    private Date gdp002;
    private String gdp003;
    private Date gdp004;
    private int gdp005;
	private String gdp006;
    
    private List<Privilege> privilegeList = new ArrayList<Privilege>();
    private List<MenuOne> menuOneList = new ArrayList<MenuOne>();

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "privilegemng_id")
    public Integer getPrivilegemngId() {
		return privilegemngId;
	}
	public void setPrivilegemngId(Integer privilegemngId) {
		this.privilegemngId = privilegemngId;
	}
	
	  
    @Column(name = "privilege_id")
	public Integer getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}

    @Column(name = "menuone_id")
	public Integer getMenuoneId() {
		return menuoneId;
	}
	public void setMenuoneId(Integer menuoneId) {
		this.menuoneId = menuoneId;
	}

    @Column(name = "privailege_state")
	public Integer getPrivilegeState() {
		return privilegeState;
	}
	public void setPrivilegeState(Integer privilegeState) {
		this.privilegeState = privilegeState;
	}

   
    @Column(name = "gdp001")
    public String getGdp001() {
		return gdp001;
	}
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	@Column(name = "gdp002")
	public Date getGdp002() {
		return gdp002;
	}
	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	@Column(name = "gdp003")
	public String getGdp003() {
		return gdp003;
	}
	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	@Column(name = "gdp004")
	public Date getGdp004() {
		return gdp004;
	}
	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	@Column(name = "gdp005")
	public int getGdp005() {
		return gdp005;
	}
	public void setGdp005(int gdp005) {
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