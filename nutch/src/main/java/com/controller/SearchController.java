package com.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.pojo.SnapDealProduct;
import com.service.ResponseMaker;

@RestController
public class SearchController 
{
	@RequestMapping(value = "/api/display", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object initialRequest(@RequestBody String query)
	{
		System.out.println("\n\tHi I am in server controller and all is good till now\n Query:"+query);
		
		ResponseMaker responseMaker = new ResponseMaker();
		List<SnapDealProduct> snapDealProductList = responseMaker.initialRequest(query);
		System.out.println("List :"+snapDealProductList);
		
		for (SnapDealProduct temp : snapDealProductList) {
			System.out.println("\n\n");
			System.out.println(temp.getProductName());
			System.out.println(temp.getPrice());
			System.out.println(temp.getRating());
			System.out.println(temp.getSource());
		}
		
		System.out.println(snapDealProductList.toArray().length);
		return snapDealProductList.toArray();
	}
}
