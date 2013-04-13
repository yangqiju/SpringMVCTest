package com.joyveb.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joyveb.bean.User;

/**
 * 
 * 项目名称：SpringMVCTest 类名称：DemoCtrl
 * 
 * @Company: 北京畅享互联有限公司
 * @Copyright: Copyright (c) 2012
 * @Author： 杨其桔 创建时间：2013-1-18 上午3:58:46 修改备注：
 * @version
 * 
 */
@Slf4j
@Controller
public class DemoCtrl {
	@RequestMapping("/pojo2Json")
	@ResponseBody
	public User pojo2Json() {
		log.info("pojo2Json");
		User user = new User();
		user.setPassword("passwd");
		user.setUserName("name");
		return user;
	}

	@RequestMapping("/map2Json")
	@ResponseBody
	public Map<String, Object> map2Json() {
		User user = new User();
		user.setUserName("jack");
		user.setPassword("passwd");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		map.put("success", true);
		return map;
	}

	@RequestMapping("/list2Json")//
	@ResponseBody
	public List<User> list2Json() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setUserName("jack" + i);
			user.setPassword("passwd");
			users.add(user);
		}
		return users;
	}
	
	@RequestMapping("/list2Json2")//没有@ResponseBody 的情况下
	public List<User> list2Json2() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setUserName("jack" + i);
			user.setPassword("passwd");
			users.add(user);
		}
		return users;
	}
	
/**
 * <bean
		class="org.springframework.web.servlet.view.ContentNegotiatingViewResolver">
		<property name="mediaTypes">
			<map>
				<entry key="xml" value="application/xml" />
				<entry key="html" value="text/html" />
				<entry key="json" value="application/json" />
			</map>
		</property>
		<property name="defaultViews">
			<list>
				<bean
					class="org.springframework.web.servlet.view.json.MappingJacksonJsonView" />
			</list>
		</property>
		<!-- 
		<property name="viewResolvers">
			<list>
				<bean class="org.springframework.web.servlet.view.BeanNameViewResolver" />
				<bean id="urlViewResolver"
					class="org.springframework.web.servlet.view.UrlBasedViewResolver">
					<property name="viewClass"
						value="org.springframework.web.servlet.view.JstlView" />
					<property name="prefix" value="/view/" />
					<property name="suffix" value=".jsp" />
				</bean>
			</list>
		</property>
		 -->
	</bean>
 */
}
