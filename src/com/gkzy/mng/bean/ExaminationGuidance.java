package com.gkzy.mng.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: ExaminationGuidance 
 * @Description: 应试指导
 * @author 共享智汇.赵仕建 
 * @date 2018年1月2日 下午7:13:41
 */
@Entity
@Table(name = "examination_guidance", catalog = "gkzy_db")
public class ExaminationGuidance implements java.io.Serializable {

	private Integer egId;
	private String egTitle;
	private String egPicture;
	private String egDescription;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public ExaminationGuidance() {
	}

	public ExaminationGuidance(String egTitle, String egPicture, String egDescription, Date createTime) {
		this.egTitle = egTitle;
		this.egPicture = egPicture;
		this.egDescription = egDescription;
		this.createTime = createTime;
	}

	public ExaminationGuidance(String egTitle, String egPicture, String egDescription, Date createTime,
			String gdp001, Date gdp002, String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.egTitle = egTitle;
		this.egPicture = egPicture;
		this.egDescription = egDescription;
		this.createTime = createTime;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "eg_id", unique = true, nullable = false)
	public Integer getEgId() {
		return this.egId;
	}

	public void setEgId(Integer egId) {
		this.egId = egId;
	}

	@Column(name = "eg_title", nullable = false, length = 50)
	public String getEgTitle() {
		return this.egTitle;
	}

	public void setEgTitle(String egTitle) {
		this.egTitle = egTitle;
	}
	
	@Column(name = "eg_picture", nullable = false, length = 50)
	public String getEgPicture() {
		return this.egPicture;
	}

	public void setEgPicture(String egPicture) {
		this.egPicture = egPicture;
	}

	@Column(name = "eg_description", nullable = false)
	public String getEgDescription() {
		return this.egDescription;
	}

	public void setEgDescription(String egDescription) {
		this.egDescription = egDescription;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonIgnore
	@Column(name = "gdp001", length = 0)
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
	@Column(name = "gdp003", length = 0)
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
	@Column(name = "gdp006", length = 0)
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}