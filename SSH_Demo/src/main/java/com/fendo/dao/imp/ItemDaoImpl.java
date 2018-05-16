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
import com.fendo.dao.ItemDao;
import com.fendo.entity.Item;
import com.fendo.util.PageBean;

@Repository
public class ItemDaoImpl extends BaseDaoImpl<Item> implements ItemDao {
	
	@Autowired
	SessionFactory sessionfactory;
	
	private static final String LIST_ITEM_NAME1 = "SELECT DISTINCT ITEMID,ITENNAME FROM ITEM WHERE ITEMSEX = ?;";
	private static final String LIST_ITEM_NAME2 = "SELECT DISTINCT ITEMID,ITENNAME FROM ITEM WHERE ITEMSEX = ? AND ITEMTYPE = ?;";
	
	@Override
	public List<Item> listAllItemName(String sex) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery(LIST_ITEM_NAME1).setParameter(0, sex).getResultList();
	}

	@Override
	public List<Item> listAllItemName(String sex, String kinds) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery(LIST_ITEM_NAME1).setParameter(0, sex).setParameter(1, kinds).getResultList();
	}

}