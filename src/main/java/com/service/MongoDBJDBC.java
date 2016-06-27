package com.service;

import java.util.Map;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDBJDBC {
	@SuppressWarnings("deprecation")
	public String jdbcConnection(String query) {
		MongoClient mongoClient = new MongoClient();
		DB db1 = null;
		String text = null;
		if (query.equalsIgnoreCase("headphones")) {
			db1 = mongoClient.getDB("nutch");
			DBCollection col = db1.getCollection("webpage");
			@SuppressWarnings("rawtypes")
			Map docMap = (Map) col.findOne("com.snapdeal.www:http/products/electronic-headphones-earphones?sort=plrty")
					.toMap();
			text = docMap.get("text").toString();
		} else {
			db1 = mongoClient.getDB("televisionSD");
			DBCollection col = db1.getCollection("webpage");
			@SuppressWarnings("rawtypes")
			Map docMap = (Map) col.findOne("com.snapdeal.www:http/products/electronic-tv-accessories?sort=plrty")
					.toMap();
			text = docMap.get("text").toString();
		}
		
		mongoClient.close();

		return text;
	}
}
