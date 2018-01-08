package com.gkzy.mng.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @ClassName: AcademyEnrollmentPlan 
 * @Description: 院校招生计划
 * @author 共享智汇.赵仕建 
 * @date 2018年1月4日 下午4:21:11
 */

@Entity
@Table(name="academy_enrollment_plan",catalog="gkzy_db")
public class AcademyEnrollmentPlan  implements java.io.Serializable {

     private Integer aepId;
     private AcademyBatch academyBatch;
     private AcedemyMajor acedemyMajor;
     private String aepYear;
     private Integer eapStream;
     private Integer artsNum;
     private Integer scienceNum;
     private Integer artsandscienceNum;
     private Integer tuition;
     private String cmmt;
     private String gdp001;
     private Date gdp002;
     private String gdp003;
     private Date gdp004;
     private Integer gdp005;
     private String gdp006;


    public AcademyEnrollmentPlan() {
    }

    public AcademyEnrollmentPlan(AcademyBatch academyBatch, AcedemyMajor acedemyMajor, String aepYear, Integer eapStream, Integer tuition) {
        this.academyBatch = academyBatch;
        this.acedemyMajor = acedemyMajor;
        this.aepYear = aepYear;
        this.eapStream = eapStream;
        this.tuition = tuition;
    }
    
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="aep_id", unique=true, nullable=false)
    public Integer getAepId() {
        return this.aepId;
    }
    
    public void setAepId(Integer aepId) {
        this.aepId = aepId;
    }
    
    @JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="abatch_id", nullable=false)
    public AcademyBatch getAcademyBatch() {
        return this.academyBatch;
    }
    
    public void setAcademyBatch(AcademyBatch academyBatch) {
        this.academyBatch = academyBatch;
    }
    
    @JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="am_id", nullable=false)
    public AcedemyMajor getAcedemyMajor() {
        return this.acedemyMajor;
    }
    
    public void setAcedemyMajor(AcedemyMajor acedemyMajor) {
        this.acedemyMajor = acedemyMajor;
    }
    
    @Column(name="aep_year", nullable=false)
    public String getAepYear() {
        return this.aepYear;
    }
    
    public void setAepYear(String aepYear) {
        this.aepYear = aepYear;
    }
    
    @Column(name="eap_stream", nullable=false)
    public Integer getEapStream() {
        return this.eapStream;
    }
    
    public void setEapStream(Integer eapStream) {
        this.eapStream = eapStream;
    }
    
    @Column(name="arts_num")
    public Integer getArtsNum() {
        return this.artsNum;
    }
    
    public void setArtsNum(Integer artsNum) {
        this.artsNum = artsNum;
    }
    
    @Column(name="science_num")
    public Integer getScienceNum() {
        return this.scienceNum;
    }
    
    public void setScienceNum(Integer scienceNum) {
        this.scienceNum = scienceNum;
    }
    
    @Column(name="artsandscience_num")
    public Integer getArtsandscienceNum() {
        return this.artsandscienceNum;
    }
    
    public void setArtsandscienceNum(Integer artsandscienceNum) {
        this.artsandscienceNum = artsandscienceNum;
    }
    
    @Column(name="tuition", nullable=false)
    public Integer getTuition() {
        return this.tuition;
    }
    
    public void setTuition(Integer tuition) {
        this.tuition = tuition;
    }
    
    @Column(name="cmmt")
    public String getCmmt() {
        return this.cmmt;
    }
    
    public void setCmmt(String cmmt) {
        this.cmmt = cmmt;
    }
    
    @JsonIgnore
    @Column(name="gdp001")
    public String getGdp001() {
        return this.gdp001;
    }
    
    public void setGdp001(String gdp001) {
        this.gdp001 = gdp001;
    }
    
    @JsonIgnore
    @Column(name="gdp002", length=19)
    public Date getGdp002() {
        return this.gdp002;
    }
    
    public void setGdp002(Date gdp002) {
        this.gdp002 = gdp002;
    }
    
    @JsonIgnore
    @Column(name="gdp003")
    public String getGdp003() {
        return this.gdp003;
    }
    
    public void setGdp003(String gdp003) {
        this.gdp003 = gdp003;
    }
    
    @JsonIgnore
    @Column(name="gdp004", length=19)
    public Date getGdp004() {
        return this.gdp004;
    }
    
    public void setGdp004(Date gdp004) {
        this.gdp004 = gdp004;
    }
    
    @JsonIgnore
    @Column(name="gdp005")
    public Integer getGdp005() {
        return this.gdp005;
    }
    
    public void setGdp005(Integer gdp005) {
        this.gdp005 = gdp005;
    }
    
    @JsonIgnore
    @Column(name="gdp006")
    public String getGdp006() {
        return this.gdp006;
    }
    
    public void setGdp006(String gdp006) {
        this.gdp006 = gdp006;
    }
   
}