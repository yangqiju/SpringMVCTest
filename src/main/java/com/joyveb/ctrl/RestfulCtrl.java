package com.joyveb.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joyveb.bean.User;

/**
 * 
 * 项目名称：SpringMVCTest 类名称：RestfulCtrl
 * 
 * @Company: 北京畅享互联有限公司
 * @Copyright: Copyright (c) 2012
 * @Author： 杨其桔 创建时间：2013-1-2 下午12:46:27 修改备注：
 * @version
 * 
 */
@Controller
@RequestMapping("/rest")
public class RestfulCtrl {

	@RequestMapping(value = "/user/{username}", method = RequestMethod.POST)
	@ResponseBody
	public User post(@PathVariable String username, HttpServletRequest request,
			HttpServletResponse response) {
		User user = new User();
		user.setUserName(username);
		return user;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	@ResponseBody
	public String delete() {
		return "delete";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		return "get";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	@ResponseBody
	public String put() {
		return "put";
	}
}
