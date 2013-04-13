package com.joyveb.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = -8257960905599563364L;
	private String userName;
	private String password;
	private Date date;
}
