package com.fendo.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.entity.Admin;
import com.fendo.entity.User;
import com.fendo.service.UserService;

@Controller
@RequestMapping(value = "/indexAction")
public class IndexController {

	@Autowired
	private UserService userService;
	/**
	 * 跳转到登录页
	 * @return
	 */
	@RequestMapping("/index.html")
	@ResponseBody
	public String toHomeAction(){
		
		return "";
	}
	
	/**
	 * 登录功能
	 * @param admin 接收到的登录用户信息，通过RequestBody组装成对象
	 * @return 登录后跳转到的页面
	 */
	@RequestMapping("/login.html")
	@ResponseBody
	public String loginAction(@RequestBody Admin admin) {

		return "";
	}

	/**
	 * 注册
	 * @param admin
	 * @return 跳转到登录页
	 */
	@RequestMapping("/register.html")
	@ResponseBody
	public String registerActino(@RequestBody Admin admin) {

		return "";
	}
}
