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
 * @ClassName: KnowageCenterDetails 
 * @Description: 知识中心明细
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午3:01:06
 */
@Entity
@Table(name = "knowage_center_details", catalog = "gkzy_db")
public class KnowageCenterDetails implements java.io.Serializable {

	private Integer kcdId;
	private KnowledgeCenterType knowledgeCenterType;
	private Integer kctId;
	private String kcdTitle;
	private String kcdDescription;
	private Integer identifyLabel;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public KnowageCenterDetails() {
	}

	public KnowageCenterDetails(KnowledgeCenterType knowledgeCenterType,
			Integer kctId, String kcdTitle, String kcdDescription,
			Integer identifyLabel) {
		this.knowledgeCenterType = knowledgeCenterType;
		this.kctId = kctId;
		this.kcdTitle = kcdTitle;
		this.kcdDescription = kcdDescription;
		this.identifyLabel = identifyLabel;
	}

	public KnowageCenterDetails(KnowledgeCenterType knowledgeCenterType,
			Integer kctId, String kcdTitle, String kcdDescription,
			Integer identifyLabel, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.knowledgeCenterType = knowledgeCenterType;
		this.kctId = kctId;
		this.kcdTitle = kcdTitle;
		this.kcdDescription = kcdDescription;
		this.identifyLabel = identifyLabel;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "kcd_id", unique = true, nullable = false)
	public Integer getKcdId() {
		return this.kcdId;
	}

	public void setKcdId(Integer kcdId) {
		this.kcdId = kcdId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kcd_id", unique = true, nullable = false, insertable = false, updatable = false)
	public KnowledgeCenterType getKnowledgeCenterType() {
		return this.knowledgeCenterType;
	}

	public void setKnowledgeCenterType(KnowledgeCenterType knowledgeCenterType) {
		this.knowledgeCenterType = knowledgeCenterType;
	}

	@Column(name = "kct_id", nullable = false)
	public Integer getKctId() {
		return this.kctId;
	}

	public void setKctId(Integer kctId) {
		this.kctId = kctId;
	}

	@Column(name = "kcd_title", nullable = false, length = 50)
	public String getKcdTitle() {
		return this.kcdTitle;
	}

	public void setKcdTitle(String kcdTitle) {
		this.kcdTitle = kcdTitle;
	}

	@Column(name = "kcd_description", nullable = false)
	public String getKcdDescription() {
		return this.kcdDescription;
	}

	public void setKcdDescription(String kcdDescription) {
		this.kcdDescription = kcdDescription;
	}

	@Column(name = "identify_label", nullable = false)
	public Integer getIdentifyLabel() {
		return this.identifyLabel;
	}

	public void setIdentifyLabel(Integer identifyLabel) {
		this.identifyLabel = identifyLabel;
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