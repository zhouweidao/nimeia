package com.fendo.listener;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fendo.entity.Admin;
import com.fendo.service.AdminService;

public class PreLoadDataListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
		WebApplicationContext wac = 
				WebApplicationContextUtils.getWebApplicationContext(sc);
		AdminService adminService = wac.getBean(AdminService.class);
		/*List<Admin> userList = adminService.getAll();
		Map<Integer,Admin> cacheMap = new ConcurrentHashMap<>(); 
		for(Admin user : userList){
			cacheMap.put(user.getId(), user);
		}*/
		
		sc.setAttribute("user", adminService.get(""));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().removeAttribute("user");
	}

}
