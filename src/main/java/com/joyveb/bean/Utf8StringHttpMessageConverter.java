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
 * ��Ŀ���ƣ�SpringMVCTest �����ƣ�Utf8StringHttpMessageConverter
 * 
 * @Company: �������������޹�˾
 * @Copyright: Copyright (c) 2012
 * @Author�� ����� ����ʱ�䣺2013-1-18 ����5:24:16 �޸ı�ע��
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
