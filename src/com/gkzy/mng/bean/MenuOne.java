package com.gkzy.mng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	private List<MenuTwo> menuTwoId = new ArrayList();;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "menuone_id",unique = true,nullable = false)
	private Integer getMenuOneId() {
		return menuOneId;
	}
	private void setMenuOneId(Integer menuOneId) {
		this.menuOneId = menuOneId;
	}
	
	@Column(name = "menu_name",nullable = false)
	private String getMenuName() {
		return menuName;
	}
	private void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	@Column(name = "menu_url")
	private String getMenuUrl() {
		return menuUrl;
	}
	private void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	@Column(name = "menu_num",nullable = false)
	private Integer getMenuNum() {
		return menuNum;
	}
	private void setMenuNum(Integer menuNum) {
		this.menuNum = menuNum;
	}

	@Column(name="gdp001")
	private String getGdp001() {
		return gdp001;
	}
	private void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@Column(name="gdp002")
	private Date getGdp002() {
		return gdp002;
	}
	private void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@Column(name="gdp003")
	private String getGdp003() {
		return gdp003;
	}
	
	private void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@Column(name="gdp004")
	private Date getGdp004() {
		return gdp004;
	}
	private void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@Column(name="gdp005")
	private Integer getGdp005() {
		return gdp005;
	}
	private void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}
	
	@Column(name="gdp006")
	private String getGdp006() {
		return gdp006;
	}
	private void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	@OneToMany(targetEntity=MenuTwo.class,mappedBy="menuone")
	public List<MenuTwo> getMenuTwoId() {
		return menuTwoId;
	}
	public void setMenuTwoId(List<MenuTwo> menuTwoId) {
		this.menuTwoId = menuTwoId;
	}
	
}
