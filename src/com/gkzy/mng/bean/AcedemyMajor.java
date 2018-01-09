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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @ClassName: AcedemyMajor 
 * @Description: 院校专业信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:21:09
 */
@Entity
@Table(name = "acedemy_major", catalog = "gkzy_db")
public class AcedemyMajor implements java.io.Serializable {


	private Integer amId;
	private MajorSubjectDetails majorSubjectDetails;
	private AcademyMajorFeature academyMajorFeature;
	private String majorName;
	private String majorDescription;
	private Integer isParallel;
	private String majorCode;
	private Integer majorCategory;
	private String careerProspects;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private String gdp005;
	private String gdp006;
	private List<AcademyMajorRequire> academyMajorRequires = new ArrayList<AcademyMajorRequire>();
	private List<AcademyMajorAdmis> academyMajorAdmises = new ArrayList<AcademyMajorAdmis>();

	public AcedemyMajor() {
	}

	public AcedemyMajor(MajorSubjectDetails majorSubjectDetails,
			AcademyMajorFeature academyMajorFeature, String majorName,
			String majorDescription, Integer isParallel, String majorCode,
			Integer majorCategory) {
		this.majorSubjectDetails = majorSubjectDetails;
		this.academyMajorFeature = academyMajorFeature;
		this.majorName = majorName;
		this.majorDescription = majorDescription;
		this.isParallel = isParallel;
		this.majorCode = majorCode;
		this.majorCategory = majorCategory;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "am_id", unique = true, nullable = false)
	public Integer getAmId() {
		return this.amId;
	}

	public void setAmId(Integer amId) {
		this.amId = amId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "msd_id", nullable = false)
	public MajorSubjectDetails getMajorSubjectDetails() {
		return this.majorSubjectDetails;
	}
	
	@JsonIgnore
	public void setMajorSubjectDetails(MajorSubjectDetails majorSubjectDetails) {
		this.majorSubjectDetails = majorSubjectDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "amf_id", nullable = false)
	public AcademyMajorFeature getAcademyMajorFeature() {
		return this.academyMajorFeature;
	}
	
	@JsonIgnore
	public void setAcademyMajorFeature(AcademyMajorFeature academyMajorFeature) {
		this.academyMajorFeature = academyMajorFeature;
	}

	@Column(name = "major_name", nullable = false, length = 50)
	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Column(name = "major_description", nullable = false)
	public String getMajorDescription() {
		return this.majorDescription;
	}

	public void setMajorDescription(String majorDescription) {
		this.majorDescription = majorDescription;
	}

	@Column(name = "isParallel", nullable = false)
	public Integer getIsParallel() {
		return this.isParallel;
	}

	public void setIsParallel(Integer isParallel) {
		this.isParallel = isParallel;
	}

	@Column(name = "major_code", nullable = false, length = 50)
	public String getMajorCode() {
		return this.majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	@Column(name = "major_category", nullable = false)
	public Integer getMajorCategory() {
		return this.majorCategory;
	}

	public void setMajorCategory(Integer majorCategory) {
		this.majorCategory = majorCategory;
	}

	@Column(name = "career_prospects")
	public String getCareerProspects() {
		return this.careerProspects;
	}

	public void setCareerProspects(String careerProspects) {
		this.careerProspects = careerProspects;
	}

	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}
	
	@JsonIgnore
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}
	
	@JsonIgnore
	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}

	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}
	
	@JsonIgnore
	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}
	
	@JsonIgnore
	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}

	@Column(name = "gdp005")
	public String getGdp005() {
		return this.gdp005;
	}
	
	@JsonIgnore
	public void setGdp005(String gdp005) {
		this.gdp005 = gdp005;
	}

	@Column(name = "gdp006")
	public String getGdp006() {
		return this.gdp006;
	}
	
	@JsonIgnore
	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "acedemyMajor")
	public List<AcademyMajorRequire> getAcademyMajorRequires() {
		return this.academyMajorRequires;
	}
	
	@JsonIgnore
	public void setAcademyMajorRequires(
			List<AcademyMajorRequire> academyMajorRequires) {
		this.academyMajorRequires = academyMajorRequires;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "acedemyMajor")
	public List<AcademyMajorAdmis> getAcademyMajorAdmises() {
		return this.academyMajorAdmises;
	}
	
	@JsonIgnore
	public void setAcademyMajorAdmises(
			List<AcademyMajorAdmis> academyMajorAdmises) {
		this.academyMajorAdmises = academyMajorAdmises;
	}

}