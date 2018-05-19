package com.fendo.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.PlayerEntryFormDao;
import com.fendo.entity.PlayerEntryForm;
import com.fendo.util.CommonUtil;
@Repository
@Transactional
public class PlayerEntryFormDaoImpl extends BaseDaoImpl<PlayerEntryForm> implements PlayerEntryFormDao {

	private static final String GET_ALLPALYERENTRYFORM = "FROM PlayerEntryForm WHERE itemID = ?";
	private static final String GET_ALLPALYERENTRYFORMBYPLAYERID = "FROM PlayerEntryForm WHERE playerID = ?";
	private static final String GET_PLAYERENTRYFORM = "FROM PlayerEntryForm WHERE itemID = ? AND playerID = ?";
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
		String GET_SCORE = "SELECT ITEMSCORE FROM ITEMSCORE WHERE ITEMID = '"+itemname+"' AND ITEMNAME = '"+itemname+"' AND ITEMTYPE = '"+itemtype+"' AND ITEMNO = '"+paiming+"'";
		return (Integer) sessionFactory.getCurrentSession().createSQLQuery(GET_SCORE).getResultList().get(0);
	}

	@Override
	public void saveScore(String itemid, String playerid, String paiming, Integer socre, String report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlayerEntryForm(String itemid, String playerid) {
		// TODO Auto-generated method stub
		String DEL_PLAYERENTRYFORM = "DELETE FROM PALYERENTRYFORM WHERE ITEMID = '"+itemid+"' AND PLAYERID = '"+playerid+"'";
		System.out.println("老子也进来了"+itemid+playerid);
		sessionFactory.getCurrentSession().createSQLQuery(DEL_PLAYERENTRYFORM).executeUpdate();
	}

	@Override
	public PlayerEntryForm getPlayerEntryForm(String itemid, String playerid) {
		// TODO Auto-generated method stub
		return (PlayerEntryForm) sessionFactory.getCurrentSession().createQuery(GET_PLAYERENTRYFORM).setParameter(0, itemid).setParameter(1, playerid).getResultList().get(0);
	}

	@Override
	public Integer getPlayerDeptNum(String playerid, String deptName) {
		// TODO Auto-generated method stub
		String GET_DEPTNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.depName='"+
		deptName+"' ORDER BY Score DESC) c WHERE c.playerID='"+playerid+"'";
		Double numDouble = (Double)sessionFactory.getCurrentSession().createSQLQuery(GET_DEPTNUM_SQL).getResultList().get(0);
		return numDouble.intValue();
	}

	@Override
	public Integer getPlayerSchoolNum(String playerid) {
		// TODO Auto-generated method stub
		String GET_SCHOOLNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b ORDER BY Score DESC) c WHERE c.playerID='"+playerid+"'";
		return CommonUtil.doubleToInteger((Double)sessionFactory.getCurrentSession().createSQLQuery(GET_SCHOOLNUM_SQL).getResultList().get(0));
	}

	@Override
	public List<PlayerEntryForm> listAllPlayerEntyrFormByID(String playerid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery(GET_ALLPALYERENTRYFORM).setParameter(0, playerid).getResultList();	}

	}