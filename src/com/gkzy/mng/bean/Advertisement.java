package com.gkzy.mng.bean;


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: Advertisement 
 * @Description: 广告信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:21:48
 */

@Entity
@Table(name = "advertisement", catalog = "gkzy_db")
public class Advertisement implements java.io.Serializable {

	private Integer adId;
	private String adTitle;
	private String adUrl;
	private String adPicture;
	private String adDescription;
	private String adType;
	private Integer adPriority;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public Advertisement() {
	}

	public Advertisement(String adTitle, String adUrl, String adPicture,
			String adDescription, String adType, Integer adPriority,
			Date createTime) {
		this.adTitle = adTitle;
		this.adUrl = adUrl;
		this.adPicture = adPicture;
		this.adDescription = adDescription;
		this.adType = adType;
		this.adPriority = adPriority;
		this.createTime = createTime;
	}

	public Advertisement(String adTitle, String adUrl, String adPicture,
			String adDescription, String adType, Integer adPriority,
			Date createTime, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.adTitle = adTitle;
		this.adUrl = adUrl;
		this.adPicture = adPicture;
		this.adDescription = adDescription;
		this.adType = adType;
		this.adPriority = adPriority;
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
	@Column(name = "ad_id", unique = true, nullable = false)
	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	@Column(name = "ad_title", nullable = false)
	public String getAdTitle() {
		return this.adTitle;
	}

	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}

	@Column(name = "ad_url", nullable = false)
	public String getAdUrl() {
		return this.adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	@Column(name = "ad_picture", nullable = false)
	public String getAdPicture() {
		return this.adPicture;
	}

	public void setAdPicture(String adPicture) {
		this.adPicture = adPicture;
	}

	@Column(name = "ad_description", nullable = false)
	public String getAdDescription() {
		return this.adDescription;
	}

	public void setAdDescription(String adDescription) {
		this.adDescription = adDescription;
	}

	@Column(name = "ad_type", nullable = false)
	public String getAdType() {
		return this.adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	@Column(name = "ad_priority", nullable = false)
	public Integer getAdPriority() {
		return this.adPriority;
	}

	public void setAdPriority(Integer adPriority) {
		this.adPriority = adPriority;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}

	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}

	@Column(name = "gdp005")
	public Integer getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}

	@Column(name = "gdp006")
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}