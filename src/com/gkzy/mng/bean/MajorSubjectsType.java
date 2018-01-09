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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: MajorSubjectsType
 * @Description: 专业学科类型
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:10:43
 */

@Entity
@Table(name = "major_subjects_type", catalog = "gkzy_db")
public class MajorSubjectsType implements java.io.Serializable {

	private Integer mstId;
	private String subjectType;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<MajorSubjectDetails> majorSubjectDetailses = new ArrayList<MajorSubjectDetails>();

	public MajorSubjectsType() {
	}

	public MajorSubjectsType(String subjectType) {
		this.subjectType = subjectType;
	}

	public MajorSubjectsType(String subjectType, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006, List<MajorSubjectDetails> majorSubjectDetailses) {
		this.subjectType = subjectType;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
		this.majorSubjectDetailses = majorSubjectDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mst_id", unique = true, nullable = false)
	public Integer getMstId() {
		return this.mstId;
	}

	public void setMstId(Integer mstId) {
		this.mstId = mstId;
	}

	@Column(name = "subject_type", nullable = false, length = 50)
	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "majorSubjectsType")
	public List<MajorSubjectDetails> getMajorSubjectDetailses() {
		return this.majorSubjectDetailses;
	}

	public void setMajorSubjectDetailses(
			List<MajorSubjectDetails> majorSubjectDetailses) {
		this.majorSubjectDetailses = majorSubjectDetailses;
	}

}