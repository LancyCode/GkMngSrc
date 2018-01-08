package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @ClassName: VolunteerHeadline 
 * @Description: 志愿头条
 * @author 共享智汇.赵仕建 
 * @date 2018年1月2日 上午11:32:44
 */
@Entity
@Table(name = "volunteer_headline", catalog = "gkzy_db")
public class VolunteerHeadline implements java.io.Serializable {

	private Integer vhlId;
	private String vhlTitle;
	private String vhlDescription;
	private Date createTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public VolunteerHeadline() {
	}

	public VolunteerHeadline(String vhlTitle, String vhlDescription, Date createTime) {
		this.vhlTitle = vhlTitle;
		this.vhlDescription = vhlDescription;
		this.createTime = createTime;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vhl_id", unique = true, nullable = false)
	public Integer getVhlId() {
		return this.vhlId;
	}

	public void setVhlId(Integer vhlId) {
		this.vhlId = vhlId;
	}

	@Column(name = "vhl_title", nullable = false, length = 50)
	public String getVhlTitle() {
		return this.vhlTitle;
	}

	public void setVhlTitle(String vhlTitle) {
		this.vhlTitle = vhlTitle;
	}

	@Column(name = "vhl_description", nullable = false)
	public String getVhlDescription() {
		return this.vhlDescription;
	}

	public void setVhlDescription(String vhlDescription) {
		this.vhlDescription = vhlDescription;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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