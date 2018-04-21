package com.fendo.dao.imp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fendo.dao.BaseDao;
import com.fendo.dao.PlayerDao;
import com.fendo.entity.Player;
import com.fendo.util.PageBean;

@Repository
public class PlayerDaoImpl extends BaseDaoImpl<Player> implements PlayerDao {

	@Override
	public PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}