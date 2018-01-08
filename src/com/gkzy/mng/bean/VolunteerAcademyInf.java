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
 * @ClassName: VolunteerAcademyInf 
 * @Description: 用户志愿表院校信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:37:12
 */
@Entity
@Table(name = "volunteer_academy_inf", catalog = "gkzy_db")
public class VolunteerAcademyInf implements java.io.Serializable {

	private Integer vaiId;
	private VolunteerInf volunteerInf;
	private String academyName;
	private String academyCode;
	private Integer isallocate;
	private String academyNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<VolunteerMajorInf> volunteerMajorInfs = new ArrayList<VolunteerMajorInf>(
			0);

	public VolunteerAcademyInf() {
	}

	public VolunteerAcademyInf(VolunteerInf volunteerInf, String academyName,
			String academyCode, Integer isallocate, String academyNum) {
		this.volunteerInf = volunteerInf;
		this.academyName = academyName;
		this.academyCode = academyCode;
		this.isallocate = isallocate;
		this.academyNum = academyNum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vai_id", unique = true, nullable = false)
	public Integer getVaiId() {
		return this.vaiId;
	}

	public void setVaiId(Integer vaiId) {
		this.vaiId = vaiId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vi_id", nullable = false)
	public VolunteerInf getVolunteerInf() {
		return this.volunteerInf;
	}

	public void setVolunteerInf(VolunteerInf volunteerInf) {
		this.volunteerInf = volunteerInf;
	}

	@Column(name = "academy_name", nullable = false, length = 50)
	public String getAcademyName() {
		return this.academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	@Column(name = "academy_code", nullable = false, length = 50)
	public String getAcademyCode() {
		return this.academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	@Column(name = "isallocate", nullable = false)
	public Integer getIsallocate() {
		return this.isallocate;
	}

	public void setIsallocate(Integer isallocate) {
		this.isallocate = isallocate;
	}

	@Column(name = "academy_num", nullable = false, length = 2)
	public String getAcademyNum() {
		return this.academyNum;
	}

	public void setAcademyNum(String academyNum) {
		this.academyNum = academyNum;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "volunteerAcademyInf")
	public List<VolunteerMajorInf> getVolunteerMajorInfs() {
		return this.volunteerMajorInfs;
	}

	public void setVolunteerMajorInfs(List<VolunteerMajorInf> volunteerMajorInfs) {
		this.volunteerMajorInfs = volunteerMajorInfs;
	}

}