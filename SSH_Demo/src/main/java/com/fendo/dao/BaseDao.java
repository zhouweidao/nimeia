package com.fendo.dao;

import java.io.Serializable;

public interface BaseDao<T> {
/**
 * 根据id得到对象
 * @param id
 * @param clazz  要返回的实体对象类型
 * @return 查询到的对象
 */
	T get(Serializable id, Class<T> clazz);
	
	void delete(Serializable id, Class<T> clazz);
	
	void save(T t);
	
	void update(T t);
}
