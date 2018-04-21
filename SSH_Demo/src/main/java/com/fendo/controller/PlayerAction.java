package com.fendo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/playerAction")
public class PlayerAction {
	
	@RequestMapping("/listAllPlayer.json")
	@ResponseBody
	public String pagePlayer(String page){
		
		return "";
	}
	
	@RequestMapping("showPlayerInfo.json")
	@ResponseBody
	public String showPlayerInfoAction(String playerid){
		
		return "";
	}
}
