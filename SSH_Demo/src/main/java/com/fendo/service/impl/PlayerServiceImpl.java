package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.AdminDao;
import com.fendo.dao.ItemDao;
import com.fendo.dao.PlayerDao;
import com.fendo.entity.Admin;
import com.fendo.entity.Item;
import com.fendo.entity.Player;
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

}
