package com.gkzy.mng.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName:MenuTwo
 * @Description:二级导航栏
 * @author 江松林 
 * @date 2018年1月8日 上午10:15:39
 * 
 * */
@Entity
@Table(name = "menttwo")
public class MenuTwo {
	public Integer menuTwoId;
	public Integer menuOneId;
	public String menuName;
	public String menuUrl;
	public String gdp001;
	public Date gdp002;
	public String gdp003;
	public Date gdp004;
	public Integer gdp005;
	public String gdp006;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "menutwo_id",unique = true,nullable = false)
	public Integer getMenuTwoId() {
		return menuTwoId;
	}
	public void setMenuTwoId(Integer menuTwoId) {
		this.menuTwoId = menuTwoId;
	}
	
	@Column(name = "menuone_id")
	public Integer getMenuOneId() {
		return menuOneId;
	}
	public void setMenuOneId(Integer menuOneId) {
		this.menuOneId = menuOneId;
	}
	
	@Column(name = "menu_name")
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
	public Integer getGdp005() {
		return gdp005;
	}
	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}
	
	@Column(name = "gdp006")
	public String getGdp006() {
		return gdp006;
	}
	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	
}
