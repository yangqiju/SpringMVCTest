package com.joyveb.ctrl;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.joyveb.bean.TreeUser;

/**   
 * @Title: TreeUserEditor.java 
 * @Package com.joyveb.ctrl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 杨其桔
 * @date 2013-4-13 下午11:07:46 
 * @version V1.0   
 */
public class TreeUserEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		JSONArray jsonArray = JSONArray.fromObject(text);
		JSONObject jsonObj = jsonArray.getJSONObject(0);
		if(jsonObj==null){
			return;
		}
		TreeUser tu = new TreeUser();
		tu.setUserName(jsonObj.getString("userName"));
		tu.setPassword(jsonObj.getString("password"));
		tu.setUsers(dg(jsonObj.getString("users")));
		tu.setDate(null);
		//[{"date":null,"password":"1234","userName":"username","users":[{"date":null,"password":"123","userName":"username","users":[]}]}]
		this.setValue(tu);
	}
	private List<TreeUser> dg(String users){
		JSONArray jsonArray = JSONArray.fromObject(users);
		List<TreeUser> list = new ArrayList<TreeUser>();
		for(int i = 0;i<jsonArray.size();i++){
			TreeUser tu = new TreeUser();
			JSONObject obj = jsonArray.getJSONObject(i);
			tu.setDate(null);
			tu.setPassword(obj.getString("password"));
			tu.setUserName(obj.getString("userName"));
			tu.setUsers(dg(obj.getString("users")));
			list.add(tu);
		}
		return list;
	}
}

