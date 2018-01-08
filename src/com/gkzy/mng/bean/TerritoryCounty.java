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
 * @ClassName: TerritoryCounty 
 * @Description: 县镇信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:41:38
 */
@Entity
@Table(name = "territory_county", catalog = "gkzy_db")
public class TerritoryCounty implements java.io.Serializable {

	private Integer countyId;
	private TerritoryCity territoryCity;
	private String countyName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdo006;


	public TerritoryCounty() {
	}

	public TerritoryCounty(TerritoryCity territoryCity, String countyName) {
		this.territoryCity = territoryCity;
		this.countyName = countyName;
	}

	public TerritoryCounty(TerritoryCity territoryCity, String countyName,
			String gdp001, Date gdp002, String gdp003, Date gdp004,
			Integer gdp005, String gdo006) {
		this.territoryCity = territoryCity;
		this.countyName = countyName;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdo006 = gdo006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "county_id", unique = true, nullable = false)
	public Integer getCountyId() {
		return this.countyId;
	}

	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false)
	public TerritoryCity getTerritoryCity() {
		return this.territoryCity;
	}

	public void setTerritoryCity(TerritoryCity territoryCity) {
		this.territoryCity = territoryCity;
	}

	@Column(name = "county_name", nullable = false)
	public String getCountyName() {
		return this.countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
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
	@Column(name = "gdo006")
	public String getGdo006() {
		return this.gdo006;
	}

	public void setGdo006(String gdo006) {
		this.gdo006 = gdo006;
	}

}