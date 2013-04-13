package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.joyveb.bean.User;

/**
 * 
 * 项目名称：SpringMVCTest 类名称：RestfulCtrl
 * 
 * @Company: 北京畅享互联有限公司
 * @Copyright: Copyright (c) 2012
 * @Author： 杨其桔 创建时间：2013-1-2 上午10:12:16 修改备注：
 * @version
 * 
 */
@Controller
@RequestMapping("/multi")
public class MultiCtrl {
	//<!-- 同一资源,多种表述-->
	
	@RequestMapping("/user.json")
	public User test() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		return user;
	}

	@RequestMapping("/user")
	@ResponseBody
	// 不加@ResponseBody不能正常运行
	public User tset1() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		return user;
	}

	@RequestMapping("/user2.json")
	public ModelAndView tset3() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		ModelAndView mav = new ModelAndView("index.jsp");
		mav.addObject(user);
		return mav;
	}
	
	@RequestMapping("/user2.html")
	public ModelAndView tset4() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		ModelAndView mav = new ModelAndView("index.jsp");
		mav.addObject(user);
		return mav;
	}
	
	@RequestMapping("/user2.xml")
	public ModelAndView tset54() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		ModelAndView mav = new ModelAndView("index.jsp");
		mav.addObject(user);
		return mav;
	}
}
