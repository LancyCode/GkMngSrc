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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: TerritoryCountry 
 * @Description: 国家信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:39:36
 */
@Entity
@Table(name = "territory_country", catalog = "gkzy_db")
public class TerritoryCountry implements java.io.Serializable {


	private Integer countryId;
	private String countryName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<TerritoryProvince> territoryProvinces = new ArrayList<TerritoryProvince>(
			0);


	public TerritoryCountry() {
	}

	public TerritoryCountry(String countryName) {
		this.countryName = countryName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "country_id", unique = true, nullable = false)
	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "country_name", nullable = false)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "territoryCountry")
	public List<TerritoryProvince> getTerritoryProvinces() {
		return this.territoryProvinces;
	}

	public void setTerritoryProvinces(List<TerritoryProvince> territoryProvinces) {
		this.territoryProvinces = territoryProvinces;
	}

}