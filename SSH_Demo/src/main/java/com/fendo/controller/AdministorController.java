package com.fendo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fendo.entity.SystemController;
import com.fendo.service.AdminService;
import com.fendo.service.ItemService;
import com.fendo.service.PlayerEntryFormService;
import com.fendo.service.SystemControllerService;

@Controller
@RequestMapping(value="/aminisotrAction")
public class AdministorController {

	@Autowired
	SystemControllerService systemControllerService;
	@Autowired
	ItemService itemService;
	@Autowired
	PlayerEntryFormService playerEntryFormService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/editPripority.json",produces={"application/json;charset=UTF-8;","application/json;"})
	public void mergePermissionAction(String adminid,String usertype,String pripority) {
		
		 adminService.setPripority(adminid,usertype,pripority);
	}
	
	@RequestMapping(value = "/editPasswordAction.json",produces={"application/json;charset=UTF-8;","application/json;"})
	public void editPasswordAction(String adminID,String paswd){
		adminService.updatePassword(adminID,paswd);
	}

	@RequestMapping(value = "/startOrCloseApplyAction.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String startOrCloseApplyAction(String role) {
		Boolean temp = false;
		String result = "";
		int tempnum = 0;
		if (role.equals("manager")) {
			tempnum = 1;
			
		} else {
			tempnum = 2;
		}
		SystemController systemController = systemControllerService.get(tempnum);
		if (systemController.getIsrunning()) {
			result= "error";
		} else {
			result = "success";
			temp = true;
		}
		systemController.setIsrunning(temp);
		systemControllerService.update(systemController);
		return JSON.toJSONString(result);
	}

	@RequestMapping(value = "/listAllItemName.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String listAllItemNameAction(String itemType, String itemsex) {
		return JSON.toJSONString(itemService.findAllItemName(itemsex, itemType));
	}

	@RequestMapping(value = "/listAllPlayerName.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String listAllPlayerEntryFormNameAction(String itemid) {
		return JSON.toJSONString(playerEntryFormService.findAllPlayerEntryForm(itemid));
	}
	
	@RequestMapping(value = "/repealSavePlayerScore.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public void repealSavePlayerScoreAction(String itemid,String playerid){
		playerEntryFormService.repealPlayerScore(itemid,playerid);
	}
	
	@RequestMapping(value = "/savePlayerScore.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public void SavePlayerScoreAction(String itemid,String playerid,String paiming,String score,String itemname,String itemtype){
		playerEntryFormService.saveScore(itemid,playerid,paiming,score,itemname,itemtype);
	}
	
	@RequestMapping(value = "/isRunningAction.json",produces={"application/json;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String isRunningAction() {
		SystemController systemController = systemControllerService.get(2);
		if (systemController.getIsrunning() == true) {
			return JSON.toJSONString("success");
		} else {
			return JSON.toJSONString("error");
		}
	}

	@RequestMapping("/repealApply.json")
	@ResponseBody
	public String realApplyAction() {
		return null;
	}

}
