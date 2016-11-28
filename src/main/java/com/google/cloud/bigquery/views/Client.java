package com.google.cloud.bigquery.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "company_name")
	private String businessName;
	@Column(name = "is_updated")
	private int isUpdated;
	@Column(name = "custom_audience_id")
	private String customAudienceId;

	@Column(name = "website_audience_id")
	private String websiteAudienceId;
	@Column(name = "catalog_id")
	private String catalogId;
	
	@Column(name = "partner")
	private String partner;
	
	public String getPartner() {
		if(null == partner || partner.equals("null")){
			return "";
		}
		else{
			return partner;
		}	
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getCatalogId() {
		return catalogId;
	}
	@Column(name = "is_facebook_access_granted")
	private String isFBPageAccess;
	
	
	

	public String getIsFBPageAccess() {
		return isFBPageAccess;
	}

	public void setIsFBPageAccess(String isFBPageAccess) {
		this.isFBPageAccess = isFBPageAccess;
	}

	public void setCatalogId(String catalogId) {
		if (null != String.valueOf(catalogId)) {
			this.catalogId = catalogId;

		} else {
			this.catalogId = "";
		}
		
	}

	public String getFeedId() {
		return feedId;
	}

	public void setFeedId(String feedId) {
		if (null != String.valueOf(feedId)) {
			this.feedId = feedId;
			
		} else {
			this.feedId = "";
		}

	
		
	}

	@Column(name = "feed_id")
	private String feedId;
	
	@Column(name = "product_set_id")
	private String productSetId;
	
	@Column(name = "product_audience_id")
	private String productAudienceId;
	
	
	public String getProductAudienceId() {
		return productAudienceId;
	}

	public void setProductAudienceId(String productAudienceId) {
		if (null != String.valueOf(productAudienceId)) {
			this.productAudienceId = productAudienceId;
			
		} else {
			this.productAudienceId = "";
		}

	}

	public String getProductSetId() {
		return productSetId;
	}

	public void setProductSetId(String productSetId) {
		if (null != String.valueOf(productSetId)) {
			this.productSetId = productSetId;
			
		} else {
			this.productSetId = "";
		}

		
	}

	public String getWebsiteAudienceId() {
		return websiteAudienceId;
	}

	
	public void setWebsiteAudienceId(String websiteAudienceId) {
		if (null != String.valueOf(websiteAudienceId)) {
			this.websiteAudienceId = websiteAudienceId;

		} else {
			this.websiteAudienceId = "";
		}

	}

	@Column(name = "website")
	private String website;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "datetime")
	private String createdAt;

	@Column(name = "updated_at")
	private String updatedAt;

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
		if (null != String.valueOf(updatedAt)) {
			this.updatedAt = updatedAt;

		} else {
			this.updatedAt = "";
		}

	}

	public int getIsUpdated() {
		return isUpdated;
	}

	public void setIsUpdated(int isUpdated) {
		this.isUpdated = isUpdated;
	}

	public String getCustomAudienceId() {
		return customAudienceId;
	}

	public void setCustomAudienceId(String customAudienceId) {
		if (null != String.valueOf(customAudienceId)) {
			this.customAudienceId = customAudienceId;
			}
		else {
			this.customAudienceId = "";
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	@Column(name = "instagram_id")
	public String instagramId;

	public String getInstagramId() {
		return instagramId;
	}

	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}
	
	
	
}

