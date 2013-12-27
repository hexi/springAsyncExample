package com.hexi;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

@RestController
public class Index {

	@RequestMapping(value="index", method=RequestMethod.GET)
	public Callable<List<Person>> index(){
		return new Callable<List<Person>>() {

			@Override
			public List<Person> call() throws Exception {
				List<Person> persons = Lists.newArrayList(new Person("javen", "male"), new Person("bruce", "female"));
				return persons;
			}
		};
	}
}
