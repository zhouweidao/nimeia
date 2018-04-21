package com.fendo.service.impl;

import org.springframework.stereotype.Service;

import com.fendo.entity.Admin;
import com.fendo.entity.User;
import com.fendo.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	public String login(Admin adminID)
	{
		if(adminID.getAdminID()!=null)
		{
			//
			
		}else{
			
		}
		return "ok";
	}
}
