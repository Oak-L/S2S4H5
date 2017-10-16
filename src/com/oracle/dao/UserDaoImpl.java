package com.oracle.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.oracle.entity.User;

public class UserDaoImpl implements UserDao {
	// 得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(User user) {
		// hibernateTemplate对hibernate进行封装
		// HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		// User user = new User();
		// user.setUsername("L");
		// user.setPassword("123");
		// 调用save方法实现添加
		hibernateTemplate.save(user);
	}

	public void delect(User user) {
		hibernateTemplate.delete(user);
	}

	public void update(User user) {
		hibernateTemplate.update(user);
	}

	public User get(Class<User> entityClass, Serializable id) {
		// 根据id查询
		User user = hibernateTemplate.get(entityClass, id);
		return user;
	}

	public List<User> findAllUser() {
		// 查询所有
		List<User> list = (List<User>) hibernateTemplate.find("from User");
		return list;
	}

	public List<User> findUsername(String username) {
		// 根据username查询
		List<User> list = (List<User>) hibernateTemplate.find("from User where username=?", username);
		return list;
	}
}
