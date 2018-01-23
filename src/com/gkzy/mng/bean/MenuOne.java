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

/**
 * @ClassName:MenuOne
 * @Description:一级导航栏
 * @author 江松林 
 * @date 2018年1月8日 上午10:10:36
 * 
 * */
@Entity
@Table(name = "menuone")
public class MenuOne {
	private Integer menuOneId;
	private String menuName;
	private String menuUrl;
	private Integer menuNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "menuone_id",unique = true,nullable = false)
	public Integer getMenuOneId() {
		return menuOneId;
	}
	public void setMenuOneId(Integer menuOneId) {
		this.menuOneId = menuOneId;
	}
	@Column(name = "menu_name",nullable = false)
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	@Column(name = "menu_url")
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	@Column(name = "menu_num",nullable = false)
	public Integer getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(Integer menuNum) {
		this.menuNum = menuNum;
	}

	@Column(name="gdp001")
	public String getGdp001() {
		return gdp001;
	}
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@Column(name="gdp002")
	public Date getGdp002() {
		return gdp002;
	}
	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@Column(name="gdp003")
	public String getGdp003() {
		return gdp003;
	}
	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@Column(name="gdp004")
	public Date getGdp004() {
		return gdp004;
	}
	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@Column(name="gdp005")
	public Integer getGdp005() {
		return gdp005;
	}
	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}

	@Column(name="gdp006")
	public String getGdp006() {
		return gdp006;
	}
	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	
	private List<Privilegemng> privilegemngList = new ArrayList<Privilegemng>();
	

	
	
	
	
	
	
	
	
	@ManyToMany(targetEntity=Privilegemng.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name = "menuone_privilegemng",
    		   joinColumns = @JoinColumn(name = "menuone_id",referencedColumnName = "menuone_id"),
    		   inverseJoinColumns = @JoinColumn(name = "privilegemng_id",referencedColumnName = "privilegemng_id")
    		)
	public List<Privilegemng> getPrivilegemngList() {
		return privilegemngList;
	}
	public void setPrivilegemngList(List<Privilegemng> privilegemngList) {
		this.privilegemngList = privilegemngList;
	}
	
}
