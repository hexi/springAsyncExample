package com.hexi.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	@JsonCreator
	public Person(@JsonProperty("name") String name, @JsonProperty("sex") String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

}
