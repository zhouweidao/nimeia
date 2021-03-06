package com.fendo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.fendo.service.AdminService;
import com.fendo.service.PlayerService;

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
	public String toHomeAction(HttpServletRequest request){
		return "main";
	}
	
	@RequestMapping(value = "/listTopPlayer.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String listTopPlayerAction(String type,String context,String searchCon,String typeName,String contextName,HttpServletResponse response){
		//response.setHeader("Content-Type", "application/json;charset=UTF-8");
		String jsonString = JSON.toJSONString(playerservice.findAllTopPlayer(type,context,searchCon,typeName,contextName));
		System.out.println(jsonString);
		return jsonString;
	}
	
	/**
	 * 登录功能
	 * @param admin 接收到的登录用户信息，通过RequestBody组装成对象
	 * @return 登录后跳转到的页面
	 */
	@RequestMapping(value = "/login.html")
	@ResponseBody
	public String loginAction(String username,String pasw,String type,ModelAndView modelAndView,HttpServletRequest request) {
		String result = playerservice.login(username, pasw, type);
		if(result.equals("playinfo")){
			 String player = JSON.toJSONString(playerservice.get(username));
			 System.out.println(player.toString());
			request.getSession().setAttribute("player",player);
		}else if(result.equals("managerinfo")){
			request.getSession().setAttribute("manager", JSON.toJSONString(adminservice.getByID(username)));
		}else if(result.equals("admininfo")){
			request.getSession().setAttribute("admin", JSON.toJSONString(adminservice.getByID(username)));
		}
		return JSON.toJSONString(result);
	}

}
