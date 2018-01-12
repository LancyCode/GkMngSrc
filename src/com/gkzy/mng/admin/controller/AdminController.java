package com.gkzy.mng.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gkzy.mng.admin.service.AdminUserService;
import com.gkzy.mng.admin.service.impl.AdminUserServiceImpl;
import com.gkzy.mng.bean.AdminUser;


@Controller 
public class AdminController {
	@Autowired
	private AdminUserService adminUserServiceImpl;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String auAccount, String auPwd,HttpSession session,HttpServletRequest request, HttpServletResponse response) {
			AdminUser adminUser = adminUserServiceImpl.loginAdminUser(auAccount,auPwd);
			if( adminUser != null){
				session.setAttribute("user", adminUser);
				session.setMaxInactiveInterval(300);
				return "index";
			}else{
				request.setAttribute("msg", "用户名或密码错误，请重新输入！");
				return "login";
			}
	}
	
	
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
		
	}
	
	@RequestMapping("/")
	public String showLogin(){
		return "login";
	}
}

