package com.hexi.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2635430542612712184L;
	
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

}
