package com.vacomall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vacomall.common.SupperController;

/**
 * @author GaoJun.Zhou
 * @Time：2017年1月20日 下午2:54:05
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController extends SupperController{

	/**
	 * 新增用户
	 * @return
	 */
	@RequestMapping("/add")
	public String add(Model model){
		model.addAttribute("name", "zhangsan");
		return "user/add";
	}
	
}
