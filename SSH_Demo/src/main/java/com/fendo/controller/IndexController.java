package com.fendo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.fendo.dao.PlayerDao;
import com.fendo.entity.Admin;
import com.fendo.entity.Player;
import com.fendo.service.AdminService;
import com.fendo.service.PlayerService;
import com.fendo.util.JsonUtil;
import com.fendo.util.PlayerDto;

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
	public String listTopPlayerAction(String playertype,String playercontext,String searchcontext){
		return JsonUtil.ToJson(playerservice.findAllTopPlayer(playertype,playercontext,searchcontext));
	}
	
	/**
	 * 登录功能
	 * @param admin 接收到的登录用户信息，通过RequestBody组装成对象
	 * @return 登录后跳转到的页面
	 */
	@RequestMapping("/login.html")
	public ModelAndView loginAction(String username,String pasw,String type,ModelAndView modelAndView,HttpServletRequest request) {
		System.out.println(type);
		String result = playerservice.login(username, pasw, type);
		if(result.equals("playinfo")){
			modelAndView.setViewName("playerinfo");
			return modelAndView.addObject("player", playerservice.get(username));
		}else if(result.equals("managerinfo")){
			modelAndView.setViewName("managerinfo");
			return modelAndView.addObject("manager", adminservice.get(username));
		}else if(result.equals("admininfo")){
			modelAndView.setViewName("admininfo");
			return modelAndView.addObject("admininfo", adminservice.get(username));
		}else{
			modelAndView.setViewName("main");
			return modelAndView;
		}
	}

}
