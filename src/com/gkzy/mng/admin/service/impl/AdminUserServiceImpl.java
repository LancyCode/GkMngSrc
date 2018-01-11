package com.gkzy.mng.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gkzy.mng.admin.dao.AdminUserDao;
import com.gkzy.mng.admin.service.AdminUserService;
import com.gkzy.mng.bean.AdminUser;

@Service
public class AdminUserServiceImpl implements AdminUserService {
	@Autowired
	private AdminUserDao adminUserDaoImpl;

	@Override
	public int insertAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		return adminUserDaoImpl.insertAdminUser(adminUser);
	}

	@Override
	public int updateAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		return adminUserDaoImpl.updateAdminUser(adminUser);
	}

	@Override
	public AdminUser queryAdminUser(AdminUser amdinUser) {
		// TODO Auto-generated method stub
		return adminUserDaoImpl.queryAdminUser(amdinUser);
	}

	@Override
	public int deleteAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		return adminUserDaoImpl.deleteAdminUser(adminUser);
	}

	@Override
	public AdminUser loginAdminUser(String auAccount,String auPwd) {
		return adminUserDaoImpl.loginAdminUser(auAccount,auPwd);
	}
	

}
