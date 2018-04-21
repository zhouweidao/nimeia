package com.fendo.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.entity.User;
import com.fendo.service.UserService;

@Controller
public class testAdminController {

	@Resource
	private UserService userService;
	
	 @RequestMapping("/addUser")  
	    public ModelAndView addPerson(User user){  
	        System.out.println("页面数据："+user.toString());  
	          
	        //加入数据  
	        userService.save(user);  
	          
	        //查数据  
	        User users=userService.get(1);
	        System.out.println(users.toString()); 
	        
	        List<User> ls=userService.getAll();
	        
	        //存起来  
	        ModelAndView modelAndView=new ModelAndView();  
	        modelAndView.setViewName("success");  
	        modelAndView.addObject("user", ls);
	        return modelAndView;  
	    }
	 @RequestMapping("/deleteUser")
	 public ModelAndView deletePerson(User user){  
	        System.out.println("页面数据："+user.toString());  
	        Serializable id = user.getId();
	        //删除数据  
	        userService.delete(id);  
	          
	        //查数据  
	        User users=userService.get(1);
	        System.out.println(users.toString()); 
	        
	        List<User> ls=userService.getAll();
	        
	        //存起来  
	        ModelAndView modelAndView=new ModelAndView();  
	        modelAndView.setViewName("success");  
	        modelAndView.addObject("user", ls);
	        return modelAndView;  
	    } 
}
