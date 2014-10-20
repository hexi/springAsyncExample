package com.hexi.test.mapper;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hexi.dao.PersonMapper;
import com.hexi.model.Person;
import com.hexi.test.util.TestConfiguration;

public class PersonMapperTest extends TestConfiguration{
	@Autowired
	PersonMapper personMapper;

	@Test
	public final void test() {
		List<Person> persons = personMapper.getPersons();
		Assertions.assertThat(persons).isNotEmpty();
		Assertions.assertThat(persons).hasSize(2);
	}

}
