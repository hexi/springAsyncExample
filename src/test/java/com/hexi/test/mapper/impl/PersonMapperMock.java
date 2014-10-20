package com.hexi.test.mapper.impl;

import java.util.List;

import com.google.common.collect.Lists;
import com.hexi.dao.PersonMapper;
import com.hexi.model.Person;

public class PersonMapperMock implements PersonMapper{

	@Override
	public List<Person> getPersons() {
		return Lists.newArrayList(new Person("javen", "mail"), new Person("litao", "mail"));
	}

}
