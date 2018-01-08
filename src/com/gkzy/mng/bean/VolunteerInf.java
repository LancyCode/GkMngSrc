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
 * @ClassName: VolunteerInf 
 * @Description: 用户志愿表信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:30:01
 */

@Entity
@Table(name = "volunteer_inf", catalog = "gkzy_db")
public class VolunteerInf implements java.io.Serializable {

	private Integer viId;
	private GkzyUser gkzyUser;
	private String examineeName;
	private String examineeNum;
	private String viLevel;
	private String viYear;
	private Date viTime;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<VolunteerAcademyInf> volunteerAcademyInfs = new ArrayList<VolunteerAcademyInf>();
	private List<UserCollectionVolunteer> userCollectionVolunteers = new ArrayList<UserCollectionVolunteer>();

	public VolunteerInf() {
	}

	public VolunteerInf(GkzyUser gkzyUser, String examineeName,
			String examineeNum, String viLevel, String viYear, Date viTime) {
		this.gkzyUser = gkzyUser;
		this.examineeName = examineeName;
		this.examineeNum = examineeNum;
		this.viLevel = viLevel;
		this.viYear = viYear;
		this.viTime = viTime;
	}

	public VolunteerInf(GkzyUser gkzyUser, String examineeName,
			String examineeNum, String viLevel, String viYear,
			Date viTime, String gdp001, Date gdp002, String gdp003,
			Date gdp004, Integer gdp005, String gdp006,
			List<VolunteerAcademyInf> volunteerAcademyInfs,
			List<UserCollectionVolunteer> userCollectionVolunteers) {
		this.gkzyUser = gkzyUser;
		this.examineeName = examineeName;
		this.examineeNum = examineeNum;
		this.viLevel = viLevel;
		this.viYear = viYear;
		this.viTime = viTime;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
		this.volunteerAcademyInfs = volunteerAcademyInfs;
		this.userCollectionVolunteers = userCollectionVolunteers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vi_id", unique = true, nullable = false)
	public Integer getViId() {
		return this.viId;
	}

	public void setViId(Integer viId) {
		this.viId = viId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}

	@Column(name = "examinee_name", nullable = false, length = 50)
	public String getExamineeName() {
		return this.examineeName;
	}

	public void setExamineeName(String examineeName) {
		this.examineeName = examineeName;
	}

	@Column(name = "examinee_num", nullable = false, length = 50)
	public String getExamineeNum() {
		return this.examineeNum;
	}

	public void setExamineeNum(String examineeNum) {
		this.examineeNum = examineeNum;
	}

	@Column(name = "vi_level", nullable = false, length = 10)
	public String getViLevel() {
		return this.viLevel;
	}

	public void setViLevel(String viLevel) {
		this.viLevel = viLevel;
	}

	@Column(name = "vi_year", nullable = false, length = 4)
	public String getViYear() {
		return this.viYear;
	}

	public void setViYear(String viYear) {
		this.viYear = viYear;
	}

	@Column(name = "vi_time", nullable = false, length = 19)
	public Date getViTime() {
		return this.viTime;
	}

	public void setViTime(Date viTime) {
		this.viTime = viTime;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "volunteerInf")
	public List<VolunteerAcademyInf> getVolunteerAcademyInfs() {
		return this.volunteerAcademyInfs;
	}

	public void setVolunteerAcademyInfs(
			List<VolunteerAcademyInf> volunteerAcademyInfs) {
		this.volunteerAcademyInfs = volunteerAcademyInfs;
	}
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "volunteerInf")
	public List<UserCollectionVolunteer> getUserCollectionVolunteers() {
		return this.userCollectionVolunteers;
	}

	public void setUserCollectionVolunteers(
			List<UserCollectionVolunteer> userCollectionVolunteers) {
		this.userCollectionVolunteers = userCollectionVolunteers;
	}

}