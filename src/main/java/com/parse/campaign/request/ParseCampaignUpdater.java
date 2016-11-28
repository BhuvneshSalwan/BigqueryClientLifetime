package com.parse.campaign.request;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class ParseCampaignUpdater {

	public static void dataInsertParse(String ObjectId, JSONObject request_object) throws Exception
	{
	
		String methodURL = "https://api.parse.com/1/classes/Campaign/"+ObjectId;
	
		URL url = new URL(methodURL);
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);	
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("X-Parse-Application-Id", "0f5uiNLZwPItPmo2g10gQlaCpglrbzkpuRnXUSqp");
		connection.setRequestProperty("X-Parse-REST-API-Key", "CYXehAjBcnUky4lSUZyIvEGl2vY8bkSwXzbUcDW1");
		connection.setRequestProperty("X-Parse-Master-Key", "F9XHHWimF35HTHpJHTjszAXrr6bJ3CcfzDpp3dmn");
		connection.setRequestProperty("Content-Type", "application/json");
	
		OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
		
		System.out.println(request_object.toString());
		
		writer.write(request_object.toString());;       
		writer.close();
	
		String respString = "Response code: "+connection.getResponseCode()+" and Message:"+connection.getResponseMessage();   
	
		System.out.println(respString);
		
		if(connection.getResponseCode() == 201){
			System.out.println("The particular row is added");
		}
		
		else{
			System.out.println("The particular row was not added");
		}
	}
}
