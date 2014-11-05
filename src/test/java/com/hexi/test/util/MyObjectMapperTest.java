package com.hexi.test.util;

import java.io.IOException;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hexi.model.Person;
import com.hexi.util.MyObjectMapper;

public class MyObjectMapperTest {

	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void beforeClass() {
		objectMapper = new MyObjectMapper();
	}

	@Test
	public void test_unknown_properties() throws JsonParseException, JsonMappingException, IOException {
		String json = "[{\"name\":\"javen\"},{\"name\":\"bobo\",\"sex\":\"male\"}]";
		List<Person> persons = objectMapper.readValue(json, new TypeReference<List<Person>>() {
		});
		Assertions.assertThat(persons).hasSize(2);
	}

	@Test
	public void test_can_ignore() throws JsonParseException, JsonMappingException, IOException {
		String json = "[{\"name\":\"javen\", \"age\":11},{\"name\":\"bobo\",\"sex\":\"male\"}]";
		List<Person> persons = objectMapper.readValue(json, new TypeReference<List<Person>>() {
		});
		Assertions.assertThat(persons).hasSize(2);
	}
}
