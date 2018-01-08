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
 * @ClassName: UserSearchAcademy 
 * @Description: 用户院校搜索记录
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午5:20:39
 */

@Entity
@Table(name = "user_search_academy", catalog = "gkzy_db")
public class UserSearchAcademy implements java.io.Serializable {

	private Integer usaId;
	private GkzyUser gkzyUser;
	private AcademyInf academyInf;
	private Date lastSearchTime;
	private Integer searchNum;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public UserSearchAcademy() {
	}

	public UserSearchAcademy(AcademyInf academyInf, Date lastSearchTime,
			Integer searchNum) {
		this.academyInf = academyInf;
		this.lastSearchTime = lastSearchTime;
		this.searchNum = searchNum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "usa_id", unique = true, nullable = false)
	public Integer getUsaId() {
		return this.usaId;
	}

	public void setUsaId(Integer usaId) {
		this.usaId = usaId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "academy_id", nullable = false)
	public AcademyInf getAcademyInf() {
		return this.academyInf;
	}

	public void setAcademyInf(AcademyInf academyInf) {
		this.academyInf = academyInf;
	}

	@Column(name = "lastSearch_time", nullable = false, length = 19)
	public Date getLastSearchTime() {
		return this.lastSearchTime;
	}

	public void setLastSearchTime(Date lastSearchTime) {
		this.lastSearchTime = lastSearchTime;
	}

	@Column(name = "search_num", nullable = false)
	public Integer getSearchNum() {
		return this.searchNum;
	}

	public void setSearchNum(Integer searchNum) {
		this.searchNum = searchNum;
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