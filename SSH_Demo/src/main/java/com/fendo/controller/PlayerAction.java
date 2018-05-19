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
	@RequestMapping("/showItemInfo.json")
	@ResponseBody
	public String showItemInfoAction(String sex){
		return JSON.toJSONString(playerservice.findAllItemName(sex));
	}
	//修改个人信息
	@RequestMapping(value="/editPlayerInfoAction.json")
	@ResponseBody
	public String editPlayerInfoAction(String playerid,String username,String sex,String dept,String cls,
			String phonenum,String usertype,String proprity){
		playerservice.editPlayerInfo(playerid,username,sex,dept,cls,phonenum,usertype);
		return JsonUtil.ToJson("success");
		
	}
	//显示报名信息
	@RequestMapping("/showPlayerInfo.json")
	@ResponseBody
	public String showPlayerInfoAction(String playerid,String deptName){
		PlayerInfoDto playerInfoDto = entryFormService.findAllPlayerEntryFormByPlayerID(playerid,deptName);
		return JSON.toJSONString(playerInfoDto);
	}
	//报名功能
	@RequestMapping("/playApply.json")
	@ResponseBody
	public String playApplyAction(String playerEntry,String itemid,String itemname,String itemtype){
		Player player = JSON.parseObject(playerEntry, Player.class);
		PlayerEntryForm entryForm = new PlayerEntryForm();
		entryForm.setPlayerID(player.getPlayerID());
		entryForm.setPlayerName(player.getPlayerName());
		entryForm.setDepID(player.getDepID());
		entryForm.setItemID(itemid);
		entryForm.setItemName(itemname);
		entryForm.setItemNo("");
		entryForm.setItemType(itemtype);
		entryForm.setRecord("");
		entryFormService.save(entryForm);
		int tem = player.getPlayerEntryNum();
		player.setPlayerEntryNum(tem++);
		playerservice.update(player);
		return JsonUtil.ToJson("success");
	}
	//判断是否可以报名
	@RequestMapping("/isRunningAction.json")
	@ResponseBody
	/**
	 * String deptid,String itemid
	 * @return
	 */
	public String isRunningAction(){
		SystemController systemController = systemService.get(1);
		if(systemController.getIsrunning() == true){
			return JSON.toJSONString("success");
		}else{
		return JSON.toJSONString("error");
	   }
	}
	
	//撤销报名
	@RequestMapping("/repealApply.json")
	@ResponseBody
	public String repealApplyAction(String playerid,String itemid){
		entryFormService.repealPlayerScore(itemid, playerid);
		return JsonUtil.ToJson("success");
	}
}
