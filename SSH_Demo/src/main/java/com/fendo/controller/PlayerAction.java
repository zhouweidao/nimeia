package com.fendo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fendo.entity.SystemController;
import com.fendo.service.PlayerService;
import com.fendo.service.SystemControllerService;

@Controller
@RequestMapping("/playerAction")
public class PlayerAction {
	
	@Autowired
	PlayerService playerservice;
	@Autowired
	SystemControllerService systemService;
	
	@RequestMapping("/listAllPlayer.json")
	@ResponseBody
	public String pagePlayer(String page){
		
		return "";
	}
	
	@RequestMapping("/showPlayerInfo.json")
	@ResponseBody
	public String showPlayerInfoAction(String playerid){
		
		return "";
	}
	
	@RequestMapping("/playApply.json")
	@ResponseBody
	public String playApplyAction(){
		
		return "";
	}
	
	@RequestMapping("/isRunningAction.json")
	@ResponseBody
	public String isRunningAction(){
		SystemController systemController = systemService.get(1);
		if(systemController.getIsrunning() == true){
			return JSON.toJSONString("success");
		}else{
		return JSON.toJSONString("error");
	   }
	}
	
	@RequestMapping("/repealApply.json")
	@ResponseBody
	public String reaealApplyAction(){
		return null;
	}
}
