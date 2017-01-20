package com.vacomall.common;

import com.vacomall.model.User;

/**
 * 父级控制
 * @author GaoJun.Zhou
 * @Time：2017年1月20日 下午2:47:01
 * @version 1.0  
 * Function: TODO
 */
public class SupperController {

	
	/**
	 * 获取当前登录用户的ID
	 * @return
	 */
	public String getUid(){
		return "a1001";
	}
	
	/**
	 * 获取当前的用户
	 * @return
	 */
	public User getUser(){
		return new User();
	}
	
}
