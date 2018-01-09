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
 * @ClassName: AbroadImagetext 
 * @Description: 留学机构图文
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:24:01
 */

@Entity
@Table(name = "abroad_imagetext", catalog = "gkzy_db")
public class AbroadImagetext implements java.io.Serializable {

	private Integer aitId;
	private Abroad abroad;
	private String aitTitle;
	private String aitPicture;
	private String aitDesciption;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AbroadImagetext() {
	}

	public AbroadImagetext(Abroad abroad) {
		this.abroad = abroad;
	}

	public AbroadImagetext(Abroad abroad, String aitTitle, String aitPicture,
			String aitDesciption, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.abroad = abroad;
		this.aitTitle = aitTitle;
		this.aitPicture = aitPicture;
		this.aitDesciption = aitDesciption;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ait_id", unique = true, nullable = false)
	public Integer getAitId() {
		return this.aitId;
	}

	public void setAitId(Integer aitId) {
		this.aitId = aitId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "abroad_id", nullable = false)
	public Abroad getAbroad() {
		return this.abroad;
	}

	public void setAbroad(Abroad abroad) {
		this.abroad = abroad;
	}

	@Column(name = "ait_title")
	public String getAitTitle() {
		return this.aitTitle;
	}

	public void setAitTitle(String aitTitle) {
		this.aitTitle = aitTitle;
	}

	@Column(name = "ait_picture")
	public String getAitPicture() {
		return this.aitPicture;
	}

	public void setAitPicture(String aitPicture) {
		this.aitPicture = aitPicture;
	}

	@Column(name = "ait_desciption")
	public String getAitDesciption() {
		return this.aitDesciption;
	}
	
	
	public void setAitDesciption(String aitDesciption) {
		this.aitDesciption = aitDesciption;
	}

	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}
	
	@JsonIgnore
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002")
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

	@Column(name = "gdp004")
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