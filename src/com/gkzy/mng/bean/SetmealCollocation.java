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
 * @ClassName: SetmealCollocation 
 * @Description: 套餐搭配中间表
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:34:40
 */
@Entity
@Table(name = "setmeal_collocation", catalog = "gkzy_db")
public class SetmealCollocation implements java.io.Serializable {

	private Integer smcId;
	private SetmealDetails setmealDetails;
	private BusinessDetails businessDetails;
	private Integer smcState;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public SetmealCollocation() {
	}

	public SetmealCollocation(SetmealDetails setmealDetails,
			BusinessDetails businessDetails, Integer smcState) {
		this.setmealDetails = setmealDetails;
		this.businessDetails = businessDetails;
		this.smcState = smcState;
	}

	public SetmealCollocation(SetmealDetails setmealDetails,
			BusinessDetails businessDetails, Integer smcState, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006) {
		this.setmealDetails = setmealDetails;
		this.businessDetails = businessDetails;
		this.smcState = smcState;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "smc_id", unique = true, nullable = false)
	public Integer getSmcId() {
		return this.smcId;
	}

	public void setSmcId(Integer smcId) {
		this.smcId = smcId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "smd_id", nullable = false)
	public SetmealDetails getSetmealDetails() {
		return this.setmealDetails;
	}

	public void setSetmealDetails(SetmealDetails setmealDetails) {
		this.setmealDetails = setmealDetails;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bd_id", nullable = false)
	public BusinessDetails getBusinessDetails() {
		return this.businessDetails;
	}

	public void setBusinessDetails(BusinessDetails businessDetails) {
		this.businessDetails = businessDetails;
	}

	@Column(name = "smc_state", nullable = false)
	public Integer getSmcState() {
		return this.smcState;
	}

	public void setSmcState(Integer smcState) {
		this.smcState = smcState;
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