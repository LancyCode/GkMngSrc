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
 * @ClassName: KnowledgeCenterType 
 * @Description: 知识中心类型
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:04:28
 */

@Entity
@Table(name = "knowledge_center_type", catalog = "gkzy_db")
public class KnowledgeCenterType implements java.io.Serializable {

	private Integer kctId;
	private String kctName;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;
	private List<KnowageCenterDetails> knowageCenterDetailses = new ArrayList<KnowageCenterDetails>();

	public KnowledgeCenterType() {
	}

	public KnowledgeCenterType(String kctName) {
		this.kctName = kctName;
	}

	public KnowledgeCenterType(String kctName, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006,
			List<KnowageCenterDetails> knowageCenterDetailses) {
		this.kctName = kctName;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
		this.knowageCenterDetailses = knowageCenterDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "kct_id", unique = true, nullable = false)
	public Integer getKctId() {
		return this.kctId;
	}

	public void setKctId(Integer kctId) {
		this.kctId = kctId;
	}

	@Column(name = "kct_name", nullable = false, length = 50)
	public String getKctName() {
		return this.kctName;
	}

	public void setKctName(String kctName) {
		this.kctName = kctName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "knowledgeCenterType")
	public List<KnowageCenterDetails> getKnowageCenterDetailses() {
		return this.knowageCenterDetailses;
	}

	public void setKnowageCenterDetailses(
			List<KnowageCenterDetails> knowageCenterDetailses) {
		this.knowageCenterDetailses = knowageCenterDetailses;
	}

}