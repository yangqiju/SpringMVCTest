package com.joyveb.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.joyveb.bean.User;

/**
 * 
 * 项目名称：SpringMVCTest 类名称：LoginCtrl
 * 
 * @Company: 北京畅享互联有限公司
 * @Copyright: Copyright (c) 2012
 * @Author： 杨其桔 创建时间：2013-1-16 下午12:38:37 修改备注：
 * @version
 * 
 */
@Slf4j
@Controller
public class LoginCtrl {
	Logger log = LoggerFactory.getLogger(LoginCtrl.class);

	@RequestMapping("/login")
	public String login() {
		return "abc";// 直接跳转请求 [/SpringMVCTest/abc]
		// 跳转页面路径（默认为转发），该路径不需要包含spring-servlet配置文件中配置的前缀和后缀
	}

	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public @ResponseBody
	String login2() {
		return "欢迎";// 直接返回字符串
	}

	@RequestMapping("test/login3")
	// 请求url地址映射，类似Struts的action-mapping
	public @ResponseBody
	String testLogin(@RequestParam(value = "username") String username,
			String password, HttpServletRequest request) {
		// @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
		// @RequestParam可简写为：@RequestParam("username")
		if ("admin".equals(username) && "admin".equals(password)) {
			return "loginSuccess";
		}
		return "loginError";
	}

	@RequestMapping("/test/login4.do")
	public ModelAndView testLogin2(String username, String password) {
		log.info("username:" + username);
		log.info("password:" + password);
		// request和response不必非要出现在方法中，如果用不上的话可以去掉
		// 参数的名称是与页面控件的name相匹配，参数类型会自动被转换
		if ("admin".equals(username) && "admin".equals(password)) {
			return new ModelAndView(new RedirectView("index.jsp")); // 采用重定向方式跳转页面
		}
		return new ModelAndView("index.jsp"); // 手动实例化ModelAndView完成跳转页面（转发），效果等同于上面的方法返回字符串
		// return "forward:loginError";
		// 重定向还有一种简单写法
		// return new ModelAndView("redirect:../index.jsp");
	}

	@RequestMapping("/test/login5")
	public @ResponseBody
	String testLogin3(User user) {
		// 同样支持参数为表单对象，类似于Struts的ActionForm，User不需要任何配置，直接写即可
		String username = user.getUserName();
		String password = user.getPassword();
		log.info("username:" + username);
		log.info("password:" + password);
		if ("admin".equals(username) && "admin".equals(password)) {
			return "登录成功";
		}
		return "登录失败";
	}

	@RequestMapping("/test/login6")
	@ResponseBody
	public ModelAndView testLogin6() {
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "Hello World!");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello.jsp");// 路径在<property name="prefix" value="/"
									// />中配置
		return mv;
	}

	@RequestMapping("/test/login7")
	public @ResponseBody
	User testLogin7() {
		log.info("test/login7");
		User user = new User();
		user.setPassword("password");
		user.setUserName("密码");
		return user;
	}

	/**
	 * ResponseEntity<> 和@ResponseBody效果一样
	 */
	@RequestMapping(value = "/test/login8")
	public ResponseEntity<User> testJson2() {
		User user = new User();
		user.setUserName("username");
		user.setPassword("password");
		ResponseEntity<User> responseResult = new ResponseEntity<User>(user,
				HttpStatus.OK);
		return responseResult;
	}

	/**
	 * 输出为JSON格式的数据的方式 1、@ResponseBody的作用是把返回值直接写到HTTP response body里
	 * 
	 * @param session
	 * @return
	 * @throws ServletRequestBindingException
	 */
	@RequestMapping(value = "/test/login9", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView commonReturnType(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		session.setAttribute("userName", "使用ResponseBody输出！");
		ModelMap modelMap = new ModelMap();
		modelMap.put("mapKey", "mapValue");
		modelMap.addAttribute("attributeKey", "attributeValue");
		mav.addObject("model", "输出");
		mav.addObject("modelMap", modelMap);
		mav.setViewName("hello2.jsp");
		return mav;
	}

}
