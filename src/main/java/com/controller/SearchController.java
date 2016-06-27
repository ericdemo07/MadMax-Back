package com.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.pojo.SnapDealProduct;
import com.service.ResponseMaker;

@RestController
public class SearchController {
	@RequestMapping(value = "/api/display", method = RequestMethod.POST)
	public @ResponseBody Object initialRequest(@RequestBody String query) throws IOException {
		System.out.println("\n\tHi I am in SearchController");
		ResponseMaker responseMaker = new ResponseMaker();
		List<SnapDealProduct> snapDealProductList = responseMaker.initialRequest(query);
		System.out.println("List :" + snapDealProductList);
		System.out.println(snapDealProductList.toArray().length);
		return snapDealProductList.toArray();
	}
}
