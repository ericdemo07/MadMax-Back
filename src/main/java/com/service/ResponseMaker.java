package com.service;

import java.util.ArrayList;
import java.util.List;
import com.pojo.SnapDealProduct;

public class ResponseMaker 
{
	public List<SnapDealProduct> initialRequest(String query)
	{
		MongoDBJDBC mongoDBJDBC=new MongoDBJDBC();
        String text = mongoDBJDBC.jdbcConnection(query);
        //text = "Headphones & Earphones - Buy Headphones & In-Ear Headsets Online | Snapdeal v2 iPhone Android Windows Get an instant SMS with the Free App download link Enter Mobile Number Enter valid 10-digit number Error! Please try again. Thanks You will receive an sms with download link shortly Shop Trending Searches Iphone 6 Designer Sarees Micromax Mobile Anarkali Dress Sports Shoes Infocus Men's Watches Power Bank Close 0 cart more account View My Account Orders Shortlist SD Cash E-Gift Voucher Logout login New User? Register Orders Shortlist SD Cash Track Order Help Offers Shortlist Download App Sell On Snapdeal SD HDFC Bank Card Shop Trending Searches Iphone 6 Designer Sarees Micromax Mobile Anarkali Dress Sports Shoes Infocus Men's Watches Power Bank Close 0 cart more account View My Account Orders Shortlist SD Cash E-Gift Voucher Logout login New User? Register Orders Shortlist SD Cash Track Order Help Your Item has been added to shortlist View All CLOSE Shop by categories see all categories Mi Store Gift Cards Bigg Boss Sell On Snapdeal Register Login false Loading... Home 7, 288, TVs, Audio & Video Headphones & Earphones Headphones & Earphones ( 4248 ) Sorry we are unable to find Headphones & Earphones . TIP: Check your spelling or limit your search to one or two words. However, here are some similar products which you may like! Sort By: Popularity Price Discount Fresh Arrivals Clear All 4248 Dispatched in 1 business day JBL T100A In Ear Earphone With Mic (B... Rs 649 Rs 999 [35% Off] (4403) Dispatched in 1 business day Jbl T100A In Ear Earphones With Mic (... Rs 649 Rs 999 [35% Off] (401) Dispatched in 1 business day Jbl T100A In Ear Earphones with Mic (... Rs 649 Rs 999 [35% Off] (989) Dispatched in 1 business day Motorola Moto Surround Swift Lite Blu... Rs 4807 Rs 5400 [11% Off] EMI starts at Rs. 293 (3) Dispatched in 1 business day Motorola Moto Pulse O2 Bluetooth Head... Rs 5130 Rs 5400 [5% Off] EMI starts at Rs. 313 (1) Dispatched in 1 business day Philips SHS390 Neckband Over Ear Head... Rs 359 Rs 499 [28% Off] (6488) Dispatched in 1 business day Boat Rockerz 500 On Ear Bluetooth Hea... Rs 1639 Rs 3490 [53% Off] (104) Dispatched in 1 business day Skullcandy S2DUDZ-058 JIB In Ear Earp... Rs 449 Rs 799 [44% Off] (1215) Dispatched in 1 business day Creative EP-600 In Ear Earphones Rs 389 Rs 499 [22% Off] (1564) Dispatched in 1 business day Skullcandy S2RFDA-003 Riff Mobility 2... Rs 999 Rs 1399 [29% Off] (123) Sony MDR-S70AP On Ear Headphones with... Rs 1990 Rs 4490 [56% Off] (13) Dispatched in 1 business day Skullcandy Uprock S5URFZ-033 On Ear H... Rs 1249 Rs 1999 [38% Off] (136) Dispatched in 1 business day Philips in-Ear Headphone Headset With... Rs 269 Rs 349 [23% Off] (516) Dispatched in 1 business day";
        //For SnapDeal
        //text ="Television: Buy TVs, LED TVs, LCD, Full HD / 3D & Plasma TV & Accessories Online at Low Prices in India - Snapdeal v2 iPhone Android Windows Get an instant SMS with the Free App download link Enter Mobile Number Enter valid 10-digit number Error! Please try again. Thanks You will receive an sms with download link shortly Shop Trending Searches Maggi Iphone 6 Samsung mobiles Designer Sarees Micromax Sports Shoes Power Bank Infocus Close 0 cart more account View My Account Orders Shortlist SD Cash E-Gift Voucher Logout login New User? Register Orders Shortlist SD Cash Track Order Help Offers Shortlist Download App Sell On Snapdeal SD HDFC Bank Card Shop Trending Searches Maggi Iphone 6 Samsung mobiles Designer Sarees Micromax Sports Shoes Power Bank Infocus Close 0 cart more account View My Account Orders Shortlist SD Cash E-Gift Voucher Logout login New User? Register Orders Shortlist SD Cash Track Order Help Your Item has been added to shortlist View All CLOSE Shop by categories see all categories Mi Store Gift Cards Bigg Boss Sell On Snapdeal Register Login 7 false Loading... Home 7, 64, TVs, Audio & Video Televisions Televisions ( 1611 ) Sorry we are unable to find Televisions . TIP: Check your spelling or limit your search to one or two words. However, here are some similar products which you may like! Sort By: Popularity Price Discount Fresh Arrivals Clear All 1611 LG 32LF513A 80 cm (32) HD Ready LED Television Rs 18906 Rs 24900 [24% Off] EMI starts at Rs. 1153 (6) Type : LED Display Resolution : 1366 x 768 Connectivity : 1 X HDMI & 1 X USB Warranty : 1 Year LG India Warranty Screen Size : 80 cm (32) Dispatched in 1 business day LG 24MN47A 60 cm (24) HD Ready LED Personal Television Rs 11735 Rs 14800 [21% Off] EMI starts at Rs. 716 (18) Type : LED Display Resolution : 1366 x 768 Connectivity : 1 X HDMI & 1 X USB Warranty : 3 Years LG India Warranty Screen Size : 59.82 cm (23.6) Sony KLV-40R562C 102 cm (40) Full HD Internet LED Television Rs 47944 Rs 56900 [16% Off] EMI starts at Rs. 2924 (50) Type : LED Display Resolution : 1920 x 1080 Connectivity : 2 X HDMI & 2 X USB Warranty : 1 Year Sony India Warranty Screen Size : 102 cm (40) Haier LE 43B7500 108 cm (43) Full HD LED Television Rs 28386 Rs 39990 [29% Off] EMI starts at Rs. 1731 (53) Type : LED Display Resolution : 1920 x 1080 Connectivity : 2 X HDMI & 1 X USB Warranty : 1 Year Haier India Warranty Screen Size : 109 cm (43) Samsung 32FH4003 81 cm (32) HD Ready LED Television Rs 19490 Rs 26000 [25% Off] EMI starts at Rs. 1189 (238) Type : LED Display Resolution : 1366x768 Connectivity : 1 X HDMI & 1 X USB Screen Size : 81 cm (32) Refresh Rate : 100-200 Hz Philips 32PFL3738/V7 81 cm (32) HD Ready LED Television Rs 16994 Rs 24990 [32% Off] EMI starts at Rs. 1036 (555) Type : LED TV Display Resolution : 1366x768 Connectivity : 1 x HDMI & 1 x USB Warranty : 1 Year Philips India Warranty Screen Size : 81 cm (32) Philips 40PFL5059/V7 102 cm (40) Full HD LED Television Rs 27990 Rs 51000 [45% Off] EMI starts at Rs. 1707 (625) Type : LED TV Display Resolution : 1920 x 1080 Connectivity : 2 x HDMI & 1 x USB Warranty : 1 Year Philips India Warranty Screen Size : 101.6 cm (40) Panasonic 40C400D 101.6 cm (40) Full HD LED Television Rs 31990 Rs 47500 [33% Off] EMI starts at Rs. 1951 (23) Type : LED Display Resolution : 1920 x 1080 Connectivity : Two Warranty : 1 Year Panasonic Warranty Screen Size : 40 Dispatched in 1 business day LG 43LF513A 108 cm (43) Full HD LED Television Rs 35717 Rs 47900 [25% Off] EMI starts at Rs. 2178 (4) Type : LED Display Resolution : 1920 x 1080 Connectivity : 1 X HDMI & 1 X USB Warranty : 1 Year LG India Warranty Screen Size : 108 cm (43) Dispatched in 1 business day Haier LE32B8000 80 cm (32) Full HD LED Television Rs 15698 Rs 21990 [29% Off] EMI starts at Rs. 957 (2) Type : LED Display Resolution : 1366 x 768 Connectivity : 2 X HDMI & 1 X USB Warranty : 1 Year Haier India Warranty Screen Size : 80 cm (32) Sony BRAVIA KLV-32R412C 80 cm (32) WXGA LED Television Rs 26000 Rs 32900 [21% Off] EMI starts at Rs. 1586 (73) Type : LED Display Resolution : WXGA Connectivity : Three Warranty : 1 Year Sony India Warranty Screen Size : 80 cm (32)";
        String[] parts;
		List<SnapDealProduct> snapDealProductList = new ArrayList<>();

        if(query.equalsIgnoreCase("headphones"))
        {
        	parts = text.split("Dispatched in 1 business day");
        	//System.out.println("\n\n\nSeparator");
        	
        	for(int i =1; i<parts.length;i++)
    		{
        		System.out.println("Part["+i+"] : "+parts[i]);
    		}
        	
        	for(int i =1; i<parts.length;i++)
    		{	
    			SnapDealProduct snapDealProduct = new SnapDealProduct();
    			String rating = parts[i].substring(parts[i].lastIndexOf("(",parts[i].length()-1) + 1, parts[i].lastIndexOf(")")).trim();
    			snapDealProduct.setRating(rating);
    			String price = parts[i].substring(parts[i].indexOf("Rs") + 2, parts[i].indexOf("Rs")+6).trim();
    			snapDealProduct.setPrice(price);
    			String name = parts[i].substring(0, parts[i].indexOf("Rs")-1).trim();
    			snapDealProduct.setProductName(name);
    			//System.out.println(parts[i]);
    			//System.out.println("\n\nSeparator");	
    			snapDealProduct.setSource("SnapDeal");
    			snapDealProduct.setProductType("Headphones");

    			if(i==7)
    			{
    				i=+10;
    			}
    			snapDealProductList.add(snapDealProduct);
    		}
        }
        else
        {
        	text = text.replaceAll("Dispatched in 1 business day ", "");
        	parts = text.split("Size\\s:\\s[0-9.]{1,5}\\s+cm\\s[(][0-9.]{1,5}[)]\\s");
        	for(int i =1; i<parts.length;i++)
    		{
        		//System.out.println("Part["+i+"] : "+parts[i]);
    		}
        	
        	for(int i =1; i<parts.length;i++)
    		{	
    			SnapDealProduct snapDealProduct = new SnapDealProduct();
    			String rating = parts[i].substring(parts[i].indexOf("(",parts[i].indexOf("Type")-7) + 1, parts[i].indexOf("Type")-2).trim();
    			snapDealProduct.setRating(rating);
    			String price = parts[i].substring(parts[i].indexOf("Rs") + 2, parts[i].indexOf("Rs")+8).trim();
    			snapDealProduct.setPrice(price);
    			String name = parts[i].substring(0, parts[i].indexOf("(")-8).trim();
    			snapDealProduct.setProductName(name);
    			//System.out.println(parts[i]);
    			//System.out.println("\n\nSeparator");	
    			snapDealProduct.setSource("SnapDeal");
    			snapDealProduct.setProductType("Telivision");
    			if(i==7)
    			{
    				i=+10;
    			}
    			snapDealProductList.add(snapDealProduct);
    		}	
        }
/*		
        for (SnapDealProduct temp : snapDealProductList) {
			System.out.println("\n\n");
			System.out.println(temp.getProductName());
			System.out.println(temp.getPrice());
			System.out.println(temp.getRating());
			System.out.println(temp.getSource());
		}*/
		return snapDealProductList;
	}
}
