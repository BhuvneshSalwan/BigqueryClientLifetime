package com.hibernate.mysql.common;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryClass {

	public static SessionFactory factory = null;
	
	public static SessionFactory getInstance()
	{
		if(null == factory)
		{
			File hbConf = new File("C:\\Users\\bhuvnesh\\Eclipse_Workspace\\Xplanck\\Core\\bigquery-samples-java\\Resource\\hibernate.cfg.xml"); 
			
			factory = new Configuration().configure(hbConf).buildSessionFactory();
			
			return factory;
		}
		else
		{
			return factory;
		}
	}
	
}
