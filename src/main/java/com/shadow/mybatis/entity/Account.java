package com.shadow.mybatis.entity;

/**
 * @author shadow
 * @create 2020-08-16
 * @description
 */
public class Account {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
