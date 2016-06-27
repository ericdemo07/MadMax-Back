package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.pojo.DisplayProduct;

@RestController
public class ProductDisplayController {
	@RequestMapping(value = "/api/displayProduct", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object DisplayProduct(@RequestBody DisplayProduct productClicked) throws IOException {
		String productType = productClicked.getProductType();

		System.out.println("\n\tHi I am in displayProduct controller");
		System.out.println("\n\t Response : ProductType:[" + productType + "] ProductName:["
				+ productClicked.getProductName() + "]");

		StringBuilder youTubeUrl = new StringBuilder();
		youTubeUrl.append("https://www.youtube.com/results?search_query=top+10+");
		youTubeUrl.append(productType);
		Document doc = Jsoup.connect(youTubeUrl.toString()).get();
		Elements links = doc.select("a[href]");
		List<String> stringHyperlink = new ArrayList<>();

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).toString().contains("/watch?v=")) {
				String temp1 = links.get(i).toString().replace("watch?v=", "v/");
				String temp2 = temp1.substring(temp1.indexOf("href=") + 6, temp1.indexOf(" class=") - 1);
				if (!(stringHyperlink.contains("https://www.youtube.com" + temp2))) {
					stringHyperlink.add("https://www.youtube.com" + temp2);
				} else {
					// System.out.println("\n\n\tElse .. "+temp2);
				}
			}
		}
		return stringHyperlink.toArray();
	}
}
