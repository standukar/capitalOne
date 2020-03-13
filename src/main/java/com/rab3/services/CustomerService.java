package com.rab3.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rab3.dtos.CustomerDto;

@Service
public class CustomerService {
	
	public CustomerDto getCustomerInfo() {
		
		CustomerDto cd = new CustomerDto();
		cd.setName("Siddharth Tandukar");
		cd.setEmail("standukar@gmail.com");
		cd.setAddress("7374 lee hwy");
		cd.setUuid(UUID.randomUUID().toString());
		return cd;
	}

}
