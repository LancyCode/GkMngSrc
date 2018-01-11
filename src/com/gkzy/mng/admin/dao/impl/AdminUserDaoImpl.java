package com.gkzy.mng.admin.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gkzy.mng.admin.dao.AdminUserDao;
import com.gkzy.mng.bean.AdminUser;

@Repository
public class AdminUserDaoImpl implements AdminUserDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("static-access")
	@Override
	public int insertAdminUser(AdminUser adminUser) {
		Session session = sessionFactory.getCurrentSession();
		int i = (Integer) session.save(adminUser);
		return i;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public int updateAdminUser(AdminUser adminUser) {
		Session session = sessionFactory.getCurrentSession();
		
		
		return 0;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public AdminUser queryAdminUser(AdminUser amdinUser) {
		Session session = sessionFactory.getCurrentSession();
		
		
		return null;
	}
	
	@SuppressWarnings("static-access")	
	@Override
	public int deleteAdminUser(AdminUser adminUser) {
		Session session = sessionFactory.getCurrentSession();
		
		
		return 0;
	}

	@SuppressWarnings({ "static-access", "unchecked" })
	@Override
	public AdminUser loginAdminUser(String auAccount,String auPwd) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from AdminUser Where auAccount = ?0 and auPwd = ?1";
		List<AdminUser> adminUserList = session.createQuery(hql).setParameter("0", auAccount).setParameter("1", auPwd).list();
		AdminUser adminUserT = null;
		for (int i = 0; i < adminUserList.size(); i++) {
			adminUserT = adminUserList.get(i);
		}
		System.out.println("有"+adminUserList.size()+"条数据");
		return adminUserT;
	}

}
