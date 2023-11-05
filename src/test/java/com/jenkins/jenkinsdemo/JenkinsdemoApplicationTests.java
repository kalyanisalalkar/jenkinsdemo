package com.jenkins.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsdemoApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		assertEquals(true,true);
	}

}
