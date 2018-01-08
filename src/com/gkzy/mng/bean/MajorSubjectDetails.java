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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: MajorSubjectDetails 
 * @Description: 专业学科明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:08:36
 */

@Entity
@Table(name = "major_subject_details", catalog = "gkzy_db")
public class MajorSubjectDetails implements java.io.Serializable {

	private Integer msdId;
	private MajorSubjectsType majorSubjectsType;
	private String subjectDetail;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<AcedemyMajor> acedemyMajors = new ArrayList<AcedemyMajor>();
	private List<MajorInf> majorInfs = new ArrayList<MajorInf>();
	private List<AcademyAdvantageSubject> academyAdvantageSubjects = new ArrayList<AcademyAdvantageSubject>();

	public MajorSubjectDetails() {
	}

	public MajorSubjectDetails(MajorSubjectsType majorSubjectsType,
			String subjectDetail) {
		this.majorSubjectsType = majorSubjectsType;
		this.subjectDetail = subjectDetail;
	}

	public MajorSubjectDetails(MajorSubjectsType majorSubjectsType,
			String subjectDetail, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006,
			List<AcedemyMajor> acedemyMajors, List<MajorInf> majorInfs,
			List<AcademyAdvantageSubject> academyAdvantageSubjects) {
		this.majorSubjectsType = majorSubjectsType;
		this.subjectDetail = subjectDetail;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
		this.acedemyMajors = acedemyMajors;
		this.majorInfs = majorInfs;
		this.academyAdvantageSubjects = academyAdvantageSubjects;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "msd_id", unique = true, nullable = false)
	public Integer getMsdId() {
		return this.msdId;
	}

	public void setMsdId(Integer msdId) {
		this.msdId = msdId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mst_id", nullable = false)
	public MajorSubjectsType getMajorSubjectsType() {
		return this.majorSubjectsType;
	}

	public void setMajorSubjectsType(MajorSubjectsType majorSubjectsType) {
		this.majorSubjectsType = majorSubjectsType;
	}

	@Column(name = "subject_detail", nullable = false, length = 50)
	public String getSubjectDetail() {
		return this.subjectDetail;
	}

	public void setSubjectDetail(String subjectDetail) {
		this.subjectDetail = subjectDetail;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "majorSubjectDetails")
	public List<AcedemyMajor> getAcedemyMajors() {
		return this.acedemyMajors;
	}

	public void setAcedemyMajors(List<AcedemyMajor> acedemyMajors) {
		this.acedemyMajors = acedemyMajors;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "majorSubjectDetails")
	public List<MajorInf> getMajorInfs() {
		return this.majorInfs;
	}

	public void setMajorInfs(List<MajorInf> majorInfs) {
		this.majorInfs = majorInfs;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "majorSubjectDetails")
	public List<AcademyAdvantageSubject> getAcademyAdvantageSubjects() {
		return this.academyAdvantageSubjects;
	}

	public void setAcademyAdvantageSubjects(
			List<AcademyAdvantageSubject> academyAdvantageSubjects) {
		this.academyAdvantageSubjects = academyAdvantageSubjects;
	}

}