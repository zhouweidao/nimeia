package com.fendo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.fendo.entity.Admin;
import com.fendo.entity.Player;
import com.fendo.service.AdminService;
import com.fendo.service.PlayerService;
import com.fendo.util.JsonUtil;

@Controller
@RequestMapping(value = "/indexAction")
public class IndexController {

	@Autowired
	private AdminService adminservice;
	@Autowired
	private PlayerService playerservice;
	/**
	 * 跳转到登录页
	 * @return
	 */
	@RequestMapping(value = "/index.json")
	public String toHomeAction(){
		return "main";
	}
	
	@RequestMapping("/listTopPlayer.json")
	@ResponseBody
	public String listTopPlayerAction(){
		
		
		return "";
	}
	
	/**
	 * 登录功能
	 * @param admin 接收到的登录用户信息，通过RequestBody组装成对象
	 * @return 登录后跳转到的页面
	 */
	@RequestMapping("/login.html")
	public String loginAction(String username,String pasw,String type,HttpServletRequest request) {
		System.out.println(type);
		String result = playerservice.login(username, pasw, type);
		if(result.equals("playinfo")){
			request.setAttribute("player", playerservice.get(username));
		}else if(result.equals("")){
			request.setAttribute("", adminservice.get(username));
		}else if(result.equals("")){
			request.setAttribute("admin", adminservice.get(username));
		}
		return result;
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
