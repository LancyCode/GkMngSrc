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
 * @ClassName: ExpthreeDetails 
 * @Description: 志愿科学指导业务明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:56:27
 */

@Entity
@Table(name = "expthree_details", catalog = "gkzy_db")
public class ExpthreeDetails implements java.io.Serializable {

	private Integer expthreeId;
	private GkzyUser gkzyUser;
	private BusinessDetails businessDetails;
	private Integer expstate;
	private Date exptime;
	private Double testScore;
	private String testNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public ExpthreeDetails() {
	}

	public ExpthreeDetails(GkzyUser gkzyUser, BusinessDetails businessDetails) {
		this.gkzyUser = gkzyUser;
		this.businessDetails = businessDetails;
	}

	public ExpthreeDetails(GkzyUser gkzyUser, BusinessDetails businessDetails,
			Integer expstate, Date exptime, Double testScore,
			String testNum, String gdp001, Date gdp002, String gdp003,
			Date gdp004, Integer gdp005, String gdp006) {
		this.gkzyUser = gkzyUser;
		this.businessDetails = businessDetails;
		this.expstate = expstate;
		this.exptime = exptime;
		this.testScore = testScore;
		this.testNum = testNum;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "expthree_id", unique = true, nullable = false)
	public Integer getExpthreeId() {
		return this.expthreeId;
	}

	public void setExpthreeId(Integer expthreeId) {
		this.expthreeId = expthreeId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
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

	@Column(name = "expstate")
	public Integer getExpstate() {
		return this.expstate;
	}

	public void setExpstate(Integer expstate) {
		this.expstate = expstate;
	}

	@Column(name = "exptime", length = 19)
	public Date getExptime() {
		return this.exptime;
	}

	public void setExptime(Date exptime) {
		this.exptime = exptime;
	}

	@Column(name = "testScore", precision = 22, scale = 0)
	public Double getTestScore() {
		return this.testScore;
	}

	public void setTestScore(Double testScore) {
		this.testScore = testScore;
	}

	@Column(name = "testNum")
	public String getTestNum() {
		return this.testNum;
	}

	public void setTestNum(String testNum) {
		this.testNum = testNum;
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