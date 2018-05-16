package com.fendo.dao;

import org.springframework.stereotype.Repository;

import com.fendo.entity.Admin;


public interface AdminDao extends BaseDao<Admin>{

	Admin getAdminByAdminID(String adminid);
	
}
