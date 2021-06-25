package com.example.demo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@Slf4j
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	JdbcTemplate jdbctemplate;
	@Test
	void contextLoads() {
		long along = jdbctemplate.queryForObject("select count(*) from test", Long.class);
		log.info("总数{}", along);
	}
}
