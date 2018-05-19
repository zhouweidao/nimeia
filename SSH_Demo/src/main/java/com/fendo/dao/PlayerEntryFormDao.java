package com.fendo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fendo.entity.PlayerEntryForm;

public interface PlayerEntryFormDao extends BaseDao<PlayerEntryForm>{

	List<PlayerEntryForm> getAllPlayerEntryFromByItemID(String itemid);

	Integer getPlayerScore(String itemid, String itemname, String itemtype, String paiming);

	void saveScore(String itemid, String playerid, String paiming, Integer socre, String report);

	void deletePlayerEntryForm(String itemid, String playerid);
	
	PlayerEntryForm getPlayerEntryForm(String itemid,String playerid);

	Integer getPlayerDeptNum(String playerid, String deptName);

	Integer getPlayerSchoolNum(String playerid);

	List<PlayerEntryForm> listAllPlayerEntyrFormByID(String playerid);
}
