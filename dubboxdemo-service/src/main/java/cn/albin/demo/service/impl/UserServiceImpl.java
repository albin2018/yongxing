package cn.albin.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.albin.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		return "dubboxdemo";
	}

}
