package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户的数据
	 *
	 */
	User getUser(Integer id);
	/**
	 * 增加用户信息
	 */
	void addScore(Integer id, Integer score);
}