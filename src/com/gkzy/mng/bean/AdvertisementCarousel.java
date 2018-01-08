package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 * 
 * @ClassName: AdvertisementCarousel 
 * @Description: 轮播广告
 * @author 共享智汇.赵仕建 
 * @date 2018年1月2日 上午11:30:14
 */

@Entity
@Table(name = "advertisement_carousel", catalog = "gkzy_db")
public class AdvertisementCarousel implements java.io.Serializable {

	private Integer adcId;
	private String adcTitle;
	private String adcUrl;
	private String adcPicture;
	private String adcDescription;
	private Integer adcPriority;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public AdvertisementCarousel() {
	}

	public AdvertisementCarousel(String adcTitle, String adcUrl, String adcPicture, String adcDescription,
			Integer adcPriority, Date createTime) {
		this.adcTitle = adcTitle;
		this.adcUrl = adcUrl;
		this.adcPicture = adcPicture;
		this.adcDescription = adcDescription;
		this.adcPriority = adcPriority;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "adc_id", unique = true, nullable = false)
	public Integer getAdcId() {
		return this.adcId;
	}

	public void setAdcId(Integer adcId) {
		this.adcId = adcId;
	}

	@Column(name = "adc_title", nullable = false)

	public String getAdcTitle() {
		return this.adcTitle;
	}

	public void setAdcTitle(String adcTitle) {
		this.adcTitle = adcTitle;
	}

	@Column(name = "adc_url", nullable = false)

	public String getAdcUrl() {
		return this.adcUrl;
	}

	public void setAdcUrl(String adcUrl) {
		this.adcUrl = adcUrl;
	}

	@Column(name = "adc_picture", nullable = false)

	public String getAdcPicture() {
		return this.adcPicture;
	}

	public void setAdcPicture(String adcPicture) {
		this.adcPicture = adcPicture;
	}

	@Column(name = "adc_description", nullable = false)

	public String getAdcDescription() {
		return this.adcDescription;
	}

	public void setAdcDescription(String adcDescription) {
		this.adcDescription = adcDescription;
	}

	@Column(name = "adc_priority", nullable = false)

	public Integer getAdcPriority() {
		return this.adcPriority;
	}

	public void setAdcPriority(Integer adcPriority) {
		this.adcPriority = adcPriority;
	}

	@Column(name = "create_time", nullable = false, length = 19)

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Transient
	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Transient
	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}

	@Column(name = "gdp003")
	@Transient
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Column(name = "gdp004", length = 19)
	@Transient
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}

	@Column(name = "gdp005")
	@Transient
	public Integer getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}

	@Column(name = "gdp006")
	@Transient
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}