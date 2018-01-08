package com.gkzy.mng.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: AdvertisementAcademy 
 * @Description: 院校广告
 * @author 共享智汇.赵仕建 
 * @date 2018年1月2日 上午11:28:38
 */
@Entity
@Table(name = "advertisement_academy", catalog = "gkzy_db")
public class AdvertisementAcademy implements java.io.Serializable {

	private Integer adaId;
	private AcademyInf academyInf;
	private String academyName;
	private String schoolBadge;
	private Integer adaPriority;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public AdvertisementAcademy() {
	}

	public AdvertisementAcademy(AcademyInf academyInf, String academyName, String schoolBadge, Integer adaPriority,
			Date createTime) {
		this.academyInf = academyInf;
		this.academyName = academyName;
		this.schoolBadge = schoolBadge;
		this.adaPriority = adaPriority;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ada_id", unique = true, nullable = false)
	public Integer getAdaId() {
		return this.adaId;
	}

	public void setAdaId(Integer adaId) {
		this.adaId = adaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "academy_id", nullable = false)
	public AcademyInf getAcademyInf() {
		return this.academyInf;
	}
	
	@JsonIgnore
	public void setAcademyInf(AcademyInf academyInf) {
		this.academyInf = academyInf;
	}

	@Column(name = "academy_name", nullable = false, length = 50)
	public String getAcademyName() {
		return this.academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	@Column(name = "school_badge", nullable = false)
	public String getSchoolBadge() {
		return this.schoolBadge;
	}

	public void setSchoolBadge(String schoolBadge) {
		this.schoolBadge = schoolBadge;
	}

	@Column(name = "ada_priority", nullable = false)
	public Integer getAdaPriority() {
		return this.adaPriority;
	}

	public void setAdaPriority(Integer adaPriority) {
		this.adaPriority = adaPriority;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Transient
	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}
	
	@JsonIgnore
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@Transient
	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}
	
	@JsonIgnore
	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}
	
	@Transient
	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}
	
	@JsonIgnore
	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Transient
	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}
	
	@JsonIgnore
	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}

	@Transient
	@Column(name = "gdp005")
	public Integer getGdp005() {
		return this.gdp005;
	}
	
	@JsonIgnore
	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}

	@Transient
	@Column(name = "gdp006")
	public String getGdp006() {
		return this.gdp006;
	}
	
	@JsonIgnore
	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}