package com.liferay.salestaxes.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingControllersTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldAccessItemsRoute() throws Exception {
		this.mockMvc.perform(get("/items")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldAccessCartRoute() throws Exception {
		this.mockMvc.perform(get("/cart")).andExpect(status().isOk());
	}
}
