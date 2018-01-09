package com.gkzy.mng.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/{page}")
	public String getMid(@PathVariable String page) throws Exception{
		return page;
	}
}

