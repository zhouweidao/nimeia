package com.fendo.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.PlayerEntryFormDao;
import com.fendo.entity.PlayerEntryForm;
@Repository
public class PlayerEntryFormDaoImpl extends BaseDaoImpl<PlayerEntryForm> implements PlayerEntryFormDao {

	private static final String GET_ALLPALYERENTRYFORM = "SELECT * FROM PLAYERENTRYFORM WHERE ITEMID = ?";
	private static final String DEL_PLAYERENTRYFORM = "DELETE FROM PLAYERENTRYFORM WHERE ITEMID = ? AND PLYAERID = ?";
	private static final String GET_SCORE = "SELECT ITEMSCORE FROM ITEMSCORE WHERE ITEMID = ? AND ITEMNAME = ? AND ITEMTYPE = ? AND ITEMNO = ?";
	private static final String GET_PLAYERENTRYFORM = "SELECT * FROM PLAYERENTRYFORM WHERE ITEMID = ? AND PLAYERID = ?";
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<PlayerEntryForm> getAllPlayerEntryFromByItemID(String itemid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery(GET_ALLPALYERENTRYFORM).setParameter(0, itemid).getResultList();
	}

	@Override
	public Integer getPlayerScore(String itemid, String itemname, String itemtype, String paiming) {
		// TODO Auto-generated method stub
		return (Integer) sessionFactory.getCurrentSession().createQuery(GET_SCORE).setParameter(0, itemid).setParameter(1, itemname).setParameter(2, itemtype)
				.setParameter(3, paiming).getSingleResult();
	}

	@Override
	public void saveScore(String itemid, String playerid, String paiming, Integer socre, String report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlayerEntryForm(String itemid, String playerid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery(DEL_PLAYERENTRYFORM).setParameter(0, itemid).setParameter(1, playerid);
	}

	@Override
	public PlayerEntryForm getPlayerEntryForm(String itemid, String playerid) {
		// TODO Auto-generated method stub
		return (PlayerEntryForm) sessionFactory.getCurrentSession().createQuery(GET_ALLPALYERENTRYFORM).setParameter(0, itemid).setParameter(1, playerid).getResultList().get(0);
	}

	}