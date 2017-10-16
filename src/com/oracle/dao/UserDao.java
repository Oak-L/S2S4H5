package com.oracle.dao;

import java.io.Serializable;
import java.util.List;

import com.oracle.entity.User;

public interface UserDao {

	User get(Class<User> entityClass, Serializable id);

	void add(User user);

	void delect(User user);

	void update(User user);

	List<User> findAllUser();

	List<User> findUsername(String username);
}
