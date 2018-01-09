package com.gkzy.mng.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName:AdminUser
 * @Description:管理员信息
 * @author 江松林 
 * @date 2018年1月8日 上午10:00:40
 * 
 * */
@Entity
@Table(name="admin_user")
public class AdminUser {
	
	private Integer auId;
	private Integer cpiId;
	private String auAccount;
	private String auPwd;
	private Integer privilegeId;
	private String cmmt;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "au_id",unique = true,nullable = false,columnDefinition="Integer DEFAULT NULL COMMENT '类型'")
	private Integer getAuId() {
		return auId;
	}
	private void setAuId(Integer auId) {
		this.auId = auId;
	}
	@Column(name = "cpi_id",nullable = false,columnDefinition="varchar(100) DEFAULT '' COMMENT '类型'")
	private Integer getCpiId() {
		return cpiId;
	}
	private void setCpiId(Integer cpiId) {
		this.cpiId = cpiId;
	}
	@Column(name = "au_account",unique = true,nullable = false)
	private String getAuAccount() {
		return auAccount;
	}
	private void setAuAccount(String auAccount) {
		this.auAccount = auAccount;
	}
	@Column(name = "au_pwd",nullable = false)
	private String getAuPwd() {
		return auPwd;
	}
	private void setAuPwd(String auPwd) {
		this.auPwd = auPwd;
	}
	
	@Column(name = "privilege_id",nullable = false)
	private Integer getPrivilegeId() {
		return privilegeId;
	}
	private void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
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
}
