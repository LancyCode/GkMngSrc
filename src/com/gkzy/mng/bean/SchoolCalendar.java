package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: SchoolCalendar 
 * @Description: 升学日历
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:03:00
 */
@Entity
@Table(name = "school_calendar", catalog = "gkzy_db")
public class SchoolCalendar implements java.io.Serializable {


	private Integer scId;
	private String scTitle;
	private String scContent;
	private Date remindingDate;
	private Integer scGrade;
	private String gdp001;
	private Date gdo002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public SchoolCalendar() {
	}

	public SchoolCalendar(String scTitle, String scContent, Date remindingDate,
			Integer scGrade, String gdp001, Date gdo002, String gdp003,
			Date gdp004, Integer gdp005) {
		this.scTitle = scTitle;
		this.scContent = scContent;
		this.remindingDate = remindingDate;
		this.scGrade = scGrade;
		this.gdp001 = gdp001;
		this.gdo002 = gdo002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
	}

	public SchoolCalendar(String scTitle, String scContent, Date remindingDate,
			Integer scGrade, String gdp001, Date gdo002, String gdp003,
			Date gdp004, Integer gdp005, String gdp006) {
		this.scTitle = scTitle;
		this.scContent = scContent;
		this.remindingDate = remindingDate;
		this.scGrade = scGrade;
		this.gdp001 = gdp001;
		this.gdo002 = gdo002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sc_id", unique = true, nullable = false)
	public Integer getScId() {
		return this.scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	@Column(name = "sc_title", nullable = false)
	public String getScTitle() {
		return this.scTitle;
	}

	public void setScTitle(String scTitle) {
		this.scTitle = scTitle;
	}

	@Column(name = "sc_content", nullable = false)
	public String getScContent() {
		return this.scContent;
	}

	public void setScContent(String scContent) {
		this.scContent = scContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "reminding_date", nullable = false, length = 10)
	public Date getRemindingDate() {
		return this.remindingDate;
	}

	public void setRemindingDate(Date remindingDate) {
		this.remindingDate = remindingDate;
	}

	@Column(name = "sc_grade", nullable = false)
	public Integer getScGrade() {
		return this.scGrade;
	}

	public void setScGrade(Integer scGrade) {
		this.scGrade = scGrade;
	}
		
	@JsonIgnore
	@Column(name = "gdp001", nullable = false)
	public String getGdp001() {
		return this.gdp001;
	}

	public void setGdp001(String gdp001) {
		this.gdp001 = gdp001;
	}
	
	@JsonIgnore
	@Column(name = "gdo002", nullable = false, length = 19)
	public Date getGdo002() {
		return this.gdo002;
	}

	public void setGdo002(Date gdo002) {
		this.gdo002 = gdo002;
	}
	
	@JsonIgnore
	@Column(name = "gdp003", nullable = false)
	public String getGdp003() {
		return this.gdp003;
	}

	public void setGdp003(String gdp003) {
		this.gdp003 = gdp003;
	}
	
	@JsonIgnore
	@Column(name = "gdp004", nullable = false, length = 19)
	public Date getGdp004() {
		return this.gdp004;
	}

	public void setGdp004(Date gdp004) {
		this.gdp004 = gdp004;
	}
	
	@JsonIgnore
	@Column(name = "gdp005", nullable = false)
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