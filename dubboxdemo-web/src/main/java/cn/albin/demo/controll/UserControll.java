package cn.albin.demo.controll;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.albin.demo.service.UserService;


@RestController
@RequestMapping("/a")
public class UserControll {

	@Reference
	private UserService userService;
	
	@RequestMapping("/a")
	@ResponseBody
	public String showName(){
		return userService.getName();
	}
}
