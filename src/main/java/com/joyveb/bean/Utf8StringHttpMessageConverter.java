package com.joyveb.bean;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.FileCopyUtils;

/**
 * 
 * 项目名称：SpringMVCTest 类名称：Utf8StringHttpMessageConverter
 * 
 * @Company: 北京畅享互联有限公司
 * @Copyright: Copyright (c) 2012
 * @Author： 杨其桔 创建时间：2013-1-18 上午5:24:16 修改备注：
 * @version
 * 
 */
public class Utf8StringHttpMessageConverter extends StringHttpMessageConverter {

	private static final MediaType utf8 = new MediaType("text", "plain",
			Charset.forName("UTF-8"));

	@Override
	protected MediaType getDefaultContentType(String dumy) {
		return utf8;
	}

}
