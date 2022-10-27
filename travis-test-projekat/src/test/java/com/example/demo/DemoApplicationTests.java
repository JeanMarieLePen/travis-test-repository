package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class DemoApplicationTests {
	
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	
	private MockMvc mockMvc;
	
	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testWelcone() throws Exception {
		MvcResult res = mockMvc.perform(get("/hello")).andExpect(status().isOk()).andReturn();
	}
	
	@Test
	public void primerTest() {
	    assertEquals(1, 5);
	}
}
