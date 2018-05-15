package com.fendo.service;

import java.util.List;

import com.fendo.entity.Player;
import com.fendo.util.PlayerDto;

public interface PlayerService extends BaseService<Player>{

	String login(String username,String pswd,String type);

	List<PlayerDto> findAllTopPlayer(String playertype, String playercontext, String searchcontext);
	
}
