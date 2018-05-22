package com.fendo.dao;

import org.springframework.stereotype.Repository;

import com.fendo.entity.DepEntryForm;

public interface DepEntryFormDao extends BaseDao<DepEntryForm>{

	DepEntryForm getByDeptIDAndItemID(String depID, String itemid);
	
}
