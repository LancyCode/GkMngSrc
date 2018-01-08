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
 * @ClassName: AcademyAdmisInf 
 * @Description: 历年院校录取分数信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:24:36
 */

@Entity
@Table(name = "academy_admis_inf", catalog = "gkzy_db")
public class AcademyAdmisInf implements java.io.Serializable {


	private Integer aaiId;
	private AcademyBatch academyBatch;
	private String aaiYear;
	private Integer abatchId;
	private Integer category;
	private Double aaiHighestScore;
	private Double aaiAverageScore;
	private Double aaiLowestScore;
	private Double aaiDividingLine;
	private Integer aaiLowestPre;
	private Integer aaiHighestPre;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AcademyAdmisInf() {
	}

	public AcademyAdmisInf(AcademyBatch academyBatch, String aaiYear,
			Integer abatchId, Integer category, Double aaiHighestScore,
			Double aaiAverageScore, Double aaiLowestScore,
			Double aaiDividingLine, Integer aaiHighestPre) {
		this.academyBatch = academyBatch;
		this.aaiYear = aaiYear;
		this.abatchId = abatchId;
		this.category = category;
		this.aaiHighestScore = aaiHighestScore;
		this.aaiAverageScore = aaiAverageScore;
		this.aaiLowestScore = aaiLowestScore;
		this.aaiDividingLine = aaiDividingLine;
		this.aaiHighestPre = aaiHighestPre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aai_id", unique = true, nullable = false)
	public Integer getAaiId() {
		return this.aaiId;
	}

	public void setAaiId(Integer aaiId) {
		this.aaiId = aaiId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aai_id", unique = true, nullable = false, insertable = false, updatable = false)
	public AcademyBatch getAcademyBatch() {
		return this.academyBatch;
	}
	
	@JsonIgnore
	public void setAcademyBatch(AcademyBatch academyBatch) {
		this.academyBatch = academyBatch;
	}

	@Column(name = "aai_year", nullable = false)
	public String getAaiYear() {
		return this.aaiYear;
	}

	public void setAaiYear(String aaiYear) {
		this.aaiYear = aaiYear;
	}

	@Column(name = "abatch_id", nullable = false)
	public Integer getAbatchId() {
		return this.abatchId;
	}

	public void setAbatchId(Integer abatchId) {
		this.abatchId = abatchId;
	}

	@Column(name = "category", nullable = false)
	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	@Column(name = "aai_highestScore", nullable = false, precision = 22, scale = 0)
	public Double getAaiHighestScore() {
		return this.aaiHighestScore;
	}

	public void setAaiHighestScore(Double aaiHighestScore) {
		this.aaiHighestScore = aaiHighestScore;
	}

	@Column(name = "aai_averageScore", nullable = false, precision = 22, scale = 0)
	public Double getAaiAverageScore() {
		return this.aaiAverageScore;
	}

	public void setAaiAverageScore(Double aaiAverageScore) {
		this.aaiAverageScore = aaiAverageScore;
	}

	@Column(name = "aai_lowestScore", nullable = false, precision = 22, scale = 0)
	public Double getAaiLowestScore() {
		return this.aaiLowestScore;
	}

	public void setAaiLowestScore(Double aaiLowestScore) {
		this.aaiLowestScore = aaiLowestScore;
	}

	@Column(name = "aai_dividingLine", nullable = false, precision = 22, scale = 0)
	public Double getAaiDividingLine() {
		return this.aaiDividingLine;
	}

	public void setAaiDividingLine(Double aaiDividingLine) {
		this.aaiDividingLine = aaiDividingLine;
	}

	@Column(name = "aai_lowestPre")
	public Integer getAaiLowestPre() {
		return this.aaiLowestPre;
	}

	public void setAaiLowestPre(Integer aaiLowestPre) {
		this.aaiLowestPre = aaiLowestPre;
	}

	@Column(name = "aai_highestPre", nullable = false)
	public Integer getAaiHighestPre() {
		return this.aaiHighestPre;
	}

	public void setAaiHighestPre(Integer aaiHighestPre) {
		this.aaiHighestPre = aaiHighestPre;
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