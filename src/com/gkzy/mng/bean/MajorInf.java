package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: MajorInf 
 * @Description: 专业信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:07:05
 */

@Entity
@Table(name = "major_inf", catalog = "gkzy_db")
public class MajorInf implements java.io.Serializable {

	private Integer majorId;
	private MajorSubjectDetails majorSubjectDetails;
	private String majorName;
	private String majorDecription;
	private String majorCareer;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public MajorInf() {
	}

	public MajorInf(MajorSubjectDetails majorSubjectDetails, String majorName,
			String majorDecription, String majorCareer) {
		this.majorSubjectDetails = majorSubjectDetails;
		this.majorName = majorName;
		this.majorDecription = majorDecription;
		this.majorCareer = majorCareer;
	}

	public MajorInf(MajorSubjectDetails majorSubjectDetails, String majorName,
			String majorDecription, String majorCareer, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006) {
		this.majorSubjectDetails = majorSubjectDetails;
		this.majorName = majorName;
		this.majorDecription = majorDecription;
		this.majorCareer = majorCareer;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "major_id", unique = true, nullable = false)
	public Integer getMajorId() {
		return this.majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "msd_id", nullable = false)
	public MajorSubjectDetails getMajorSubjectDetails() {
		return this.majorSubjectDetails;
	}

	public void setMajorSubjectDetails(MajorSubjectDetails majorSubjectDetails) {
		this.majorSubjectDetails = majorSubjectDetails;
	}

	@Column(name = "major_name", nullable = false, length = 50)
	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Column(name = "major_decription", nullable = false)
	public String getMajorDecription() {
		return this.majorDecription;
	}

	public void setMajorDecription(String majorDecription) {
		this.majorDecription = majorDecription;
	}

	@Column(name = "major_career", nullable = false)
	public String getMajorCareer() {
		return this.majorCareer;
	}

	public void setMajorCareer(String majorCareer) {
		this.majorCareer = majorCareer;
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