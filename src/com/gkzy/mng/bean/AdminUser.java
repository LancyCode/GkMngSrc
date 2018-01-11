package com.gkzy.mng.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @ClassName:AdminUser
 * @Description:管理员信息
 * @author 江松林 
 * @date 2018年1月8日 上午10:00:40
 * 
 * */
@Entity
@Table(name="admin_user")
@Component
public class AdminUser {
	
	private Integer auId;
	private Integer cpiId;
	private String auAccount;
	private String auPwd;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	
	private Privilege privilege;
	
	private String password;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "au_id",unique = true,nullable = false)
	public Integer getAuId() {
		return auId;
	}

	public void setAuId(Integer auId) {
		this.auId = auId;
	}
	@Column(name = "cpi_id",nullable = false)
	public Integer getCpiId() {
		return cpiId;
	}

	public void setCpiId(Integer cpiId) {
		this.cpiId = cpiId;
	}
	@Column(name = "au_account",unique = true,nullable = false)
	public String getAuAccount() {
		return auAccount;
	}

	public void setAuAccount(String auAccount) {
		this.auAccount = auAccount;
	}

	@Column(name = "au_pwd",nullable = false)
	public String getAuPwd() {
		return auPwd;
	}

	public void setAuPwd(String auPwd) {
		this.auPwd = auPwd;
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
	@ManyToOne(targetEntity=Privilege.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="privilege_id",referencedColumnName = "privilege_id")
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	
}
