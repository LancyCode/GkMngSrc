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
 * @ClassName: SetmealDetails 
 * @Description: 套餐搭配明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:35:37
 */
@Entity
@Table(name = "setmeal_details", catalog = "gkzy_db")
public class SetmealDetails implements java.io.Serializable {

	private Integer smdId;
	private Double smdPrice;
	private String smdIntroduce;
	private Integer smdState;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<BuyDetails> buyDetailses = new ArrayList<BuyDetails>(0);

	public SetmealDetails() {
	}

	public SetmealDetails(Double smdPrice, String smdIntroduce, Integer smdState) {
		this.smdPrice = smdPrice;
		this.smdIntroduce = smdIntroduce;
		this.smdState = smdState;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "smd_id", unique = true, nullable = false)
	public Integer getSmdId() {
		return this.smdId;
	}

	public void setSmdId(Integer smdId) {
		this.smdId = smdId;
	}

	@Column(name = "smd_price", nullable = false, precision = 22, scale = 0)
	public Double getSmdPrice() {
		return this.smdPrice;
	}

	public void setSmdPrice(Double smdPrice) {
		this.smdPrice = smdPrice;
	}

	@Column(name = "smd_introduce", nullable = false)
	public String getSmdIntroduce() {
		return this.smdIntroduce;
	}

	public void setSmdIntroduce(String smdIntroduce) {
		this.smdIntroduce = smdIntroduce;
	}

	@Column(name = "smd_state", nullable = false)
	public Integer getSmdState() {
		return this.smdState;
	}

	public void setSmdState(Integer smdState) {
		this.smdState = smdState;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "setmealDetails")
	public List<BuyDetails> getBuyDetailses() {
		return this.buyDetailses;
	}

	public void setBuyDetailses(List<BuyDetails> buyDetailses) {
		this.buyDetailses = buyDetailses;
	}

}