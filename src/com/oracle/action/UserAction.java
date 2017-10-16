package com.oracle.action;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.service.UserService;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("action");
		userService.test();
		return NONE;
	}
}
