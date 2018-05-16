package com.fendo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fendo.entity.Item;

public interface ItemDao extends BaseDao<Item>{
	
	
	
	List<Item> listAllItemName(String sex,String kinds);

	List<Item> listAllItemName(String sex);
	
}
