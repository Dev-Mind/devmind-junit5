package com.devmind.junit5;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit5ApplicationTests {

	@Autowired
	private Junit5ApplicationProperties properties;

	@Test
	public void contextLoads() {
		Assertions.assertThat(properties.getName()).isEqualTo("Dev-Mind");
	}

}
