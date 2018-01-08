package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: UserVolunteerAdmit 
 * @Description: 用户志愿录取情况
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:25:58
 */

@Entity
@Table(name = "user_volunteer_admit", catalog = "gkzy_db")
public class UserVolunteerAdmit implements java.io.Serializable {

	private Integer uvaId;
	private GkzyUser gkzyUser;
	private String vadAcademy;
	private String vadMajor;
	private String vadYear;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public UserVolunteerAdmit() {
	}

	public UserVolunteerAdmit(GkzyUser gkzyUser, String vadAcademy,
			String vadMajor, String vadYear) {
		this.gkzyUser = gkzyUser;
		this.vadAcademy = vadAcademy;
		this.vadMajor = vadMajor;
		this.vadYear = vadYear;
	}

	public UserVolunteerAdmit(GkzyUser gkzyUser, String vadAcademy,
			String vadMajor, String vadYear, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.gkzyUser = gkzyUser;
		this.vadAcademy = vadAcademy;
		this.vadMajor = vadMajor;
		this.vadYear = vadYear;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "uva_id", unique = true, nullable = false)
	public Integer getUvaId() {
		return this.uvaId;
	}

	public void setUvaId(Integer uvaId) {
		this.uvaId = uvaId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}

	@Column(name = "vad_academy", nullable = false, length = 50)
	public String getVadAcademy() {
		return this.vadAcademy;
	}

	public void setVadAcademy(String vadAcademy) {
		this.vadAcademy = vadAcademy;
	}

	@Column(name = "vad_major", nullable = false, length = 50)
	public String getVadMajor() {
		return this.vadMajor;
	}

	public void setVadMajor(String vadMajor) {
		this.vadMajor = vadMajor;
	}

	@Column(name = "vad_year", nullable = false, length = 50)
	public String getVadYear() {
		return this.vadYear;
	}

	public void setVadYear(String vadYear) {
		this.vadYear = vadYear;
	}
	
	@JsonIgnore
	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@JsonIgnore
	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@JsonIgnore
	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@JsonIgnore
	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@JsonIgnore
	@Column(name = "gdp005")
	public Integer getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}
	
	@JsonIgnore
	@Column(name = "gdp006")
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}