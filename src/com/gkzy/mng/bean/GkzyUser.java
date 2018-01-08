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
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: GkzyUser 
 * @Description: 高考志愿用户信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:58:52
 */

@Entity
@Table(name = "gkzy_user", catalog = "gkzy_db")
public class GkzyUser implements java.io.Serializable {

	private Integer userId;
	private String userPhone;
	private String userName;
	private Integer userIdentity;
	private String candidateNumber;
	private String userSex;
	private String userAge;
	private String userIdCard;
	private String userNation;
	private String userPlace;
	private String highSchool;
	private String userPicture;
	private String userGrade;
	private String userWeixin;
	private String userQq;
	private String userMail;
	private String userAddress;
	private String userHobby;
	private Date registerTime;
	private Date lastLoginTime;
	private Integer isConsume;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<UserScore> userScores = new ArrayList<UserScore>();
	private List<ExpthreeDetails> expthreeDetailses = new ArrayList<ExpthreeDetails>();
	private List<ExpertorderDetails> expertorderDetailses = new ArrayList<ExpertorderDetails>();
	private List<BuyDetails> buyDetailses = new ArrayList<BuyDetails>();
	private List<UserCollectionExpert> userCollectionExperts = new ArrayList<UserCollectionExpert>();
	private List<UserSearchAcademy> userSearchAcademies = new ArrayList<UserSearchAcademy>();
	private List<VolunteerInf> volunteerInfs = new ArrayList<VolunteerInf>();
	private List<UserVolunteerAdmit> userVolunteerAdmits = new ArrayList<UserVolunteerAdmit>();
	private List<UserCollectionAcademy> userCollectionAcademies = new ArrayList<UserCollectionAcademy>();
	private List<ExponeDetails> exponeDetailses = new ArrayList<ExponeDetails>();
	private List<UserCollectionFaq> userCollectionFaqs = new ArrayList<UserCollectionFaq>();
	private List<UserCollectionVolunteer> userCollectionVolunteers = new ArrayList<UserCollectionVolunteer>();
	private List<UserCharactertest> userCharactertests = new ArrayList<UserCharactertest>();
	private List<UserCollectionMajor> userCollectionMajors = new ArrayList<UserCollectionMajor>();
	
	public GkzyUser() {
	}

	public GkzyUser(Integer userId, String userPhone, String userPicture) {
		this.userId = userId;
		this.userPhone = userPhone;
		this.userPicture = userPicture;
	}
	
