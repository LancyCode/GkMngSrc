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
 * @ClassName: AcademyInf 
 * @Description: 院校信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 上午11:28:08
 */

@Entity
@Table(name = "academy_inf", catalog = "gkzy_db")
public class AcademyInf implements java.io.Serializable {

	private Integer academyId;
	private String academyName;
	private String academyCode;
	private String academyPlace;
	private String academyIntroduce;
	private Integer beQueriedNum;
	private String academyTel;
	private String academyAffiliates;
	private String academyNature;
	private String academyWeb;
	private String schoolBadge;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<AcademyAdvantageSubject> academyAdvantageSubjects = new ArrayList<AcademyAdvantageSubject>();
	private List<UserSearchAcademy> userSearchAcademies = new ArrayList<UserSearchAcademy>();
	private List<UserCollectionAcademy> userCollectionAcademies = new ArrayList<UserCollectionAcademy>();
	private List<AcademyStyle> academyStyles = new ArrayList<AcademyStyle>();
	private List<AcademyRanking> academyRankings = new ArrayList<AcademyRanking>();


	public AcademyInf() {
	}

	public AcademyInf(String academyName, String academyCode,
			String academyPlace, String academyIntroduce, Integer beQueriedNum,
			String academyTel, String academyAffiliates, String academyNature,
			String academyWeb) {
		this.academyName = academyName;
		this.academyCode = academyCode;
		this.academyPlace = academyPlace;
		this.academyIntroduce = academyIntroduce;
		this.beQueriedNum = beQueriedNum;
		this.academyTel = academyTel;
		this.academyAffiliates = academyAffiliates;
		this.academyNature = academyNature;
		this.academyWeb = academyWeb;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "academy_id", unique = true, nullable = false)
	public Integer getAcademyId() {
		return this.academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	@Column(name = "academy_name", nullable = false, length = 50)
	public String getAcademyName() {
		return this.academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	@Column(name = "academy_code", nullable = false, length = 20)
	public String getAcademyCode() {
		return this.academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	@Column(name = "academy_place", nullable = false, length = 20)
	public String getAcademyPlace() {
		return this.academyPlace;
	}

	public void setAcademyPlace(String academyPlace) {
		this.academyPlace = academyPlace;
	}

	@Column(name = "academy_introduce", nullable = false)
	public String getAcademyIntroduce() {
		return this.academyIntroduce;
	}

	public void setAcademyIntroduce(String academyIntroduce) {
		this.academyIntroduce = academyIntroduce;
	}

	@Column(name = "beQueried_num", nullable = false)
	public Integer getBeQueriedNum() {
		return this.beQueriedNum;
	}

	public void setBeQueriedNum(Integer beQueriedNum) {
		this.beQueriedNum = beQueriedNum;
	}

	@Column(name = "academy_tel", nullable = false)
	public String getAcademyTel() {
		return this.academyTel;
	}

	public void setAcademyTel(String academyTel) {
		this.academyTel = academyTel;
	}

	@Column(name = "academy_affiliates", nullable = false, length = 50)
	public String getAcademyAffiliates() {
		return this.academyAffiliates;
	}

	public void setAcademyAffiliates(String academyAffiliates) {
		this.academyAffiliates = academyAffiliates;
	}

	@Column(name = "academy_nature", nullable = false, length = 50)
	public String getAcademyNature() {
		return this.academyNature;
	}

	public void setAcademyNature(String academyNature) {
		this.academyNature = academyNature;
	}

	@Column(name = "academy_web", nullable = false)
	public String getAcademyWeb() {
		return this.academyWeb;
	}

	public void setAcademyWeb(String academyWeb) {
		this.academyWeb = academyWeb;
	}

	@Column(name = "school_badge")
	public String getSchoolBadge() {
		return this.schoolBadge;
	}

	public void setSchoolBadge(String schoolBadge) {
		this.schoolBadge = schoolBadge;
	}

	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}
	
	@JsonIgnore
	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", length = 19)
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

	@Column(name = "gdp004", length = 19)
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyInf")
	public List<AcademyAdvantageSubject> getAcademyAdvantageSubjects() {
		return this.academyAdvantageSubjects;
	}
	
	@JsonIgnore
	public void setAcademyAdvantageSubjects(
			List<AcademyAdvantageSubject> academyAdvantageSubjects) {
		this.academyAdvantageSubjects = academyAdvantageSubjects;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyInf")
	public List<UserSearchAcademy> getUserSearchAcademies() {
		return this.userSearchAcademies;
	}
	
	@JsonIgnore
	public void setUserSearchAcademies(
			List<UserSearchAcademy> userSearchAcademies) {
		this.userSearchAcademies = userSearchAcademies;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyInf")
	public List<UserCollectionAcademy> getUserCollectionAcademies() {
		return this.userCollectionAcademies;
	}
	
	@JsonIgnore
	public void setUserCollectionAcademies(
			List<UserCollectionAcademy> userCollectionAcademies) {
		this.userCollectionAcademies = userCollectionAcademies;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyInf")
	public List<AcademyStyle> getAcademyStyles() {
		return this.academyStyles;
	}
	
	@JsonIgnore
	public void setAcademyStyles(List<AcademyStyle> academyStyles) {
		this.academyStyles = academyStyles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "academyInf")
	public List<AcademyRanking> getAcademyRankings() {
		return this.academyRankings;
	}
	
	@JsonIgnore
	public void setAcademyRankings(List<AcademyRanking> academyRankings) {
		this.academyRankings = academyRankings;
	}

}