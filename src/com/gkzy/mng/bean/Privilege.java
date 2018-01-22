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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "privilege")
public class Privilege {
	private int privilegeId;
    private String privilege;
    private String gdp001;
	private Date gdp002;
    private String gdp003;
    private Date gdp004;
    private int gdp005;
    private String gdp006;
    
    private List<AdminUser> adminUserList = new ArrayList<AdminUser>();
    private List<Privilegemng> privilegemngList = new ArrayList<Privilegemng>();
    
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
		this.privilege = privilege;
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
	public String getGdp006() {
		return gdp006;
	}
	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	
	@OneToMany(targetEntity=AdminUser.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="privilege")
	public List<AdminUser> getAdminUserList() {
		return adminUserList;
	}
	public void setAdminUserList(List<AdminUser> adminUserList) {
		this.adminUserList = adminUserList;
	}
	@ManyToMany(targetEntity=Privilegemng.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name = "privilege_privilegemng",
			   joinColumns = @JoinColumn(name = "privilege_id",referencedColumnName = "privilege_id"),
			   inverseJoinColumns = @JoinColumn(name = "privilegemng_id",referencedColumnName = "privilegemng_id")
			)
	public List<Privilegemng> getPrivilegemngList() {
		return privilegemngList;
	}
	public void setPrivilegemngList(List<Privilegemng> privilegemngList) {
		this.privilegemngList = privilegemngList;
	}
	
}
