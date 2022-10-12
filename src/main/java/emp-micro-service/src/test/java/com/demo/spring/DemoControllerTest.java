package com.demo.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.spring.rest.DemoRestController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class DemoControllerTest {
	
	@Autowired
	MockMvc mvc;
	
	@Mock
	DemoRestController dc;
	
	@Test
	public void testSetUp() {
		Assertions.assertEquals("Hello", "Hello");
	}
	
	@Test
	public void shouldReturnMessage() throws Exception{
		mvc.perform(get("/greet"))
		.andDo(print())
		.andExpect(status().isOk());
		
	}
	

}
