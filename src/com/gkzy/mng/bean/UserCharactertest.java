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

/**
 * 
 * @ClassName: UserCharactertest 
 * @Description: 用户性格测试记录
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:50:29
 */
@Entity
@Table(name = "user_charactertest", catalog = "gkzy_db")
public class UserCharactertest implements java.io.Serializable {

	private Integer utId;
	private GkzyUser gkzyUser;
	private Integer userId;
	private Date testTime;
	private String testResult;
	private String testFeedback;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public UserCharactertest() {
	}

	public UserCharactertest(GkzyUser gkzyUser, Integer userId,
			Date testTime, String testResult, String testFeedback) {
		this.gkzyUser = gkzyUser;
		this.userId = userId;
		this.testTime = testTime;
		this.testResult = testResult;
		this.testFeedback = testFeedback;
	}

	public UserCharactertest(GkzyUser gkzyUser, Integer userId,
			Date testTime, String testResult, String testFeedback,
			String gdp001, Date gdp002, String gdp003, Date gdp004,
			Integer gdp005, String gdp006) {
		this.gkzyUser = gkzyUser;
		this.userId = userId;
		this.testTime = testTime;
		this.testResult = testResult;
		this.testFeedback = testFeedback;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ut_id", unique = true, nullable = false)
	public Integer getUtId() {
		return this.utId;
	}

	public void setUtId(Integer utId) {
		this.utId = utId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ut_id", unique = true, nullable = false, insertable = false, updatable = false)
	public GkzyUser getGkzyUser() {
		return this.gkzyUser;
	}

	public void setGkzyUser(GkzyUser gkzyUser) {
		this.gkzyUser = gkzyUser;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "test_time", nullable = false, length = 19)
	public Date getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Date testTime) {
		this.testTime = testTime;
	}

	@Column(name = "test_result", nullable = false)
	public String getTestResult() {
		return this.testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	@Column(name = "test_feedback", nullable = false)
	public String getTestFeedback() {
		return this.testFeedback;
	}

	public void setTestFeedback(String testFeedback) {
		this.testFeedback = testFeedback;
	}

	@Column(name = "gdp001")
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}

	@Column(name = "gdp002", length = 19)
	public Date getGdp002() {
		return this.gdp002;
	}

	public void setGdp002(Date gdp002) {
		this.gdp002 = gdp002;
	}

	@Column(name = "gdp003")
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}

	@Column(name = "gdp004", length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}

	@Column(name = "gdp005")
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