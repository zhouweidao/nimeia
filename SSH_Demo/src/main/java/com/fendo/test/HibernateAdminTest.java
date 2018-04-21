package com.fendo.test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fendo.entity.Admin;
import com.fendo.entity.User;

public class HibernateAdminTest {
	
	StandardServiceRegistry registry =  null;
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction transaction = null;
    
	@Before
    public void init() {

        registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        session = sessionFactory.openSession();
        //开始事务
        transaction = session.getTransaction();
        transaction.begin();
    }
	
	@Test
    public void testSaveAdmin() {
        Admin user = new Admin();
        user.setAdminID("adm00");
        user.setAdminName("系统管理员4");
        user.setPassword("aaaaaa");
        user.setPriority(3);
        session.save(user);
        /*User user = new User();
        user.setName("fendo");
        session.save(user);
        User user = new User();
        user.setName("fendo");
        session.save(user);
        User user = new User();
        user.setName("fendo");
        session.save(user);*/
    }

    @After 
    public void destroy(){
        transaction.commit();
        session.close();
        sessionFactory.close();
        StandardServiceRegistryBuilder.destroy(registry);
    }

}
