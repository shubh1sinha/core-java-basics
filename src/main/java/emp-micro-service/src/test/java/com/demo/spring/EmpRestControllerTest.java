package com.demo.spring;


import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.spring.entity.Emp;
import com.demo.spring.rest.EmpRestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class EmpRestControllerTest {

	@Autowired
	MockMvc mvc;
	
	@MockBean
	EmpRepository repo;
	
	@InjectMocks
	EmpRestController emp;
	
//	@Autowired
//	RestTemplate rt;
	
	@Test
	public void testFindById() throws Exception{
		Mockito.when(repo.findById(104)).thenReturn(Optional.of(new Emp(104,"Ajay","Patna",12)));
		 mvc.perform(get("/emp/104"))
//		 .andDo(print())
		 .andExpect(status().isOk())
		 .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andDo(print())
		 .andExpect(jsonPath("$.name").value("Ajay"));
		
	}
	
	@Test
	public void testFindAllEmp() throws Exception{
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(104,"Ajay","Patna",12));
		
		Mockito.when(repo.findAll()).thenReturn(emps);
		mvc.perform(get("/emp"))
//		.andDo(print())
		.andExpectAll(status().isOk())
		 .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andDo(print())
		 .andExpect(jsonPath("$.[0].name").value("Ajay"));
	}
	
	@Test
	public void testAddEmp() throws Exception{
		Emp emps = new Emp(104,"Ajay","Patna",12);
		when(repo.save(emps)).thenReturn(emps);
		
		ObjectMapper om = new ObjectMapper();
		String empJson = om.writeValueAsString(emps);
		mvc.perform(post("/emp").contentType(MediaType.APPLICATION_JSON).content(empJson))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON));
		
	}
	
	
	
}
