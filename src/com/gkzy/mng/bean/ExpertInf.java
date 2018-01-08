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

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @ClassName: ExpertInf 
 * @Description: 专家信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:47:55
 */
@Entity
@Table(name = "expert_inf", catalog = "gkzy_db")
public class ExpertInf implements java.io.Serializable {

	private Integer expertId;
	private String expertName;
	private String expertPhone;
	private String expertIntroduce;
	private String expertSpeciality;
	private String expertCode;
	private String expertSex;
	private String expertTitle;
	private Integer expertAge;
	private Integer expertViews;
	private String expertWeixin;
	private String expertQq;
	private Integer orderNum;
	private Integer praiseNum;
	private Integer complainNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<ExpertorderDetails> expertorderDetailses = new ArrayList<ExpertorderDetails>();
	private List<UserCollectionExpert> userCollectionExperts = new ArrayList<UserCollectionExpert>();

	public ExpertInf() {
	}

	public ExpertInf(String expertName, String expertPhone,
			String expertIntroduce, String expertSpeciality, String expertCode,
			String expertSex, String expertTitle, Integer expertAge,
			Integer expertViews, String expertWeixin, String expertQq,
			Integer orderNum, Integer praiseNum, Integer complainNum) {
		this.expertName = expertName;
		this.expertPhone = expertPhone;
		this.expertIntroduce = expertIntroduce;
		this.expertSpeciality = expertSpeciality;
		this.expertCode = expertCode;
		this.expertSex = expertSex;
		this.expertTitle = expertTitle;
		this.expertAge = expertAge;
		this.expertViews = expertViews;
		this.expertWeixin = expertWeixin;
		this.expertQq = expertQq;
		this.orderNum = orderNum;
		this.praiseNum = praiseNum;
		this.complainNum = complainNum;
	}

	public ExpertInf(String expertName, String expertPhone,
			String expertIntroduce, String expertSpeciality, String expertCode,
			String expertSex, String expertTitle, Integer expertAge,
			Integer expertViews, String expertWeixin, String expertQq,
			Integer orderNum, Integer praiseNum, Integer complainNum,
			List<ExpertorderDetails> expertorderDetailses,
			List<UserCollectionExpert> userCollectionExperts) {
		this.expertName = expertName;
		this.expertPhone = expertPhone;
		this.expertIntroduce = expertIntroduce;
		this.expertSpeciality = expertSpeciality;
		this.expertCode = expertCode;
		this.expertSex = expertSex;
		this.expertTitle = expertTitle;
		this.expertAge = expertAge;
		this.expertViews = expertViews;
		this.expertWeixin = expertWeixin;
		this.expertQq = expertQq;
		this.orderNum = orderNum;
		this.praiseNum = praiseNum;
		this.complainNum = complainNum;
		this.expertorderDetailses = expertorderDetailses;
		this.userCollectionExperts = userCollectionExperts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "expert_id", unique = true, nullable = false)
	public Integer getExpertId() {
		return this.expertId;
	}

	public void setExpertId(Integer expertId) {
		this.expertId = expertId;
	}

	@Column(name = "expert_name", nullable = false)
	public String getExpertName() {
		return this.expertName;
	}

	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}

	@Column(name = "expert_phone", nullable = false)
	public String getExpertPhone() {
		return this.expertPhone;
	}

	public void setExpertPhone(String expertPhone) {
		this.expertPhone = expertPhone;
	}

	@Column(name = "expert_introduce", nullable = false)
	public String getExpertIntroduce() {
		return this.expertIntroduce;
	}

	public void setExpertIntroduce(String expertIntroduce) {
		this.expertIntroduce = expertIntroduce;
	}

	@Column(name = "expert_speciality", nullable = false)
	public String getExpertSpeciality() {
		return this.expertSpeciality;
	}

	public void setExpertSpeciality(String expertSpeciality) {
		this.expertSpeciality = expertSpeciality;
	}

	@Column(name = "expert_code", nullable = false)
	public String getExpertCode() {
		return this.expertCode;
	}

	public void setExpertCode(String expertCode) {
		this.expertCode = expertCode;
	}

	@Column(name = "expert_sex", nullable = false)
	public String getExpertSex() {
		return this.expertSex;
	}

	public void setExpertSex(String expertSex) {
		this.expertSex = expertSex;
	}

	@Column(name = "expert_title", nullable = false)
	public String getExpertTitle() {
		return this.expertTitle;
	}

	public void setExpertTitle(String expertTitle) {
		this.expertTitle = expertTitle;
	}

	@Column(name = "expert_age", nullable = false)
	public Integer getExpertAge() {
		return this.expertAge;
	}

	public void setExpertAge(Integer expertAge) {
		this.expertAge = expertAge;
	}

	@Column(name = "expert_views", nullable = false)
	public Integer getExpertViews() {
		return this.expertViews;
	}

	public void setExpertViews(Integer expertViews) {
		this.expertViews = expertViews;
	}

	@Column(name = "expert_weixin", nullable = false)
	public String getExpertWeixin() {
		return this.expertWeixin;
	}

	public void setExpertWeixin(String expertWeixin) {
		this.expertWeixin = expertWeixin;
	}

	@Column(name = "expert_qq", nullable = false)
	public String getExpertQq() {
		return this.expertQq;
	}

	public void setExpertQq(String expertQq) {
		this.expertQq = expertQq;
	}

	@Column(name = "order_num", nullable = false)
	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "praise_num", nullable = false)
	public Integer getPraiseNum() {
		return this.praiseNum;
	}

	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	@Column(name = "complain_num", nullable = false)
	public Integer getComplainNum() {
		return this.complainNum;
	}

	public void setComplainNum(Integer complainNum) {
		this.complainNum = complainNum;
	}
	
	@JsonIgnore
	@Column(name = "gdp001", length = 0)
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
	@Column(name = "gdp003", length = 0)
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
	@Column(name = "gdp006", length = 0)
	public String getGdp006() {
		return this.gdp006;
	}

	public void setGdp006(String gdp006) {
		this.gdp006 = gdp006;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "expertInf")
	public List<ExpertorderDetails> getExpertorderDetailses() {
		return this.expertorderDetailses;
	}

	public void setExpertorderDetailses(
			List<ExpertorderDetails> expertorderDetailses) {
		this.expertorderDetailses = expertorderDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "expertInf")
	public List<UserCollectionExpert> getUserCollectionExperts() {
		return this.userCollectionExperts;
	}

	public void setUserCollectionExperts(
			List<UserCollectionExpert> userCollectionExperts) {
		this.userCollectionExperts = userCollectionExperts;
	}

}