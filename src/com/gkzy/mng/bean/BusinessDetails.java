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
 * @ClassName: BusinessDetails 
 * @Description: 业务明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:24:42
 */
@Entity
@Table(name = "business_details", catalog = "gkzy_db")
public class BusinessDetails implements java.io.Serializable {

	private Integer bdId;
	private String businessName;
	private String businessIntroduce;
	private Integer businessState;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<ExponeDetails> exponeDetailses = new ArrayList<ExponeDetails>();
	private List<ExpthreeDetails> expthreeDetailses = new ArrayList<ExpthreeDetails>();

	public BusinessDetails() {
	}

	public BusinessDetails(String businessName, String businessIntroduce,
			Integer businessState) {
		this.businessName = businessName;
		this.businessIntroduce = businessIntroduce;
		this.businessState = businessState;
	}

	public BusinessDetails(String businessName, String businessIntroduce,
			Integer businessState, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006,
			List<ExponeDetails> exponeDetailses,
			List<ExpthreeDetails> expthreeDetailses) {
		this.businessName = businessName;
		this.businessIntroduce = businessIntroduce;
		this.businessState = businessState;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
		this.exponeDetailses = exponeDetailses;
		this.expthreeDetailses = expthreeDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bd_id", unique = true, nullable = false)
	public Integer getBdId() {
		return this.bdId;
	}

	public void setBdId(Integer bdId) {
		this.bdId = bdId;
	}

	@Column(name = "business_name", nullable = false)
	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Column(name = "business_introduce", nullable = false)
	public String getBusinessIntroduce() {
		return this.businessIntroduce;
	}

	public void setBusinessIntroduce(String businessIntroduce) {
		this.businessIntroduce = businessIntroduce;
	}

	@Column(name = "business_state", nullable = false)
	public Integer getBusinessState() {
		return this.businessState;
	}

	public void setBusinessState(Integer businessState) {
		this.businessState = businessState;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "businessDetails")
	public List<ExponeDetails> getExponeDetailses() {
		return this.exponeDetailses;
	}

	public void setExponeDetailses(List<ExponeDetails> exponeDetailses) {
		this.exponeDetailses = exponeDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "businessDetails")
	public List<ExpthreeDetails> getExpthreeDetailses() {
		return this.expthreeDetailses;
	}

	public void setExpthreeDetailses(List<ExpthreeDetails> expthreeDetailses) {
		this.expthreeDetailses = expthreeDetailses;
	}

}