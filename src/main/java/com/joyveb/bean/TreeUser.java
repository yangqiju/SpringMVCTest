package com.joyveb.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class TreeUser implements Serializable {
	private static final long serialVersionUID = -861674811808247119L;
	private String userName;
	private String password;
	private List<TreeUser> users;
	private Date date;
}
