package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: AcademyBatchDetails 
 * @Description: 院校批次明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:25:47
 */

@Entity
@Table(name = "academy_batch_details", catalog = "gkzy_db")
public class AcademyBatchDetails implements java.io.Serializable {


	private Integer abdId;
	private AcademyBatch academyBatch;
	private String abdName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AcademyBatchDetails() {
	}

	public AcademyBatchDetails(AcademyBatch academyBatch, String abdName) {
		this.academyBatch = academyBatch;
		this.abdName = abdName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "abd_id", unique = true, nullable = false)
	public Integer getAbdId() {
		return this.abdId;
	}

	public void setAbdId(Integer abdId) {
		this.abdId = abdId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "abatch_id", nullable = false)
	public AcademyBatch getAcademyBatch() {
		return this.academyBatch;
	}

	public void setAcademyBatch(AcademyBatch academyBatch) {
		this.academyBatch = academyBatch;
	}

	@Column(name = "abd_name", nullable = false, length = 50)
	public String getAbdName() {
		return this.abdName;
	}

	public void setAbdName(String abdName) {
		this.abdName = abdName;
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