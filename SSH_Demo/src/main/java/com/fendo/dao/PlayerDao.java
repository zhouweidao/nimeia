package com.fendo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fendo.entity.DepEntryForm;
import com.fendo.entity.Player;
import com.fendo.util.PageBean;
import com.fendo.util.PlayerDto;

public interface PlayerDao extends BaseDao<Player> {

	PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size);

	List<PlayerDto> findPlayers();
	

	/**
	 * 获得当前项目最大报名人数
	 * @param deptid
	 * @param itemid 
	 * @return	
	 */
	DepEntryForm CountCurrentItemJoinNum(String deptid,String itemid);
	
	/**
	 * 获得该运动员
	 * @return
	 */
	Integer CountplayerJoinNum(String playerid);
	
	/**
	 * 
	 */
}
