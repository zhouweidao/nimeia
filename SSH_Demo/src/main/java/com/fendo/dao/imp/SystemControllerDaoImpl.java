package com.fendo.dao.imp;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fendo.dao.SystemControllerDao;
import com.fendo.entity.SystemController;
@Repository
@Transactional
public class SystemControllerDaoImpl extends BaseDaoImpl<SystemController> implements SystemControllerDao{

}
