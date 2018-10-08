package com.itheima.demo.service.impl;

import org.springframework.stereotype.Service;

import com.itheima.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		return "itHeima speak: hello world";
	}

}
