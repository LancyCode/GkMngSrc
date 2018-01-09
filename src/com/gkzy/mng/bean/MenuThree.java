package com.gkzy.mng.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @ClassName:MenuThree
 * @Description:三级导航栏
 * @author 江松林 
 * @date 2018年1月8日 上午10:11:30
 * 
 * */
@Entity
@Table(name = "menuthree")
public class MenuThree {
	private Integer menuThreeId;
	private String menuName;
	private String menuUrl;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	
	private MenuTwo menuTwo;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "menuthree_id",nullable = false,unique = true)
	private Integer getMenuThreeId() {
		return menuThreeId;
	}
	private void setMenuThreeId(Integer menuThreeId) {
		this.menuThreeId = menuThreeId;
	}
	
	
	@Column(name = "menu_name")
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
	
	@Column(name = "gdp001")
	private String getGdp001() {
		return gdp001;
	}
	private void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@Column(name = "gdp002")
	private Date getGdp002() {
		return gdp002;
	}
	private void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@Column(name = "gdp003")
	private String getGdp003() {
		return gdp003;
	}
	private void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@Column(name = "gdp004")
	private Date getGdp004() {
		return gdp004;
	}
	private void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@Column(name = "gdp005")
	private Integer getGdp005() {
		return gdp005;
	}
	private void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}
	
	@Column(name = "gdp006")
	private String getGdp006() {
		return gdp006;
	}
	private void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	@ManyToOne(targetEntity=MenuTwo.class)
	@JoinColumn(name = "menutwo_id",referencedColumnName = "menutwo_id")
	public MenuTwo getMenutwo() {
		return menuTwo;
	}
	public void setMenutwo(MenuTwo menutwo) {
		this.menuTwo = menutwo;
	}
	
}
