package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: RiskGrade 
 * @Description: 风险等级
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:12:50
 */
@Entity
@Table(name = "risk_grade", catalog = "gkzy_db")
public class RiskGrade implements java.io.Serializable {

	private Integer rdId;
	private String rdName;
	private Integer rdScale;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public RiskGrade() {
	}

	public RiskGrade(String rdName, Integer rdScale) {
		this.rdName = rdName;
		this.rdScale = rdScale;
	}

	public RiskGrade(String rdName, Integer rdScale, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006) {
		this.rdName = rdName;
		this.rdScale = rdScale;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rd_id", unique = true, nullable = false)
	public Integer getRdId() {
		return this.rdId;
	}

	public void setRdId(Integer rdId) {
		this.rdId = rdId;
	}

	@Column(name = "rd_name", nullable = false)
	public String getRdName() {
		return this.rdName;
	}

	public void setRdName(String rdName) {
		this.rdName = rdName;
	}

	@Column(name = "rd_scale", nullable = false)
	public Integer getRdScale() {
		return this.rdScale;
	}

	public void setRdScale(Integer rdScale) {
		this.rdScale = rdScale;
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