package com.joyveb.ctrl;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import com.joyveb.bean.TreeUser;

/**   
 * @Title: TreeUserConverter.java 
 * @Package com.joyveb.ctrl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author �����
 * @date 2013-4-13 ����11:01:49 
 * @version V1.0   
 */
public class TreeUserConverter implements WebBindingInitializer {

	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		binder.registerCustomEditor(TreeUser.class, new TreeUserEditor());
	}

}

