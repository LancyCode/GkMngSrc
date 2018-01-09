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
 * @ClassName: ExpertorderDetails 
 * @Description: 专家预约明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:52:19
 */

@Entity
@Table(name = "expertorder_details", catalog = "gkzy_db")
public class ExpertorderDetails implements java.io.Serializable {

	private Integer eodId;
	private ExpertInf expertInf;
	private GkzyUser gkzyUser;
	private Date orderTime;
	private String orderNum;
	private Integer orderState;
	private Date appointTime;
	private Date expiryTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public ExpertorderDetails() {
	}

	public ExpertorderDetails(ExpertInf expertInf, GkzyUser gkzyUser,
			Date orderTime, String orderNum, Integer orderState) {
		this.expertInf = expertInf;
		this.gkzyUser = gkzyUser;
		this.orderTime = orderTime;
		this.orderNum = orderNum;
		this.orderState = orderState;
	}

	public ExpertorderDetails(ExpertInf expertInf, GkzyUser gkzyUser,
			Date orderTime, String orderNum, Integer orderState,
			Date appointTime, Date expiryTime, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006) {
		this.expertInf = expertInf;
		this.gkzyUser = gkzyUser;
		this.orderTime = orderTime;
		this.orderNum = orderNum;
		this.orderState = orderState;
		this.appointTime = appointTime;
		this.expiryTime = expiryTime;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "eod_id", unique = true, nullable = false)
	public Integer getEodId() {
		return this.eodId;
	}

	public void setEodId(Integer eodId) {
		this.eodId = eodId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "expert_id", nullable = false)
	public ExpertInf getExpertInf() {
		return this.expertInf;
	}

	public void setExpertInf(ExpertInf expertInf) {
		this.expertInf = expertInf;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}

	@Column(name = "order_time", nullable = false, length = 19)
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "order_num", nullable = false)
	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "order_state", nullable = false)
	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	@Column(name = "appoint_time", length = 19)
	public Date getAppointTime() {
		return this.appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	@Column(name = "expiry_time", length = 19)
	public Date getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
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