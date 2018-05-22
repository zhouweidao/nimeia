package com.fendo.controller;

import org.omg.CORBA.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fendo.entity.DepEntryForm;
import com.fendo.entity.Player;
import com.fendo.entity.PlayerEntryForm;
import com.fendo.entity.SystemController;
import com.fendo.service.PlayerEntryFormService;
import com.fendo.service.PlayerService;
import com.fendo.service.SystemControllerService;
import com.fendo.util.JsonUtil;
import com.fendo.util.PlayerInfoDto;

@Controller
@RequestMapping("/playerAction")
public class PlayerAction {
	
	@Autowired
	PlayerService playerservice;
	@Autowired
	SystemControllerService systemService;
	@Autowired
	PlayerEntryFormService entryFormService;
	
	@RequestMapping("/listAllPlayer.json")
	@ResponseBody
	public String pagePlayer(String page){
		
		return "";
	}
	//加载项目下拉框
	@RequestMapping(value = "/showItemInfo.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String showItemInfoAction(String sex){
		return JSON.toJSONString(playerservice.findAllItemName(sex));
	}
	//修改个人信息
	@RequestMapping(value="/editPlayerInfoAction.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String editPlayerInfoAction(String playerid,String username,String sex,String dept,String cls,
			String phonenum,String usertype,String proprity){
		playerservice.editPlayerInfo(playerid,username,sex,dept,cls,phonenum,usertype);
		return JsonUtil.ToJson("success");
		
	}
	//显示报名信息
	@RequestMapping(value = "/showPlayerInfo.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String showPlayerInfoAction(String playerid,String deptName){
		PlayerInfoDto playerInfoDto = entryFormService.findAllPlayerEntryFormByPlayerID(playerid,deptName);
		return JSON.toJSONString(playerInfoDto);
	}
	//报名功能
	@RequestMapping(value = "/playApply.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String playApplyAction(String playerEntry,String itemid,String itemname,String itemtype){
		Player player = JSON.parseObject(playerEntry, Player.class);
		playerservice.playAply(player,itemid,itemname,itemtype);
		return JsonUtil.ToJson("success");
	}
	
	@RequestMapping(value = "/isRunningAction2.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	/**
	 * String deptid,String itemid
	 * @return
	 */
	public String isRunning2Action(String itemid,String deptid){
		if(playerservice.ableToApply(itemid,deptid)){
			return JSON.toJSONString("success");
		}else{
		return JSON.toJSONString("当前项目名额已满");
	   }
	}
	
	//判断是否可以报名/是否是报名时间或者已报项目是否大于2
	@RequestMapping(value = "/isRunningAction.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	/**
	 * String deptid,String itemid
	 * @return
	 */
	public String isRunningAction(String playerid){
		SystemController systemController = systemService.get(1);
		if(systemController.getIsrunning() == true && playerservice.ableToApply(playerid)){
			return JSON.toJSONString("success");
		}else{
		return JSON.toJSONString("error");
	   }
	}
	
	//撤销报名
	@RequestMapping(value = "/repealApply.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String repealApplyAction(String playerid,String depid,String itemid){
		entryFormService.repealPlayerScore(itemid, depid,playerid);
		return JsonUtil.ToJson("success");
	}
}
