package com.joyveb.ctrl;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import com.joyveb.bean.TreeUser;

/**   
 * @Title: TreeUserConverter.java 
 * @Package com.joyveb.ctrl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 杨其桔
 * @date 2013-4-13 下午11:01:49 
 * @version V1.0   
 */
public class TreeUserConverter implements WebBindingInitializer {

	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		binder.registerCustomEditor(TreeUser.class, new TreeUserEditor());
	}

}

