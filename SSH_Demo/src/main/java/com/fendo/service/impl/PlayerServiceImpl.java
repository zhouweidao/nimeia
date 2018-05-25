package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.AdminDao;
import com.fendo.dao.DepEntryFormDao;
import com.fendo.dao.ItemDao;
import com.fendo.dao.PlayerDao;
import com.fendo.dao.PlayerEntryFormDao;
import com.fendo.entity.Admin;
import com.fendo.entity.DepEntryForm;
import com.fendo.entity.Item;
import com.fendo.entity.Player;
import com.fendo.entity.PlayerEntryForm;
import com.fendo.service.PlayerService;
import com.fendo.util.PlayerDto;

@Service
public class PlayerServiceImpl extends BaseServiceImpl<Player> implements PlayerService {

	@Autowired
	private PlayerDao playDao;
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	DepEntryFormDao depEntryFormDao;
	@Autowired
	PlayerEntryFormDao playerEntryFormDao;

	@Override
	public String login(String username, String pswd, String type) {
		// TODO Auto-generated method stub
		String result = "";
		int ntype = Integer.parseInt(type);
		Player player = null;
		if (!"".equals(username) && !"".equals(pswd)) {
			if (ntype == 1) {
				player = playDao.get(username, Player.class);
				if (player == null) {
					result = "当前用户不存在,请重新登陆!";
				} else {
					if (player.getPlayerID().equals(username) && player.getPassword().equals(pswd)) {
						result = "playinfo";
					} else {
						result = "用户名或密码错误!";
					}
				}
			} else {
				Admin admin = adminDao.getAdminByAdminID(username);
				if (admin != null) {
					if (username.equals(admin.getAdminID()) && pswd.equals(admin.getPassword())) {
						if (ntype == 2) {
							result = "managerinfo"; // **************
						} else if (ntype == 3) {
							result = "admininfo"; // *********系统管理员页面
						} else {
						}
					} else {
						result = "用户名或密码错误!";
					}
				} else {
					result = "当前用户不存在,请重新登陆!";
				}
			}

		} else {
			result = "用户名或密码不能为空!";
		}
		return result;
	}

	@Override
	public List<PlayerDto> findAllTopPlayer(String playertype, String playercontext, String searchcontext,
			String typeName, String contextName) {
		// TODO Auto-generated method stub
		System.out.println(playertype+":"+playercontext+":"+searchcontext);
		String temp = "";
		if (!playertype.equals("0") && !playercontext.equals("0") && !"".equals(searchcontext)) {
			if (playercontext.equals("4")) {
				temp = "itemName";
				return playDao.findPlayersByItemName(typeName, searchcontext);
			} else {
				if (playercontext.equals("2")) {
					temp = "playerID";
				} else if (playercontext.equals("3")) {
					temp = "depName";
				} else if (playercontext.equals("5")) {
					temp = "major";
				} else if (playercontext.equals("6")) {
					temp = "Class";
				}
				return playDao.findPlayers(typeName, temp, searchcontext);
			}
		} else if (playertype.equals("0") && playercontext.equals("0") && "".equals(searchcontext)) {
			System.out.println("jinlaile");
			return playDao.findSchoolPlayers();
		} else {
			return null;
		}
	}

	@Override
	public List<Item> findAllItemName(String sex) {
		// TODO Auto-generated method stub
		return itemDao.listAllItemName(sex);
	}

	@Override
	public void editPlayerInfo(String playerid, String uaername, String sex, String dept, String cls, String phonenum,
			String usertype) {
		// TODO Auto-generated method stub
		Player player = playDao.get(playerid,Player.class);
		player.setPlayerID(playerid);
		player.setPlayerName(uaername);
		player.setSex(sex);
		player.setDepName(dept);
		player.setClasses(cls);
		player.setTel(phonenum);
		playDao.update(player);
	}

	@Override
	public boolean ableToApply(String playerid) {
		// TODO Auto-generated method stub
		
		int size = playerEntryFormDao.listAllPlayerEntyrFormByID(playerid).size();
		if(size < 2){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public boolean ableToApply(String itemID, String depID) {
		// TODO Auto-generated method stub
		DepEntryForm byDeptIDAndItemID = depEntryFormDao.getByDeptIDAndItemID(depID, itemID);
		if(byDeptIDAndItemID.getDepEntryNum() < byDeptIDAndItemID.getItemMax()){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public void playAply(Player player, String itemid, String itemname, String itemtype) {
		// TODO Auto-generated method stub
		PlayerEntryForm entryForm = new PlayerEntryForm();
		//playDao.get(player.getPlayerID(), Player.class);
		entryForm.setPlayerID(player.getPlayerID());
		entryForm.setPlayerName(player.getPlayerName());
		entryForm.setDepID(player.getDepID());
		entryForm.setItemID(itemid);
		entryForm.setItemName(itemname);
		entryForm.setItemNo("");
		entryForm.setItemType(itemtype);
		entryForm.setRecord("");
		entryForm.setItemScore(0);
		playerEntryFormDao.save(entryForm);
		//System.out.println(player.getPlayerEntryNum());
		//int tem = player.getPlayerEntryNum();
		//tem++;
		//player.setPlayerEntryNum(tem);
	//	System.out.println(tem+"-"+player.getPlayerEntryNum());
	//	playDao.update(player);
		DepEntryForm deptEntryForm = depEntryFormDao.getByDeptIDAndItemID(player.getDepID(),itemid);
		int depEntryNum = deptEntryForm.getDepEntryNum();
		depEntryNum++;
		deptEntryForm.setDepEntryNum(depEntryNum);
		depEntryFormDao.update(deptEntryForm);
	}
}
