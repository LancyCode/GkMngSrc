package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: ExamineeFaq 
 * @Description: 考生常见问题
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:42:07
 */

@Entity
@Table(name = "examinee_faq", catalog = "gkzy_db")
public class ExamineeFaq implements java.io.Serializable {

	private Integer faqId;
	private String faqTitle;
	private String faqAnswer;
	private Integer pageView;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public ExamineeFaq() {
	}

	public ExamineeFaq(String faqTitle, String faqAnswer, Integer pageView) {
		this.faqTitle = faqTitle;
		this.faqAnswer = faqAnswer;
		this.pageView = pageView;
	}

	public ExamineeFaq(String faqTitle, String faqAnswer, Integer pageView,
			String gdp001, Date gdp002, String gdp003, Date gdp004,
			Integer gdp005, String gdp006) {
		this.faqTitle = faqTitle;
		this.faqAnswer = faqAnswer;
		this.pageView = pageView;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "faq_id", unique = true, nullable = false)
	public Integer getFaqId() {
		return this.faqId;
	}

	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}

	@Column(name = "faq_title", nullable = false)
	public String getFaqTitle() {
		return this.faqTitle;
	}

	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}

	@Column(name = "faq_answer", nullable = false)
	public String getFaqAnswer() {
		return this.faqAnswer;
	}

	public void setFaqAnswer(String faqAnswer) {
		this.faqAnswer = faqAnswer;
	}

	@Column(name = "pageView", nullable = false)
	public Integer getPageView() {
		return this.pageView;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
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