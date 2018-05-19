package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fendo.dao.PlayerDao;
import com.fendo.dao.PlayerEntryFormDao;
import com.fendo.entity.PlayerEntryForm;
import com.fendo.service.PlayerEntryFormService;
import com.fendo.util.PlayerInfoDto;
@Service
public class PlayerEntryFormServiceImpl extends BaseServiceImpl<PlayerEntryForm> implements PlayerEntryFormService{

	@Autowired
	PlayerEntryFormDao playerEntryFromDao;
	@Autowired
	PlayerDao playerDao;
	@Override
	public List<PlayerEntryForm> findAllPlayerEntryForm(String itemid) {
		// TODO Auto-generated method stub
		return playerEntryFromDao.getAllPlayerEntryFromByItemID(itemid);
	}

	@Override
	public void saveScore(String itemid, String playerid, String paiming, String report, String itemname,
			String itemtype) {
		// TODO Auto-generated method stub
		Integer socre = playerEntryFromDao.getPlayerScore(itemid,itemname,itemtype,paiming);
		PlayerEntryForm tempplayerEntryForm = playerEntryFromDao.getPlayerEntryForm(itemid, playerid);
		tempplayerEntryForm.setItemNo(paiming);
		tempplayerEntryForm.setRecord(report);
		tempplayerEntryForm.setItemScore(socre);
		playerEntryFromDao.update(tempplayerEntryForm);
	}

	@Override
	public void repealPlayerScore(String itemid, String playerid) {
		// TODO Auto-generated method stub
		playerEntryFromDao.deletePlayerEntryForm(itemid,playerid);
	}

	@Override
	public PlayerInfoDto findAllPlayerEntryFormByPlayerID(String playerid,String deptName) {
		// TODO Auto-generated method stub
		int deptnum = playerEntryFromDao.getPlayerDeptNum(playerid,deptName);
		int schoolnum = playerEntryFromDao.getPlayerSchoolNum(playerid);
		List<PlayerEntryForm> entyrFormByID = playerEntryFromDao.listAllPlayerEntyrFormByID(playerid);
		int tem = 0;
		for(int i = 0;i<entyrFormByID.size();i++){
			tem += entyrFormByID.get(i).getItemScore();
		}
		PlayerInfoDto playerInfoDto = new PlayerInfoDto(entyrFormByID,String.valueOf(tem),String.valueOf(deptnum),String.valueOf(schoolnum));
		return playerInfoDto;
	}

}
