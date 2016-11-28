package com.hibernate.mysql.common;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.google.cloud.bigquery.views.Campaign;
import com.google.cloud.bigquery.views.Client;
import com.google.cloud.bigquery.views.Creative;

public class CommonFunctions {

	public static List<Creative> getSmartCreative()
	{
		Session session = FactoryClass.getInstance().openSession();
		session.beginTransaction();
		
		Criteria creteria = session.createCriteria(Creative.class);
		creteria.add(Restrictions.eq("product_type", 2));
		
		List<Creative> fetchedCreative = (List<Creative>) creteria.list();
		session.getTransaction().commit();
		session.close();
		
		return fetchedCreative;
	}
	
	public static Creative getCreativeById(int id)
	{
		Session session = FactoryClass.getInstance().openSession();
		session.beginTransaction();
		
		Creative creative = (Creative) session.get(Creative.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return creative;
	}
	
	public static Campaign getCampaignById(int id)
	{
		Session session = FactoryClass.getInstance().openSession();
		session.beginTransaction();
		
		Campaign campaign = (Campaign) session.get(Campaign.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return campaign;
	}
	
	public static int getClientIdByCreativeId(int id)
	{
		Session session = FactoryClass.getInstance().openSession();
		session.beginTransaction();
		
		Campaign campaign = (Campaign) session.get(Campaign.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return campaign.getClientId();
	}
	
	public static Client getClientById(int id)
	{
		Session session = FactoryClass.getInstance().openSession();
		session.beginTransaction();
		
		Client client = (Client) session.get(Client.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return client;
	}

}