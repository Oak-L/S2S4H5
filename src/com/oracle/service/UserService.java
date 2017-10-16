package com.oracle.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.UserDao;
import com.oracle.entity.User;

@Transactional
public class UserService {
	// 注入dao对象
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void test() {
		System.out.println("service......");
		// userDao.add();
		// int i = 1;
		// User user = userDao.get(User.class, i);
		// List<User> list = userDao.findAllUser();
		List<User> list = userDao.findUsername("L");
		for (User user : list) {
			System.out.println(user.getUsername() + "--" + user.getPassword());
		}
	}
}
