package com.fendo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fendo.entity.PlayerEntryForm;
import com.fendo.util.PlayerInfoDto;

public interface PlayerEntryFormService extends BaseService<PlayerEntryForm>{

	 List<PlayerEntryForm> findAllPlayerEntryForm(String itemid);

	void saveScore(String itemid, String playerid, String paiming, String score, String itemname, String itemtype);

	void repealPlayerScore(String itemid,String depid, String playerid);

	PlayerInfoDto findAllPlayerEntryFormByPlayerID(String playerid,String deptName);

	void repealPlayerScore(String itemid, String playerid);

}
