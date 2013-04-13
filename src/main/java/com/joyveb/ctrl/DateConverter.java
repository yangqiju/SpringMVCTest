package com.joyveb.ctrl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import com.joyveb.bean.TreeUser;

/**
 * 
 * spring3 mvc �����ڴ���[ǰ̨-��̨]bug: org.springframework.validation.BindException
 * �Ľ����ʽ.����xml������
 * 
 * @author zhanglei
 * 
 */
public class DateConverter implements WebBindingInitializer {

	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// System.out.println("DateConverter implements WebBindingInitializer");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		binder.registerCustomEditor(TreeUser.class, new TreeUserEditor());
	}

}
