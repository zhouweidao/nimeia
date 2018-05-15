package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.AdminDao;
import com.fendo.dao.PlayerDao;
import com.fendo.entity.Admin;
import com.fendo.entity.Player;
import com.fendo.service.PlayerService;
import com.fendo.util.PlayerDto;

@Service
public class PlayerServiceImpl extends BaseServiceImpl<Player> implements PlayerService {

	@Autowired
	private PlayerDao playDao;
	@Autowired
	private AdminDao adminDao;

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
				Admin admin = adminDao.get(username, Admin.class);
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
	public List<PlayerDto> findAllTopPlayer(String playertype, String playercontext, String searchcontext) {
		// TODO Auto-generated method stub
		return playDao.findPlayers();
	}

}
