package com.service;


import org.apache.nutch.crawl.InjectorJob;

public class NutchManager 
{
	public static final String NUTCH_SERVER = null;

	public void nutchCrawler()
	{
		 String crawlArg = "urls -dir crawl -threads 5 -depth 3 -topN 20";

         // Run Crawl tool
	}
}
