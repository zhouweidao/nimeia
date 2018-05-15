package com.fendo.dao;

import java.util.List;

import com.fendo.entity.Player;
import com.fendo.util.PageBean;
import com.fendo.util.PlayerDto;

public interface PlayerDao extends BaseDao<Player>{

	
	PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size);
	
	List<PlayerDto> findPlayers();

}
