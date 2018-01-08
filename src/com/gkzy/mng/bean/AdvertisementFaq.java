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
 * @ClassName: AdvertisementFaq 
 * @Description: 常见问题广告
 * @author 共享智汇.赵仕建 
 * @date 2018年1月2日 上午11:30:32
 */
@Entity
@Table(name = "advertisement_faq", catalog = "gkzy_db")
public class AdvertisementFaq implements java.io.Serializable {

	private Integer adfaqId;
	private String adfaqTitle;
	private String adfaqUrl;
	private String adfaqDescription;
	private Integer adfaqPriority;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;


	public AdvertisementFaq() {
	}

	public AdvertisementFaq(String adfaqTitle, Integer adfaqPriority, Date createTime) {
		this.adfaqTitle = adfaqTitle;
		this.adfaqPriority = adfaqPriority;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "adfaq_id", unique = true, nullable = false)
	public Integer getAdfaqId() {
		return this.adfaqId;
	}

	public void setAdfaqId(Integer adfaqId) {
		this.adfaqId = adfaqId;
	}

	@Column(name = "adfaq_title", nullable = false)

	public String getAdfaqTitle() {
		return this.adfaqTitle;
	}

	public void setAdfaqTitle(String adfaqTitle) {
		this.adfaqTitle = adfaqTitle;
	}

	@Column(name = "adfaq_url")
	public String getAdfaqUrl() {
		return this.adfaqUrl;
	}

	public void setAdfaqUrl(String adfaqUrl) {
		this.adfaqUrl = adfaqUrl;
	}

	@Column(name = "adfaq_description")
	public String getAdfaqDescription() {
		return this.adfaqDescription;
	}

	public void setAdfaqDescription(String adfaqDescription) {
		this.adfaqDescription = adfaqDescription;
	}

	@Column(name = "adfaq_priority", nullable = false)
	public Integer getAdfaqPriority() {
		return this.adfaqPriority;
	}

	public void setAdfaqPriority(Integer adfaqPriority) {
		this.adfaqPriority = adfaqPriority;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "gdp001")
	@Transient
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", length = 19)
	@Transient
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