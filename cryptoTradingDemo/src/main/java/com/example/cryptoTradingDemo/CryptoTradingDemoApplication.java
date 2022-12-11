package com.example.cryptoTradingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CryptoTradingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoTradingDemoApplication.class, args);
		//ConfigurableApplicationContext context=SpringApplication.run(CryptoTradingDemoApplication.class, args);
		//Object dataSource = context.getBean("dataSource");
		//System.out.println(dataSource);
	}

}
