package com.google.cloud.bigquery.views;

public class ClientBQ {

	private String client_id;
	private int impressions;
	private int clicks;
	private int sales;
	private float sales_inr;
	private int status;
	private float avbl_budget_inr;
		
	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public int getImpressions() {
		return impressions;
	}
	
	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public float getSales_inr() {
		return sales_inr;
	}

	public void setSales_inr(float sales_inr) {
		this.sales_inr = sales_inr;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public float getAvbl_budget_inr() {
		return avbl_budget_inr;
	}

	public void setAvbl_budget_inr(float avbl_budget_inr) {
		this.avbl_budget_inr = avbl_budget_inr;
	}

	public String setString() {
		return "ClientBQ [client_id=" + client_id + ", impressions=" + impressions + ", clicks=" + clicks + ", sales="
				+ sales + ", sales_inr=" + sales_inr + ", status=" + status + ", avbl_budget_inr=" + avbl_budget_inr
				+ "]";
	}
	
}
