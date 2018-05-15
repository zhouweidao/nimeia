package com.fendo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aminisotrAction")
public class AdministorController {
	 @RequestMapping("/")	
     @ResponseBody
     public String mergePermissionAction(){
		 
		 return "";
	 }
}
