package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.PlayerEntryFormDao;
import com.fendo.entity.PlayerEntryForm;
import com.fendo.service.PlayerEntryFormService;
@Service
public class PlayerEntryFormServiceImpl extends BaseServiceImpl<PlayerEntryForm> implements PlayerEntryFormService{

	@Autowired
	PlayerEntryFormDao playerEntryFromDao;
	
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

}
