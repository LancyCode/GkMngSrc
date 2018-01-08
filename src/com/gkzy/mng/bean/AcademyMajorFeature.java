package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: AcademyMajorFeature 
 * @Description: 院校专业特色类型
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:37:57
 */

@Entity
@Table(name = "academy_major_feature", catalog = "gkzy_db")
public class AcademyMajorFeature implements java.io.Serializable {

	private Integer amfId;
	private String amfType;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<AcedemyMajor> acedemyMajors = new ArrayList<AcedemyMajor>();


	public AcademyMajorFeature() {
	}

	public AcademyMajorFeature(String amfType) {
		this.amfType = amfType;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "amf_id")
	public Integer getAmfId() {
		return this.amfId;
	}
	
	public void setAmfId(Integer amfId) {
		this.amfId = amfId;
	}

	@Column(name = "amf_type", nullable = false)
	public String getAmfType() {
		return this.amfType;
	}
	
	public void setAmfType(String amfType) {
		this.amfType = amfType;
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
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyMajorFeature")
	public List<AcedemyMajor> getAcedemyMajors() {
		return this.acedemyMajors;
	}
	
	public void setAcedemyMajors(List<AcedemyMajor> acedemyMajors) {
		this.acedemyMajors = acedemyMajors;
	}

}