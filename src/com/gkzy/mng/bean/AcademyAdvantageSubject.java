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
 * @ClassName: AcademyAdvantageSubject 
 * @Description: 院校优势学科
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:24:54
 */

@Entity
@Table(name = "academy_advantage_subject", catalog = "gkzy_db")
public class AcademyAdvantageSubject implements java.io.Serializable {

	private Integer aasId;
	private MajorSubjectDetails majorSubjectDetails;
	private AcademyInf academyInf;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AcademyAdvantageSubject() {
	}

	public AcademyAdvantageSubject(MajorSubjectDetails majorSubjectDetails,
			AcademyInf academyInf) {
		this.majorSubjectDetails = majorSubjectDetails;
		this.academyInf = academyInf;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aas_id", unique = true, nullable = false)
	public Integer getAasId() {
		return this.aasId;
	}

	public void setAasId(Integer aasId) {
		this.aasId = aasId;
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
	@JoinColumn(name = "academy_id", nullable = false)
	public AcademyInf getAcademyInf() {
		return this.academyInf;
	}
	
	@JsonIgnore
	public void setAcademyInf(AcademyInf academyInf) {
		this.academyInf = academyInf;
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
	public Integer getGdp005() {
		return this.gdp005;
	}
	
	@JsonIgnore
	public void setGdp005(Integer gdp005) {
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

}