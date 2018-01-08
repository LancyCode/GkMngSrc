package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: Abroad 
 * @Description: 留学机构
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:23:45
 */
@Entity
@Table(name = "abroad", catalog = "gkzy_db")
public class Abroad implements java.io.Serializable {

	private Integer abroadId;
	private String abroadName;
	private String adroadDescription;
	private Integer priority;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<AbroadImagetext> abroadImagetexts = new ArrayList<AbroadImagetext>();

	public Abroad() {
	}

	public Abroad(String abroadName) {
		this.abroadName = abroadName;
	}

	public Abroad(String abroadName, String adroadDescription,
			Integer priority, List<AbroadImagetext> abroadImagetexts) {
		this.abroadName = abroadName;
		this.adroadDescription = adroadDescription;
		this.priority = priority;
		this.abroadImagetexts = abroadImagetexts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "abroad_id")
	public Integer getAbroadId() {
		return this.abroadId;
	}

	public void setAbroadId(Integer abroadId) {
		this.abroadId = abroadId;
	}

	@Column(name = "abroad_name", nullable = false)
	public String getAbroadName() {
		return this.abroadName;
	}

	public void setAbroadName(String abroadName) {
		this.abroadName = abroadName;
	}

	@Column(name = "adroad_description")
	public String getAdroadDescription() {
		return this.adroadDescription;
	}

	public void setAdroadDescription(String adroadDescription) {
		this.adroadDescription = adroadDescription;
	}

	@Column(name = "priority")
	public Integer getPriority() {
		return this.priority;
	}
	
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	@Transient
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "abroad")
	public List<AbroadImagetext> getAbroadImagetexts() {
		return this.abroadImagetexts;
	}
	
	@JsonIgnore
	public void setAbroadImagetexts(List<AbroadImagetext> abroadImagetexts) {
		this.abroadImagetexts = abroadImagetexts;
	}

}