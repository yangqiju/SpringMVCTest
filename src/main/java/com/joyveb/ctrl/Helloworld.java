package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class Helloworld {

	// @RequestMapping(method=RequestMethod.GET, value = "/view")
	@RequestMapping
	public ModelAndView helloworld() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public ModelAndView test1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	@RequestMapping(params = "method=1")
	public ModelAndView test2(String username, String password) {
		// 依据params的参数method的值来区分不同的调用方法
		// 可以指定页面请求方式的类型，默认为get请求
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "method=1  " + username);
		mv.setViewName("hello.jsp");
		return mv;
	}

	@RequestMapping(params = "method=2")
	public ModelAndView test3() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "method=2");
		mv.setViewName("hello.jsp");
		return mv;
	}
}
