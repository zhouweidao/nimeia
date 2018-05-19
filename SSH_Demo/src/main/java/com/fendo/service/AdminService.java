package com.fendo.service;

import org.springframework.stereotype.Service;

import com.fendo.entity.Admin;

public interface AdminService extends BaseService<Admin>{

	void updatePassword(String adminID,String password);

	void setPripority(String adminid, String usertype, String pripority);

	Admin getByID(String username);

}
