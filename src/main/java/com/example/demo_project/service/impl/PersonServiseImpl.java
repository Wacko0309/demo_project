package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;
@Service
public class PersonServiseImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person per = new Person();
		per.setAge(25);
		per.setCity("JP");
		per.setId(id);
		per.setName("NeNe");
		return per;
	}
	
	public void printPersonAttributes(Person person) {
		System.out.println(person.getAge());
		System.out.println(person.getCity());
		System.out.println(person.getId());
		System.out.println(person.getName());

	}

}
