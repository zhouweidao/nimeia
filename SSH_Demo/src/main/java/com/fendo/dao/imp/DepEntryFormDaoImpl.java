package com.fendo.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fendo.dao.DepEntryFormDao;
import com.fendo.entity.DepEntryForm;

@Repository
@Transactional
public class DepEntryFormDaoImpl extends BaseDaoImpl<DepEntryForm> implements DepEntryFormDao {
	private static final String GET_DEPENTRYFORM_SQL = "FROM DepEntryForm WHERE depID = ? AND itemID = ?";
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public DepEntryForm getByDeptIDAndItemID(String depID, String itemid) {
		// TODO Auto-generated method stub
		List<DepEntryForm> resultList = sessionFactory.getCurrentSession().createQuery(GET_DEPENTRYFORM_SQL).setParameter(0, depID).setParameter(1, itemid).getResultList();
		if(resultList.size()!=0){
			return resultList.get(0);
		}else {
			return null;
		}
	}

	}