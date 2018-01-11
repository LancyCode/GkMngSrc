package com.gkzy.mng.admin.service;

import org.springframework.stereotype.Service;

import com.gkzy.mng.bean.AdminUser;

@Service
public interface AdminUserService {
	public int insertAdminUser(AdminUser adminUser);
	public int updateAdminUser(AdminUser adminUser);
	public AdminUser queryAdminUser(AdminUser amdinUser);
	public int deleteAdminUser(AdminUser adminUser);
	public AdminUser loginAdminUser(String auAccount,String auPwd);
}
