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
 * @ClassName: AcademyMajorAdmis 
 * @Description: 历年院校专业录取信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:35:49
 */
@Entity
@Table(name = "academy_major_admis", catalog = "gkzy_db")
public class AcademyMajorAdmis implements java.io.Serializable {

	private Integer amaId;
	private AcedemyMajor acedemyMajor;
	private String amYear;
	private Double admisLowestScore;
	private Double admisAverageScore;
	private Double admisHighestScore;
	private Integer submitNum;
	private Integer admisNum;
	private Double acceptLowestScore;
	private Double acceptHighestScore;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AcademyMajorAdmis() {
	}

	public AcademyMajorAdmis(AcedemyMajor acedemyMajor, String amYear,
			Double admisLowestScore, Double admisAverageScore,
			Double admisHighestScore, Integer submitNum, Integer admisNum,
			Double acceptLowestScore, Double acceptHighestScore, Long tuitionFee) {
		this.acedemyMajor = acedemyMajor;
		this.amYear = amYear;
		this.admisLowestScore = admisLowestScore;
		this.admisAverageScore = admisAverageScore;
		this.admisHighestScore = admisHighestScore;
		this.submitNum = submitNum;
		this.admisNum = admisNum;
		this.acceptLowestScore = acceptLowestScore;
		this.acceptHighestScore = acceptHighestScore;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ama_id", unique = true, nullable = false)
	public Integer getAmaId() {
		return this.amaId;
	}

	public void setAmaId(Integer amaId) {
		this.amaId = amaId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "am_id", nullable = false)
	public AcedemyMajor getAcedemyMajor() {
		return this.acedemyMajor;
	}

	public void setAcedemyMajor(AcedemyMajor acedemyMajor) {
		this.acedemyMajor = acedemyMajor;
	}

	@Column(name = "am_year", nullable = false)
	public String getAmYear() {
		return this.amYear;
	}

	public void setAmYear(String amYear) {
		this.amYear = amYear;
	}

	@Column(name = "admis_lowestScore", nullable = false, precision = 22, scale = 0)
	public Double getAdmisLowestScore() {
		return this.admisLowestScore;
	}

	public void setAdmisLowestScore(Double admisLowestScore) {
		this.admisLowestScore = admisLowestScore;
	}

	@Column(name = "admis_averageScore", nullable = false, precision = 22, scale = 0)
	public Double getAdmisAverageScore() {
		return this.admisAverageScore;
	}

	public void setAdmisAverageScore(Double admisAverageScore) {
		this.admisAverageScore = admisAverageScore;
	}

	@Column(name = "admis_highestScore", nullable = false, precision = 22, scale = 0)
	public Double getAdmisHighestScore() {
		return this.admisHighestScore;
	}

	public void setAdmisHighestScore(Double admisHighestScore) {
		this.admisHighestScore = admisHighestScore;
	}

	@Column(name = "submit_num", nullable = false)
	public Integer getSubmitNum() {
		return this.submitNum;
	}

	public void setSubmitNum(Integer submitNum) {
		this.submitNum = submitNum;
	}

	@Column(name = "admis_num", nullable = false)
	public Integer getAdmisNum() {
		return this.admisNum;
	}

	public void setAdmisNum(Integer admisNum) {
		this.admisNum = admisNum;
	}

	@Column(name = "accept_lowestScore", nullable = false, precision = 22, scale = 0)
	public Double getAcceptLowestScore() {
		return this.acceptLowestScore;
	}

	public void setAcceptLowestScore(Double acceptLowestScore) {
		this.acceptLowestScore = acceptLowestScore;
	}

	@Column(name = "accept_highestScore", nullable = false, precision = 22, scale = 0)
	public Double getAcceptHighestScore() {
		return this.acceptHighestScore;
	}

	public void setAcceptHighestScore(Double acceptHighestScore) {
		this.acceptHighestScore = acceptHighestScore;
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