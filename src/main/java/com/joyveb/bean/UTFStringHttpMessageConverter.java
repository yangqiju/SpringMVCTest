/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.joyveb.bean;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.FileCopyUtils;

/**
 * Implementation of {@link HttpMessageConverter} that can read and write
 * strings.
 * 
 * <p>
 * By default, this converter supports all media types (
 * <code>&#42;&#47;&#42;</code>), and writes with a {@code Content-Type} of
 * {@code text/plain}. This can be overridden by setting the
 * {@link #setSupportedMediaTypes(java.util.List) supportedMediaTypes} property.
 * 
 * @author Arjen Poutsma
 * @since 3.0
 */
public class UTFStringHttpMessageConverter extends StringHttpMessageConverter {

	public UTFStringHttpMessageConverter(Charset defaultCharset) {  
		       List<MediaType> mediaTypeList = new ArrayList<MediaType>();  
		mediaTypeList.add(new MediaType("text", "plain", defaultCharset));  
	        mediaTypeList.add(MediaType.ALL);  
		        super.setSupportedMediaTypes(mediaTypeList);  
		    }}
