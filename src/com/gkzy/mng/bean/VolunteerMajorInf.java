package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @ClassName: VolunteerMajorInf 
 * @Description: 用户志愿表专业信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:35:08
 */
@Entity
@Table(name = "volunteer_major_inf", catalog = "gkzy_db")
public class VolunteerMajorInf implements java.io.Serializable {

	private Integer vmiId;
	private VolunteerAcademyInf volunteerAcademyInf;
	private String majorName;
	private String majorCode;
	private String majorNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdo006;

	public VolunteerMajorInf() {
	}

	public VolunteerMajorInf(VolunteerAcademyInf volunteerAcademyInf,
			String majorName, String majorCode, String majorNum) {
		this.volunteerAcademyInf = volunteerAcademyInf;
		this.majorName = majorName;
		this.majorCode = majorCode;
		this.majorNum = majorNum;
	}

	public VolunteerMajorInf(VolunteerAcademyInf volunteerAcademyInf,
			String majorName, String majorCode, String majorNum, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdo006) {
		this.volunteerAcademyInf = volunteerAcademyInf;
		this.majorName = majorName;
		this.majorCode = majorCode;
		this.majorNum = majorNum;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdo006 = gdo006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vmi_id", unique = true, nullable = false)
	public Integer getVmiId() {
		return this.vmiId;
	}

	public void setVmiId(Integer vmiId) {
		this.vmiId = vmiId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vai_id", nullable = false)
	public VolunteerAcademyInf getVolunteerAcademyInf() {
		return this.volunteerAcademyInf;
	}

	public void setVolunteerAcademyInf(VolunteerAcademyInf volunteerAcademyInf) {
		this.volunteerAcademyInf = volunteerAcademyInf;
	}

	@Column(name = "major_name", nullable = false, length = 50)
	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Column(name = "major_code", nullable = false, length = 50)
	public String getMajorCode() {
		return this.majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	
	@Column(name = "major_num", nullable = false, length = 2)
	public String getMajorNum() {
		return this.majorNum;
	}

	public void setMajorNum(String majorNum) {
		this.majorNum = majorNum;
	}
	
	@Transient
	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@Transient
	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@Transient
	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@Transient
	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@Transient
	@Column(name = "gdp005")
	public Integer getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}
	
	@Transient
	@Column(name = "gdo006")
	public String getGdo006() {
		return this.gdo006;
	}

	public void setGdo006(String gdo006) {
		this.gdo006 = gdo006;
	}

}