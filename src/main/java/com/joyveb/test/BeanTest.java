package com.joyveb.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import com.joyveb.bean.TreeUser;

/**   
 * @Title: BeanTest.java 
 * @Package com.joyveb.test 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 杨其桔
 * @date 2013-4-13 下午10:44:33 
 * @version V1.0   
 */
public class BeanTest {

	public static void main(String[] args) {
		TreeUser tu = new TreeUser();
		//tu.setDate(new Date());
		tu.setPassword("123");
		tu.setUserName("username");
		tu.setUsers(null);
		List<TreeUser> list = new ArrayList<TreeUser>();
		list.add(tu);
		TreeUser t = new TreeUser();
		//t.setDate(new Date());
		t.setPassword("1234");
		t.setUserName("username");
		t.setUsers(list);
		System.out.println(JSONArray.fromObject(t).toString());
	}
}

