package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: UserRelation 
 * @Description: 用户关联信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:00:36
 */

@Entity
@Table(name = "user_relation", catalog = "gkzy_db")
public class UserRelation implements java.io.Serializable {

	private Integer urId;
	private Integer userId;
	private Integer hailFellowId;
	private Timestamp relatedTime;
	private Integer relatedState;
	private Integer activeId;
	private Integer passiveId;
	private String gdp001;
	private Timestamp gdp002;
	private String gdp003;
	private Timestamp gdp004;
	private Integer gdp005;
	private String gdp006;


	public UserRelation() {
	}

	public UserRelation(Integer userId, Integer hailFellowId,
			Timestamp relatedTime, Integer relatedState, Integer activeId,
			Integer passiveId, String gdp001, Timestamp gdp002, String gdp003,
			Timestamp gdp004, Integer gdp005) {
		this.userId = userId;
		this.hailFellowId = hailFellowId;
		this.relatedTime = relatedTime;
		this.relatedState = relatedState;
		this.activeId = activeId;
		this.passiveId = passiveId;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
	}

	public UserRelation(Integer userId, Integer hailFellowId,
			Timestamp relatedTime, Integer relatedState, Integer activeId,
			Integer passiveId, String gdp001, Timestamp gdp002, String gdp003,
			Timestamp gdp004, Integer gdp005, String gdp006) {
		this.userId = userId;
		this.hailFellowId = hailFellowId;
		this.relatedTime = relatedTime;
		this.relatedState = relatedState;
		this.activeId = activeId;
		this.passiveId = passiveId;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ur_id", unique = true, nullable = false)
	public Integer getUrId() {
		return this.urId;
	}

	public void setUrId(Integer urId) {
		this.urId = urId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "hailFellow_id", nullable = false)
	public Integer getHailFellowId() {
		return this.hailFellowId;
	}

	public void setHailFellowId(Integer hailFellowId) {
		this.hailFellowId = hailFellowId;
	}

	@Column(name = "related_time", nullable = false, length = 19)
	public Timestamp getRelatedTime() {
		return this.relatedTime;
	}

	public void setRelatedTime(Timestamp relatedTime) {
		this.relatedTime = relatedTime;
	}

	@Column(name = "related_state", nullable = false)
	public Integer getRelatedState() {
		return this.relatedState;
	}

	public void setRelatedState(Integer relatedState) {
		this.relatedState = relatedState;
	}

	@Column(name = "active_id", nullable = false)
	public Integer getActiveId() {
		return this.activeId;
	}

	public void setActiveId(Integer activeId) {
		this.activeId = activeId;
	}

	@Column(name = "passive_id", nullable = false)
	public Integer getPassiveId() {
		return this.passiveId;
	}

	public void setPassiveId(Integer passiveId) {
		this.passiveId = passiveId;
	}

	@Column(name = "gdp001", nullable = false)
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", nullable = false, length = 19)
	public Timestamp getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Timestamp gdp002) {
		this.gdp002 = gdp002;
	}

	@Column(name = "gdp003", nullable = false)
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Column(name = "gdp004", nullable = false, length = 19)
	public Timestamp getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Timestamp gdp004) {
		this.gdp004 = gdp004;
	}

	@Column(name = "gdp005", nullable = false)
	public Integer getGdp005() {
		return this.gdp005;
	}

	public void setGdp005(Integer gdp005) {
		this.gdp005 = gdp005;
	}

	@Column(name = "gdp006")
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}

}