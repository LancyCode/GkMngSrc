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
 * @ClassName: UserScore 
 * @Description: 用户高考成绩
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:17:16
 */
@Entity
@Table(name = "user_score", catalog = "gkzy_db")
public class UserScore implements java.io.Serializable {

	private Integer usId;
	private GkzyUser gkzyUser;
	private Double chinese;
	private Double math;
	private Double english;
	private Double physicalOrHistory;
	private Double chemistryOrGeography;
	private Double biologyOrPolitics;
	private Integer usertype;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private String gdp005;
	private String gdp006;


	public UserScore() {
	}

	public UserScore(GkzyUser gkzyUser, Double chinese, Double math,
			Double english, Double physicalOrHistory,
			Double chemistryOrGeography, Double biologyOrPolitics,
			Integer usertype) {
		this.gkzyUser = gkzyUser;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.physicalOrHistory = physicalOrHistory;
		this.chemistryOrGeography = chemistryOrGeography;
		this.biologyOrPolitics = biologyOrPolitics;
		this.usertype = usertype;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "us_id", unique = true, nullable = false)
	public Integer getUsId() {
		return this.usId;
	}

	public void setUsId(Integer usId) {
		this.usId = usId;
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

	@Column(name = "chinese", nullable = false, precision = 10)
	public Double getChinese() {
		return this.chinese;
	}

	public void setChinese(Double chinese) {
		this.chinese = chinese;
	}

	@Column(name = "math", nullable = false, precision = 10)
	public Double getMath() {
		return this.math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	@Column(name = "english", nullable = false, precision = 10)
	public Double getEnglish() {
		return this.english;
	}

	public void setEnglish(Double english) {
		this.english = english;
	}

	@Column(name = "physical_or_history", nullable = false, precision = 10)
	public Double getPhysicalOrHistory() {
		return this.physicalOrHistory;
	}

	public void setPhysicalOrHistory(Double physicalOrHistory) {
		this.physicalOrHistory = physicalOrHistory;
	}

	@Column(name = "chemistry_or_geography", nullable = false, precision = 10)
	public Double getChemistryOrGeography() {
		return this.chemistryOrGeography;
	}

	public void setChemistryOrGeography(Double chemistryOrGeography) {
		this.chemistryOrGeography = chemistryOrGeography;
	}

	@Column(name = "biology_or_politics", nullable = false, precision = 10)
	public Double getBiologyOrPolitics() {
		return this.biologyOrPolitics;
	}

	public void setBiologyOrPolitics(Double biologyOrPolitics) {
		this.biologyOrPolitics = biologyOrPolitics;
	}

	@Column(name = "usertype", nullable = false)
	public Integer getUsertype() {
		return this.usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
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
	public String getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(String gdp005) {
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