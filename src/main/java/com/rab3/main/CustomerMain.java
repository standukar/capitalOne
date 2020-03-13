package com.rab3.main;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CustomerMain {
	
	public static void getAccountInfo() {
		final String url = "http://localhost:8080/Accounts/acccount/capitalOne";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		ResponseEntity<String> account = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(headers), String.class);
		System.out.println(account.getBody());
	}

}
