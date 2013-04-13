package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.joyveb.bean.User;

/**
 * 
 * ��Ŀ���ƣ�SpringMVCTest �����ƣ�RestfulCtrl
 * 
 * @Company: �������������޹�˾
 * @Copyright: Copyright (c) 2012
 * @Author�� ����� ����ʱ�䣺2013-1-2 ����10:12:16 �޸ı�ע��
 * @version
 * 
 */
@Controller
@RequestMapping("/multi")
public class MultiCtrl {
	//<!-- ͬһ��Դ,���ֱ���-->
	
	@RequestMapping("/user.json")
	public User test() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		return user;
	}

	@RequestMapping("/user")
	@ResponseBody
	// ����@ResponseBody������������
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
