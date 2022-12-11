package com.example.cryptoTradingDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "api/v1/trading")
public class Trading {
	
	private final String BINANCE_API_URL = "https://api.binance.com/api/v3/ticker/bookTicker";
	private final String HUOBI_API_URL = "https://api.huobi.pro/market/tickers";

	
	//getBinance exchange price
	@RequestMapping(path = "/getBinancePrice")
	public String getBinancePrice() {
		System.out.println("Hellob");
		String url = BINANCE_API_URL;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	//get huobi exchange price
	@RequestMapping(path = "/getHuobiPrice")
	public String getHuobiPrice() {
		System.out.println("Helloh");
		String url = HUOBI_API_URL;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}

	
	//api allow users to trade
	
	
	//retrieve user's crypto currencies wallet balance
	
	
	//retrieve user trading history
	
	
}
