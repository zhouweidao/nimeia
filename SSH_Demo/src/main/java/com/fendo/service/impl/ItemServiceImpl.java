package com.fendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fendo.dao.ItemDao;
import com.fendo.entity.Item;
import com.fendo.service.ItemService;
@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService{

	@Autowired
	ItemDao itemDao;
	
	@Override
	public List<Item> findAllItemName(String sex, String itemType) {
		// TODO Auto-generated method stub
		return itemDao.listAllItemName(sex, itemType);
	}

}
