package com.google.cloud.bigquery.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fb_creative")
public class Creative {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "ad_text")
	private String body;
	@Column(name = "fb_page_id")
    private String fbPageId;

	@Column(name = "campaign_id")
	private	int campaignId;

	@Column(name = "instagram_id")
    private String instagramId;
	
	@Column(name = "product_type")
	private String product_type;
	
	@Column(name = "rule")
	private String rule;
	
	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getInstagramId() {
		return instagramId;
	}

	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getFbPageId() {
		return fbPageId;
	}

	public void setFbPageId(String fbPageId) {
		this.fbPageId = fbPageId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	
	
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	@Column(name = "created_at")
	private String createdAt;
	@Column(name = "updated_at")
	private String updatedAt;
	
	
	@Column(name = "products")
	private String products;
	
	@Column(name = "is_updated")
	private String isUpdated;
	
	public String getIsUpdated() {
		return isUpdated;
	}

	public void setIsUpdated(String isUpdated) {
		this.isUpdated = isUpdated;
	}
	
	
	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}
	
	public String getCreative_name() {
		return creative_name;
	}

	public void setCreative_name(String creative_name) {
		this.creative_name = creative_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFacebook_creative_id() {
		return facebook_creative_id;
	}

	public void setFacebook_creative_id(String facebook_creative_id) {
		this.facebook_creative_id = facebook_creative_id;
	}


	@Column(name = "creative_name")
	private String creative_name;
	
	public String getIs_updated_creative() {
		return is_updated_creative;
	}

	public void setIs_updated_creative(String is_updated_creative) {
		this.is_updated_creative = is_updated_creative;
	}

	public String getIs_updated_ad() {
		return is_updated_ad;
	}

	public void setIs_updated_ad(String is_updated_ad) {
		this.is_updated_ad = is_updated_ad;
	}
	
	@Column(name = "parse_campaign_id")
	private String parse_campaign_id;

	public String getParse_campaign_id() {
		return parse_campaign_id;
	}

	public void setParse_campaign_id(String parse_campaign_id) {
		this.parse_campaign_id = parse_campaign_id;
	}


	@Column(name = "status")
	private String status;

	@Column(name = "is_updated_creative")
	private String is_updated_creative;
	
	@Column(name = "is_updated_ad")
	private String is_updated_ad;
	
	@Column(name = "facebook_creative_id")
	private String facebook_creative_id;

}
