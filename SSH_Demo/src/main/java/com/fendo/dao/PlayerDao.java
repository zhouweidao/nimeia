package com.fendo.dao;

import com.fendo.entity.Player;
import com.fendo.util.PageBean;

public interface PlayerDao extends BaseDao<Player>{

	
	PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size);

}
