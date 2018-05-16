package com.fendo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fendo.entity.Item;

public interface ItemService extends BaseService<Item>{

	List<Item> findAllItemName(String sex, String itemType);
}
