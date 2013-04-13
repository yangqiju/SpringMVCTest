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
 * ��Ŀ���ƣ�SpringMVCTest �����ƣ�LoginCtrl
 * 
 * @Company: �������������޹�˾
 * @Copyright: Copyright (c) 2012
 * @Author�� ����� ����ʱ�䣺2013-1-16 ����12:38:37 �޸ı�ע��
 * @version
 * 
 */
@Slf4j
@Controller
public class LoginCtrl {
	Logger log = LoggerFactory.getLogger(LoginCtrl.class);

	@RequestMapping("/login")
	public String login() {
		return "abc";// ֱ����ת���� [/SpringMVCTest/abc]
		// ��תҳ��·����Ĭ��Ϊת��������·������Ҫ����spring-servlet�����ļ������õ�ǰ׺�ͺ�׺
	}

	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public @ResponseBody
	String login2() {
		return "��ӭ";// ֱ�ӷ����ַ���
	}

	@RequestMapping("test/login3")
	// ����url��ַӳ�䣬����Struts��action-mapping
	public @ResponseBody
	String testLogin(@RequestParam(value = "username") String username,
			String password, HttpServletRequest request) {
		// @RequestParam��ָ����url��ַӳ���б��뺬�еĲ���(��������required=false)
		// @RequestParam�ɼ�дΪ��@RequestParam("username")
		if ("admin".equals(username) && "admin".equals(password)) {
			return "loginSuccess";
		}
		return "loginError";
	}

	@RequestMapping("/test/login4.do")
	public ModelAndView testLogin2(String username, String password) {
		log.info("username:" + username);
		log.info("password:" + password);
		// request��response���ط�Ҫ�����ڷ����У�����ò��ϵĻ�����ȥ��
		// ��������������ҳ��ؼ���name��ƥ�䣬�������ͻ��Զ���ת��
		if ("admin".equals(username) && "admin".equals(password)) {
			return new ModelAndView(new RedirectView("index.jsp")); // �����ض���ʽ��תҳ��
		}
		return new ModelAndView("index.jsp"); // �ֶ�ʵ����ModelAndView�����תҳ�棨ת������Ч����ͬ������ķ��������ַ���
		// return "forward:loginError";
		// �ض�����һ�ּ�д��
		// return new ModelAndView("redirect:../index.jsp");
	}

	@RequestMapping("/test/login5")
	public @ResponseBody
	String testLogin3(User user) {
		// ͬ��֧�ֲ���Ϊ������������Struts��ActionForm��User����Ҫ�κ����ã�ֱ��д����
		String username = user.getUserName();
		String password = user.getPassword();
		log.info("username:" + username);
		log.info("password:" + password);
		if ("admin".equals(username) && "admin".equals(password)) {
			return "��¼�ɹ�";
		}
		return "��¼ʧ��";
	}

	@RequestMapping("/test/login6")
	@ResponseBody
	public ModelAndView testLogin6() {
		// 1���ռ���������֤����
		// 2���󶨲������������
		// 3�������������ҵ��������ҵ����
		// 4��ѡ����һ��ҳ��
		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����
		mv.addObject("message", "Hello World!");
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("hello.jsp");// ·����<property name="prefix" value="/"
									// />������
		return mv;
	}

	@RequestMapping("/test/login7")
	public @ResponseBody
	User testLogin7() {
		log.info("test/login7");
		User user = new User();
		user.setPassword("password");
		user.setUserName("����");
		return user;
	}

	/**
	 * ResponseEntity<> ��@ResponseBodyЧ��һ��
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
	 * ���ΪJSON��ʽ�����ݵķ�ʽ 1��@ResponseBody�������ǰѷ���ֱֵ��д��HTTP response body��
	 * 
	 * @param session
	 * @return
	 * @throws ServletRequestBindingException
	 */
	@RequestMapping(value = "/test/login9", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView commonReturnType(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		session.setAttribute("userName", "ʹ��ResponseBody�����");
		ModelMap modelMap = new ModelMap();
		modelMap.put("mapKey", "mapValue");
		modelMap.addAttribute("attributeKey", "attributeValue");
		mav.addObject("model", "���");
		mav.addObject("modelMap", modelMap);
		mav.setViewName("hello2.jsp");
		return mav;
	}

}
