package com.fendo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.AdminDao;
import com.fendo.entity.Admin;
import com.fendo.entity.User;
import com.fendo.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	@Autowired
	AdminDao adminDao;
	


	@Override
	public void updatePassword(String adminID,String password) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.getAdminByAdminID(adminID);
		admin.setPassword(password);
		adminDao.update(admin);
	}



	@Override
	public void setPripority(String adminid, String usertype, String pripority) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.getAdminByAdminID(adminid);
		System.out.println(adminid.toString()+":"+pripority);
		admin.setPriority(Integer.parseInt(pripority));
		adminDao.update(admin);
	}



	@Override
	public Admin getByID(String username) {
		// TODO Auto-generated method stub
		return adminDao.getAdminByAdminID(username);
	}
}
