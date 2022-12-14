package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;

@SpringBootTest
class DemoProjectApplicationTests {
	
	@Autowired
	private Active active;

	@Test
	public void getBirdTests() {
		Bird bird = active.fly("NeNe", 20);
		active.print(bird);
	}

}
