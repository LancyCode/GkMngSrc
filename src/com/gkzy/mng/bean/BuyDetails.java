package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: BuyDetails 
 * @Description: 购买明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:34:53
 */
@Entity
@Table(name = "buy_details", catalog = "gkzy_db")
public class BuyDetails implements java.io.Serializable {

	private Integer buyId;
	private GkzyUser gkzyUser;
	private SetmealDetails setmealDetails;
	private Date orderTime;
	private Date expirationTime;
	private String orderNo;
	private Integer paystate;
	private Date paytime;
	private String tradeNo;
	private Integer paytype;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public BuyDetails() {
	}

	public BuyDetails(GkzyUser gkzyUser, SetmealDetails setmealDetails,
			Date orderTime, String orderNo) {
		this.gkzyUser = gkzyUser;
		this.setmealDetails = setmealDetails;
		this.orderTime = orderTime;
		this.orderNo = orderNo;
	}

	public BuyDetails(GkzyUser gkzyUser, SetmealDetails setmealDetails,
			Date orderTime, Date expirationTime, String orderNo,
			Integer paystate, Date paytime, String tradeNo,
			Integer paytype, String gdp001, Date gdp002, String gdp003,
			Date gdp004, Integer gdp005, String gdp006) {
		this.gkzyUser = gkzyUser;
		this.setmealDetails = setmealDetails;
		this.orderTime = orderTime;
		this.expirationTime = expirationTime;
		this.orderNo = orderNo;
		this.paystate = paystate;
		this.paytime = paytime;
		this.tradeNo = tradeNo;
		this.paytype = paytype;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "buy_id", unique = true, nullable = false)
	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "smd_id", nullable = false)
	public SetmealDetails getSetmealDetails() {
		return this.setmealDetails;
	}

	public void setSetmealDetails(SetmealDetails setmealDetails) {
		this.setmealDetails = setmealDetails;
	}

	@Column(name = "order_time", nullable = false, length = 19)
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expiration_time", length = 10)
	public Date getExpirationTime() {
		return this.expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	@Column(name = "orderNo", nullable = false)
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "paystate")
	public Integer getPaystate() {
		return this.paystate;
	}

	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}

	@Column(name = "paytime", length = 19)
	public Date getPaytime() {
		return this.paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	@Column(name = "tradeNo")
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Column(name = "paytype")
	public Integer getPaytype() {
		return this.paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
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