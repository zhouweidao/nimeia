package com.fendo.dao.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.PlayerDao;
import com.fendo.entity.DepEntryForm;
import com.fendo.entity.Item;
import com.fendo.entity.Player;
import com.fendo.util.CommonUtil;
import com.fendo.util.DBResourceUtil;
import com.fendo.util.PageBean;
import com.fendo.util.PlayerDto;

@Repository
@Transactional
public class PlayerDaoImpl extends BaseDaoImpl<Player> implements PlayerDao {
	private static List<PlayerDto> playerdtos = new ArrayList<>();
	@Autowired
	SessionFactory sessionfactory;
	private static final String COUNT_PLAYER = "SELECT COUNT(PLAYERID) FROM PLYAERENTRYFORM WHERE PLAYERID = ?";
	private static final String GET_ITEM_MAXJOIN_NUM_STRING = "SELECT ITEMMAX,DEPENTRYFORM FROM DEPENTRYFROM WHERE DEPID = ? AND ITEMID = ?";
	private static final String LIST_ITEM_NAME = "SELECT DISTINCT ITEMID,ITENNAME FROM ITEM WHERE ITEMSEX = ?";
	private static final String GET_CLSNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.Class=? ORDER BY Score DESC) c WHERE c.playerID=?";
	private static final String GET_MARJORNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.major=? ORDER BY Score DESC) c WHERE c.playerID=?";
	private static final String GET_DEPTNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.depName=? ORDER BY Score DESC) c WHERE c.playerID=?";
	private static final String GET_SCHOOLNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b ORDER BY Score DESC) c WHERE c.playerID=?";
	@Override
	public PageBean<Player> findAllEmpsByDeptNo(Integer no, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<PlayerDto> findPlayers(String playertype,String temp ,String paraName) {
		// TODO Auto-generated method stub
		if(temp.equals("Class")){
			temp = "classes";
		}
		String FIND_PLAYER_SQL = "from Player where player = '"+playertype+"' and "+temp+" ='"+paraName+"' ORDER BY Score DESC";
		
		playerdtos.clear();
		int count = 0;
		int clsnum = 0;
		int marjornum = 0;
		int deptnum = 0;
		int schoolnum = 0;
		List<Player> players = sessionfactory.getCurrentSession().createQuery(FIND_PLAYER_SQL).setFirstResult(0).setMaxResults(15).getResultList();
		if(players.size()!=0){
		Iterator<Player> iterator = players.iterator();
		Player temPlayer = new Player();
		while(iterator.hasNext()){
			count++;
			temPlayer = iterator.next();
			String GET_CLSNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.Class= '"+temPlayer.getClasses()+"' ORDER BY Score DESC) c WHERE c.playerID= '"+temPlayer.getPlayerID()+"'";
			String GET_MARJORNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.major='"+temPlayer.getMajor()+"' ORDER BY Score DESC) c WHERE c.playerID='"+temPlayer.getPlayerID()+"'";
			String GET_DEPTNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b WHERE a.depName='"+temPlayer.getDepName()+"' ORDER BY Score DESC) c WHERE c.playerID='"+temPlayer.getPlayerID()+"'";
			String GET_SCHOOLNUM_SQL = "SELECT rowno FROM (SELECT a.playerID,a.playerName,a.Score,a.Class,a.major, (@rowno\\:=@rowno+1) as rowno FROM player a,(select (@rowno\\:=0)) b ORDER BY Score DESC) c WHERE c.playerID='"+temPlayer.getPlayerID()+"'";
			System.out.println(temPlayer.getClasses()+temPlayer.getMajor()+temPlayer.getDepName()+temPlayer.getPlayerID());
			clsnum = CommonUtil.doubleToInteger((Double) sessionfactory.getCurrentSession().createSQLQuery(GET_CLSNUM_SQL).getResultList().get(0));
			Double num = (Double)sessionfactory.getCurrentSession().createSQLQuery(GET_MARJORNUM_SQL).getResultList().get(0);
			marjornum = CommonUtil.doubleToInteger(num);
			deptnum = CommonUtil.doubleToInteger((Double)sessionfactory.getCurrentSession().createSQLQuery(GET_DEPTNUM_SQL).getResultList().get(0));
			schoolnum = CommonUtil.doubleToInteger((Double)sessionfactory.getCurrentSession().createSQLQuery(GET_SCHOOLNUM_SQL).getResultList().get(0));
			System.out.println("clsnum:"+clsnum+"marjornum:"+marjornum+"depnum:"+deptnum+"schoolnum:"+schoolnum);
			playerdtos.add(DBResourceUtil.getPlayerDtos(temPlayer, count, clsnum, marjornum, deptnum, schoolnum));
		}
		}
		System.out.println(playerdtos.size()+";"+playerdtos.toString());
		return playerdtos;
	}

	

	@Override
	public DepEntryForm CountCurrentItemJoinNum(String deptid, String itemid) {
		// TODO Auto-generated method stub
		return (DepEntryForm) sessionfactory.getCurrentSession().createQuery(GET_ITEM_MAXJOIN_NUM_STRING).setParameter(0, deptid).setParameter(1, itemid).getSingleResult();
	}

	@Override
	public Integer CountplayerJoinNum(String playerid) {
		// TODO Auto-generated method stub
		return (Integer) sessionfactory.getCurrentSession().createQuery(COUNT_PLAYER).setParameter(0, playerid).getSingleResult();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<PlayerDto> findPlayersByItemName(String playertype,String paraName) {
		// TODO Auto-generated method stub
		playerdtos.clear();
		String fIND_ITEM_SQL = "select a.playerName as name,a.playerID as id,b.itemScore as score from player as a,palyerentryform as b where a.playerID = b.playerID and a.player = '"+playertype+"' and b.itemName = '"+paraName+"' order by a.Score DESC" ; 
		playerdtos = sessionfactory.getCurrentSession().createSQLQuery(fIND_ITEM_SQL).setResultTransformer(Transformers.aliasToBean(PlayerDto.class)).getResultList();
		return playerdtos;
	}

	@Override
	public List<PlayerDto> findSchoolPlayers() {
		// TODO Auto-generated method stub
		//String FIND_PLAYER_SQL = "select a.depName as name,SUM(a.score) as score from player as a GROUP BY a.depName ORDER BY a.score DESC";
		String FIND_PLAYER_SQL = "select new com.fendo.util.PlayerDto(a.depName as name,SUM(a.score) as score) from Player as a GROUP BY a.depName ORDER BY a.score DESC";
	//	return sessionfactory.getCurrentSession().createSQLQuery(FIND_PLAYER_SQL).setResultTransformer(Transformers.aliasToBean(PlayerDto.class)).getResultList();
		return sessionfactory.getCurrentSession().createQuery(FIND_PLAYER_SQL).getResultList();
	}
}