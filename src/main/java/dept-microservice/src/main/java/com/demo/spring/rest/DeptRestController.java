package com.demo.spring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.DeptRepository;
import com.demo.spring.entity.Dept;
import com.demo.spring.entity.Emp;
import com.demo.spring.util.Message;

@RestController
public class DeptRestController {
	
	@Autowired
	private DeptRepository repo; 
	
	@GetMapping(value="/dept/{dno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findEmpById(@PathVariable("dno") int dno) {
		
		Optional<Dept> deptOp = repo.findById(dno);
		if(deptOp.isPresent()) {
			return ResponseEntity.ok(deptOp.get());
		}
		else {
			return ResponseEntity.status(404).body("{\"status\":\"Dept not found.\"}");
		}
	}
	
	@GetMapping(value="/dept", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dept>> findAllDept() {
		
			return ResponseEntity.ok(repo.findAll());
		}
	

	
	
}
