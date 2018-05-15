package com.fendo.dao.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.PlayerDao;
import com.fendo.entity.Player;
import com.fendo.util.DBResourceUtil;
import com.fendo.util.PageBean;
import com.fendo.util.PlayerDto;

@Repository
public class PlayerDaoImpl extends BaseDaoImpl<Player> implements PlayerDao {
	private static List<PlayerDto> playerdtos = new ArrayList<>();
	@Autowired
	SessionFactory sessionfactory;
	

	private static final String FIND_PLAYER_SQL = "select * from player ORDER BY Score ASC LIMIT 0,14;";
	private static final String GET_CLSNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno:=@rowno+1) as rowno FROM player a,(select (@rowno:=0)) b WHERE a.Class=? ORDER BY Score DESC) c WHERE c.playerID=?;";
	private static final String GET_MARJORNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno:=@rowno+1) as rowno FROM player a,(select (@rowno:=0)) b WHERE a.major=? ORDER BY Score DESC) c WHERE c.playerID=?;";
	private static final String GET_DEPTNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno:=@rowno+1) as rowno FROM player a,(select (@rowno:=0)) b WHERE a.depName=? ORDER BY Score DESC) c WHERE c.playerID=?;";
	private static final String GET_SCHOOLNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno:=@rowno+1) as rowno FROM player a,(select (@rowno:=0)) b ORDER BY Score DESC) c WHERE c.playerID=?;";
	@Override
	public PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDto> findPlayers() {
		// TODO Auto-generated method stub
		int count = 0;
		int clsnum = 0;
		int marjornum = 0;
		int deptnum = 0;
		int schoolnum = 0;
		System.out.println(sessionfactory);
		List<Player> players = sessionfactory.getCurrentSession().createQuery(FIND_PLAYER_SQL).getResultList();
		Iterator<Player> iterator = players.iterator();
		Player temPlayer = new Player();
		while(iterator.hasNext()){
			count++;
			temPlayer = iterator.next();
			clsnum = sessionfactory.getCurrentSession().createQuery(GET_CLSNUM_SQL).setParameter(0, temPlayer.getClass()).setParameter(1,temPlayer.getPlayerID()).getFirstResult();
			marjornum = sessionfactory.getCurrentSession().createQuery(GET_MARJORNUM_SQL).setParameter(0, temPlayer.getMajor()).setParameter(1, temPlayer.getPlayerID()).getFirstResult();
			deptnum = sessionfactory.getCurrentSession().createQuery(GET_DEPTNUM_SQL).setParameter(0, temPlayer.getDepName()).setParameter(1, temPlayer.getPlayerID()).getFirstResult();
			schoolnum = sessionfactory.getCurrentSession().createQuery(GET_SCHOOLNUM_SQL).setParameter(0, temPlayer.getPlayerID()).getFirstResult();
			playerdtos.add(DBResourceUtil.getPlayerDtos(iterator.next(), count, clsnum, marjornum, deptnum, schoolnum));
		}
		return playerdtos;
	}
}