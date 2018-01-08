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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: BatchEntryscore 
 * @Description: 历年批次录取分数线
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:23:54
 */
@Entity
@Table(name = "batch_entryscore", catalog = "gkzy_db")
public class BatchEntryscore implements java.io.Serializable {

	private Integer besId;
	private AcademyBatch academyBatch;
	private String besYear;
	private Double entryScore;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public BatchEntryscore() {
	}

	public BatchEntryscore(AcademyBatch academyBatch, String besYear,
			Double entryScore) {
		this.academyBatch = academyBatch;
		this.besYear = besYear;
		this.entryScore = entryScore;
	}

	public BatchEntryscore(AcademyBatch academyBatch, String besYear,
			Double entryScore, String gdp001, Date gdp002, String gdp003,
			Date gdp004, Integer gdp005, String gdp006) {
		this.academyBatch = academyBatch;
		this.besYear = besYear;
		this.entryScore = entryScore;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bes_id", unique = true, nullable = false)
	public Integer getBesId() {
		return this.besId;
	}

	public void setBesId(Integer besId) {
		this.besId = besId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "abatch_id", nullable = false)
	public AcademyBatch getAcademyBatch() {
		return this.academyBatch;
	}

	public void setAcademyBatch(AcademyBatch academyBatch) {
		this.academyBatch = academyBatch;
	}

	@Column(name = "bes_year", nullable = false)
	public String getBesYear() {
		return this.besYear;
	}

	public void setBesYear(String besYear) {
		this.besYear = besYear;
	}

	@Column(name = "entry_score", nullable = false, precision = 22, scale = 0)
	public Double getEntryScore() {
		return this.entryScore;
	}

	public void setEntryScore(Double entryScore) {
		this.entryScore = entryScore;
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