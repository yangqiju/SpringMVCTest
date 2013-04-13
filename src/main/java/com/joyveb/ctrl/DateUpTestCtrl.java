package com.joyveb.ctrl;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.javass.spring.mvc.bind.annotation.RequestJsonParam;

import com.joyveb.bean.TreeUser;
import com.joyveb.bean.User;

/**
 * @Title: DateUpTestCtrl.java
 * @Package com.joyveb.ctrl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 杨其桔
 * @date 2013-4-10 下午10:54:25
 * @version V1.0
 */
@Controller
@RequestMapping("/dateCtrl")
public class DateUpTestCtrl {

	@RequestMapping("/test")
	public @ResponseBody
	String test(@RequestJsonParam(value="data") List<User> user) {
		return "test";
	}
	
	@RequestMapping("/test2")
	public @ResponseBody
	String test2(@RequestParam(value="data") TreeUser user) {
		System.out.println(JSONObject.fromObject(user).toString());
		System.out.println(JSONArray.fromObject(user.getUsers()).toString());
		List<TreeUser> list = user.getUsers();
		TreeUser tu = list.get(0);
		System.out.println(JSONArray.fromObject(tu));
		return "test";
	}
}
