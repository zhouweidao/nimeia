package com.fendo.service;

import com.fendo.entity.Player;

public interface PlayerService extends BaseService<Player>{

	String login(String username,String pswd,String type);
	
}
