package com.fendo.service;

import java.util.List;

import com.fendo.entity.Item;
import com.fendo.entity.Player;
import com.fendo.util.PlayerDto;

public interface PlayerService extends BaseService<Player>{

	String login(String username,String pswd,String type);

	List<PlayerDto> findAllTopPlayer(String playertype, String playercontext, String searchcontext,String typeName,String contextName);

	List<Item> findAllItemName(String sex);

	void editPlayerInfo(String playerid, String uaername, String sex, String dept, String cls, String phonenum,
			String usertype);

	boolean ableToApply(String playerid);
	boolean ableToApply(String itemID,String depID);

	void playAply(Player player, String itemid, String itemname, String itemtype);
	
}
