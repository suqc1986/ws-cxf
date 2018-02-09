package com.suqc.ws.dao.impl;

import org.springframework.stereotype.Repository;

import com.suqc.ws.dao.HelloDao;
@Repository("helloDao")
public class HelloDaoImpl implements HelloDao{

	public String welcome(String name) {
		
		 return "HelloDaoImpl-->欢迎使用CXF！" + name;
	}

}
