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
 * @ClassName: SellerPaymentInf 
 * @Description: 商户支付信息
 * @author 共享智汇.赵仕建 
 * @date 2017年12月27日 下午4:13:36
 */

@Entity
@Table(name = "seller_payment_inf", catalog = "gkzy_db")
public class SellerPaymentInf implements java.io.Serializable {

	private Integer spiId;
	private String sellerName;
	private String apAppid;
	private String privateKey;
	private String publicKey;
	private String wpAppid;
	private String mchId;
	private String wpKey;
	private String certstream;
	private String gdp001;
	private Date gdp002;
	private String gdp003;
	private Date gdp004;
	private Integer gdp005;
	private String gdp006;

	public SellerPaymentInf() {
	}

	public SellerPaymentInf(String sellerName, String apAppid,
			String privateKey, String publicKey, String wpAppid, String mchId,
			String wpKey, String certstream) {
		this.sellerName = sellerName;
		this.apAppid = apAppid;
		this.privateKey = privateKey;
		this.publicKey = publicKey;
		this.wpAppid = wpAppid;
		this.mchId = mchId;
		this.wpKey = wpKey;
		this.certstream = certstream;
	}

	public SellerPaymentInf(String sellerName, String apAppid,
			String privateKey, String publicKey, String wpAppid, String mchId,
			String wpKey, String certstream, String gdp001, Date gdp002,
			String gdp003, Date gdp004, Integer gdp005, String gdp006) {
		this.sellerName = sellerName;
		this.apAppid = apAppid;
		this.privateKey = privateKey;
		this.publicKey = publicKey;
		this.wpAppid = wpAppid;
		this.mchId = mchId;
		this.wpKey = wpKey;
		this.certstream = certstream;
		this.gdp001 = gdp001;
		this.gdp002 = gdp002;
		this.gdp003 = gdp003;
		this.gdp004 = gdp004;
		this.gdp005 = gdp005;
		this.gdp006 = gdp006;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "spi_id", unique = true, nullable = false)
	public Integer getSpiId() {
		return this.spiId;
	}

	public void setSpiId(Integer spiId) {
		this.spiId = spiId;
	}

	@Column(name = "seller_name", nullable = false)
	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Column(name = "ap_appid", nullable = false)
	public String getApAppid() {
		return this.apAppid;
	}

	public void setApAppid(String apAppid) {
		this.apAppid = apAppid;
	}

	@Column(name = "private_key", nullable = false)
	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	@Column(name = "public_key", nullable = false)
	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Column(name = "wp_appid", nullable = false)
	public String getWpAppid() {
		return this.wpAppid;
	}

	public void setWpAppid(String wpAppid) {
		this.wpAppid = wpAppid;
	}

	@Column(name = "mch_id", nullable = false)
	public String getMchId() {
		return this.mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	@Column(name = "wp_key", nullable = false)
	public String getWpKey() {
		return this.wpKey;
	}

	public void setWpKey(String wpKey) {
		this.wpKey = wpKey;
	}

	@Column(name = "certstream", nullable = false)
	public String getCertstream() {
		return this.certstream;
	}

	public void setCertstream(String certstream) {
		this.certstream = certstream;
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