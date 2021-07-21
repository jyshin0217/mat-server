package com.junemat.matserver.views.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junemat.matserver.views.repository.testMapper;
import com.junemat.matserver.views.repository.testRespository;

@Service
public class testService {
	@Autowired
	testMapper test;
	
	public String stringService() {
		System.out.println("service enter");
		// System.out.println(test.testSql());
		return "hello";
	}

}
