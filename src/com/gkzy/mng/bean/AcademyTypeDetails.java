package com.gkzy.mng.bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @ClassName: AcademyTypeDetails 
 * @Description: 院校类型明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午2:18:18
 */

@Entity
@Table(name = "academy_type_details", catalog = "gkzy_db")
public class AcademyTypeDetails implements java.io.Serializable {

	private Integer atdId;
	private Integer aiId;
	private Integer atypeId;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public AcademyTypeDetails() {
	}

	public AcademyTypeDetails(Integer aiId, Integer atypeId) {
		this.aiId = aiId;
		this.atypeId = atypeId;
	}

	public AcademyTypeDetails(Integer aiId, Integer atypeId, String gdp001,
			Date gdp002, String gdp003, Date gdp004, Integer gdp005,
			String gdp006) {
		this.aiId = aiId;
		this.atypeId = atypeId;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "atd_id", unique = true, nullable = false)
	public Integer getAtdId() {
		return this.atdId;
	}

	public void setAtdId(Integer atdId) {
		this.atdId = atdId;
	}

	@Column(name = "ai_id", nullable = false)
	public Integer getAiId() {
		return this.aiId;
	}

	public void setAiId(Integer aiId) {
		this.aiId = aiId;
	}

	@Column(name = "atype_id", nullable = false)
	public Integer getAtypeId() {
		return this.atypeId;
	}

	public void setAtypeId(Integer atypeId) {
		this.atypeId = atypeId;
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