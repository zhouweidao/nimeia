package com.fendo.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fendo.dao.imp.BaseDaoImpl;
import com.fendo.service.BaseService;


/**
 * Service层基类实现类。该类是一个抽象类。ࡣ
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
	
	
	@Autowired
	private BaseDaoImpl<T> baseDaoImpl;

    private Class<T> clazz;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public BaseServiceImpl() {
    	 // 子类
        Class cla = getClass();
        // 通过子类获取到父类 
        // 泛型参数
        Type type = cla.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) type;
            clazz = (Class<T>) pType.getActualTypeArguments()[0];
        }
    }

    /*
     * 保存数据
     * @see cn.mylife.service.user.BaseService#save(java.lang.Object)
     */
    @Override
    public void save(T t) {
        baseDaoImpl.save(t);
    }

    /*
     * 根据ID删除数据
     * @see cn.mylife.service.user.BaseService#delete(java.io.Serializable)
     */
    @Override
    public void delete(Serializable id) {
        baseDaoImpl.delete(id, clazz);
    }

    /*
     * 更新数据
     * @see cn.mylife.service.user.BaseService#update(java.lang.Object)
     */
    @Override
    public void update(T t) {
        baseDaoImpl.update(t);
    }

    /*
     * 根据ID获得数据
     * @see cn.mylife.service.user.BaseService#get(java.io.Serializable)
     */
    @Override
    public T get(Serializable id) {
        return baseDaoImpl.get(id, clazz);
    }

    /*
     * 获取所有的数据
     * @see cn.mylife.service.user.BaseService#getAll()
     */
    @Override
    public List<T> getAll() {
        return baseDaoImpl.getAll(clazz);
    }

}