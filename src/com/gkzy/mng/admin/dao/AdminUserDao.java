package com.gkzy.mng.admin.dao;

import org.springframework.stereotype.Repository;

import com.gkzy.mng.bean.AdminUser;

@Repository
public interface AdminUserDao {
	public int insertAdminUser(AdminUser adminUser);
	public int updateAdminUser(AdminUser adminUser);
	public AdminUser queryAdminUser(AdminUser amdinUser);
	public int deleteAdminUser(AdminUser adminUser);
	public AdminUser loginAdminUser(String auAccount,String auPwd);
}
