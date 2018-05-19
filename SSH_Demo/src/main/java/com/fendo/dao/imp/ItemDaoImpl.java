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
@Transactional
public class ItemDaoImpl extends BaseDaoImpl<Item> implements ItemDao {
	
	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public List<Item> listAllItemName(String sex) {
		// TODO Auto-generated method stub
        String LIST_ITEM_NAME1 = "SELECT DISTINCT ITEMID,ITEMNAME FROM ITEM WHERE ITEMSEX = '"+sex.charAt(0)+"'";
		return sessionfactory.getCurrentSession().createSQLQuery(LIST_ITEM_NAME1).getResultList();
	}

	@Override
	public List<Item> listAllItemName(String sex, String kinds) {
		// TODO Auto-generated method stub
	    String LIST_ITEM_NAME2 = "SELECT DISTINCT ITEMID,ITEMNAME FROM ITEM WHERE ITEMSEX = '"+sex.charAt(0)+"' AND ITEMTYPE = '"+kinds+"'";
		return sessionfactory.getCurrentSession().createSQLQuery(LIST_ITEM_NAME2).getResultList();
	}

}