	public GkzyUser(Integer userId, List<UserCollectionAcademy> userCollectionAcademies, 
			List<UserCollectionMajor> userCollectionMajors,List<UserCollectionVolunteer> userCollectionVolunteers) {
		this.userId = userId;
		this.userCollectionAcademies = userCollectionAcademies;
		this.userCollectionMajors = userCollectionMajors;
		this.userCollectionVolunteers = userCollectionVolunteers;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_phone", nullable = false, length = 11)
	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Column(name = "user_name", length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_identity")
	public Integer getUserIdentity() {
		return this.userIdentity;
	}

	public void setUserIdentity(Integer userIdentity) {
		this.userIdentity = userIdentity;
	}

	@Column(name = "candidate_number", length = 50)
	public String getCandidateNumber() {
		return this.candidateNumber;
	}

	public void setCandidateNumber(String candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	@Column(name = "user_sex", length = 2)
	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Column(name = "user_age", length = 2)
	public String getUserAge() {
		return this.userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	
	@Column(name = "user_idCard", length = 18)
	public String getUserIdCard() {
		return this.userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	@Column(name = "user_nation", length = 50)
	public String getUserNation() {
		return this.userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	@Column(name = "user_place", length = 50)
	public String getUserPlace() {
		return this.userPlace;
	}

	public void setUserPlace(String userPlace) {
		this.userPlace = userPlace;
	}

	@Column(name = "high_school", length = 50)
	public String getHighSchool() {
		return this.highSchool;
	}

	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}

	@Column(name = "user_picture", length = 50)
	public String getUserPicture() {
		return this.userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}

	@Column(name = "user_grade", length = 10)
	public String getUserGrade() {
		return this.userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	@Column(name = "user_weixin", length = 20)
	public String getUserWeixin() {
		return this.userWeixin;
	}

	public void setUserWeixin(String userWeixin) {
		this.userWeixin = userWeixin;
	}

	@Column(name = "user_qq", length = 20)
	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	@Column(name = "user_mail", length = 50)
	public String getUserMail() {
		return this.userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Column(name = "user_address", length = 100)
	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Column(name = "user_hobby", length = 200)
	public String getUserHobby() {
		return this.userHobby;
	}

	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}

	@Column(name = "register_time")
	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name = "lastLogin_time")
	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "isConsume")
	public Integer getIsConsume() {
		return this.isConsume;
	}

	public void setIsConsume(Integer isConsume) {
		this.isConsume = isConsume;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserScore> getUserScores() {
		return this.userScores;
	}
	
	public void setUserScores(List<UserScore> userScores) {
		this.userScores = userScores;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<ExpthreeDetails> getExpthreeDetailses() {
		return this.expthreeDetailses;
	}
	
	public void setExpthreeDetailses(List<ExpthreeDetails> expthreeDetailses) {
		this.expthreeDetailses = expthreeDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<ExpertorderDetails> getExpertorderDetailses() {
		return this.expertorderDetailses;
	}

	public void setExpertorderDetailses(
			List<ExpertorderDetails> expertorderDetailses) {
		this.expertorderDetailses = expertorderDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<BuyDetails> getBuyDetailses() {
		return this.buyDetailses;
	}
	
	public void setBuyDetailses(List<BuyDetails> buyDetailses) {
		this.buyDetailses = buyDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCollectionExpert> getUserCollectionExperts() {
		return this.userCollectionExperts;
	}
	
	public void setUserCollectionExperts(
			List<UserCollectionExpert> userCollectionExperts) {
		this.userCollectionExperts = userCollectionExperts;
	}

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserSearchAcademy> getUserSearchAcademies() {
		return this.userSearchAcademies;
	}
	
	public void setUserSearchAcademies(
			List<UserSearchAcademy> userSearchAcademies) {
		this.userSearchAcademies = userSearchAcademies;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<VolunteerInf> getVolunteerInfs() {
		return this.volunteerInfs;
	}
	
	public void setVolunteerInfs(List<VolunteerInf> volunteerInfs) {
		this.volunteerInfs = volunteerInfs;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserVolunteerAdmit> getUserVolunteerAdmits() {
		return this.userVolunteerAdmits;
	}
	
	public void setUserVolunteerAdmits(
			List<UserVolunteerAdmit> userVolunteerAdmits) {
		this.userVolunteerAdmits = userVolunteerAdmits;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCollectionAcademy> getUserCollectionAcademies() {
		return this.userCollectionAcademies;
	}
	
	public void setUserCollectionAcademies(
			List<UserCollectionAcademy> userCollectionAcademies) {
		this.userCollectionAcademies = userCollectionAcademies;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<ExponeDetails> getExponeDetailses() {
		return this.exponeDetailses;
		}
	
	public void setExponeDetailses(List<ExponeDetails> exponeDetailses) {
		this.exponeDetailses = exponeDetailses;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCollectionFaq> getUserCollectionFaqs() {
		return this.userCollectionFaqs;
	}
	
	public void setUserCollectionFaqs(List<UserCollectionFaq> userCollectionFaqs) {
		this.userCollectionFaqs = userCollectionFaqs;
	}

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCollectionVolunteer> getUserCollectionVolunteers() {
		return this.userCollectionVolunteers;
	}
	
	public void setUserCollectionVolunteers(
			List<UserCollectionVolunteer> userCollectionVolunteers) {
		this.userCollectionVolunteers = userCollectionVolunteers;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCharactertest> getUserCharactertests() {
		return this.userCharactertests;
	}
	
	public void setUserCharactertests(List<UserCharactertest> userCharactertests) {
		this.userCharactertests = userCharactertests;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gkzyUser")
	public List<UserCollectionMajor> getUserCollectionMajors() {
		return userCollectionMajors;
	}

	public void setUserCollectionMajors(List<UserCollectionMajor> userCollectionMajors) {
		this.userCollectionMajors = userCollectionMajors;
	}
}