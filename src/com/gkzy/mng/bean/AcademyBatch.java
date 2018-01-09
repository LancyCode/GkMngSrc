package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;
import java.util.ArrayList;
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
 * @ClassName: AcademyBatch 
 * @Description: 院校批次
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:25:30
 */

@Entity
@Table(name = "academy_batch", catalog = "gkzy_db")
public class AcademyBatch implements java.io.Serializable {


	private Integer abatchId;
	private String batchName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<AcademyBatchDetails> academyBatchDetailses = new ArrayList<AcademyBatchDetails>();
	private List<AcademyAdmisInf> academyAdmisInfs = new ArrayList<AcademyAdmisInf>();
	private List<BatchEntryscore> batchEntryscores = new ArrayList<BatchEntryscore>();

	public AcademyBatch() {
	}

	public AcademyBatch(String batchName) {
		this.batchName = batchName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "abatch_id", unique = true, nullable = false)
	public Integer getAbatchId() {
		return this.abatchId;
	}

	public void setAbatchId(Integer abatchId) {
		this.abatchId = abatchId;
	}

	@Column(name = "batch_name", nullable = false, length = 50)
	public String getBatchName() {
		return this.batchName;
	}
	
	
	public void setBatchName(String batchName) {
		this.batchName = batchName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyBatch")
	public List<AcademyBatchDetails> getAcademyBatchDetailses() {
		return this.academyBatchDetailses;
	}
	
	@JsonIgnore
	public void setAcademyBatchDetailses(
			List<AcademyBatchDetails> academyBatchDetailses) {
		this.academyBatchDetailses = academyBatchDetailses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyBatch")
	public List<AcademyAdmisInf> getAcademyAdmisInfs() {
		return this.academyAdmisInfs;
	}
	
	@JsonIgnore
	public void setAcademyAdmisInfs(List<AcademyAdmisInf> academyAdmisInfs) {
		this.academyAdmisInfs = academyAdmisInfs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyBatch")
	public List<BatchEntryscore> getBatchEntryscores() {
		return this.batchEntryscores;
	}
	
	@JsonIgnore
	public void setBatchEntryscores(List<BatchEntryscore> batchEntryscores) {
		this.batchEntryscores = batchEntryscores;
	}

}