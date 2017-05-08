package com.back4app.mongo.connector;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDAO {

	public static MongoClient client = null;

	public static MongoDatabase database = null;
	
	public static MongoCollection<Document> collection = null;
	
	public static MongoCollection<Document> getMongoObject() {

		if (null == client) {
			
			client = new MongoClient(new MongoClientURI("mongodb://admin:4MZ1UUe3nFaej4RzUu1RR6jn@mongodb4.back4app.com:27017/0b55c9eb2c2d4d20b572bf2a3b29f834"));
		
			database = client.getDatabase("0b55c9eb2c2d4d20b572bf2a3b29f834");
			
			collection = database.getCollection("Client");
			
			return collection;
		
		} else {
			
			return collection;
		
		}

	}

}