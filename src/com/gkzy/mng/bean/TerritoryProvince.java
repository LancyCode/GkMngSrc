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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: TerritoryProvince 
 * @Description: 省份信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:42:33
 */

@Entity
@Table(name = "territory_province", catalog = "gkzy_db")
public class TerritoryProvince implements java.io.Serializable {

	private Integer provinceId;
	private TerritoryCountry territoryCountry;
	private String provinceName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<TerritoryCity> territoryCities = new ArrayList<TerritoryCity>(0);

	public TerritoryProvince() {
	}

	public TerritoryProvince(TerritoryCountry territoryCountry,
			String provinceName) {
		this.territoryCountry = territoryCountry;
		this.provinceName = provinceName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "province_id", unique = true, nullable = false)
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false)
	public TerritoryCountry getTerritoryCountry() {
		return this.territoryCountry;
	}

	public void setTerritoryCountry(TerritoryCountry territoryCountry) {
		this.territoryCountry = territoryCountry;
	}

	@Column(name = "province_name", nullable = false)
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "territoryProvince")
	public List<TerritoryCity> getTerritoryCities() {
		return this.territoryCities;
	}

	public void setTerritoryCities(List<TerritoryCity> territoryCities) {
		this.territoryCities = territoryCities;
	}

}