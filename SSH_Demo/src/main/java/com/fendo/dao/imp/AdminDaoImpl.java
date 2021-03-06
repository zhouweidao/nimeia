package com.fendo.dao.imp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.BaseDao;
import com.fendo.dao.AdminDao;
import com.fendo.entity.Admin;
import com.fendo.util.PageBean;

@Repository
@Transactional
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {
	private static final String GET_ADMIN = "from Admin where adminID = ?";
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Admin getAdminByAdminID(String adminid) {
		// TODO Auto-generated method stub
		return (Admin) sessionFactory.getCurrentSession().createQuery(GET_ADMIN).setParameter(0, adminid).getResultList().get(0);
	}

	@Override
	public Admin getByID(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	}