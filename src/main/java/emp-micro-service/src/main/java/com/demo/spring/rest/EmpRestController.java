package com.demo.spring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.EmpRepository;
import com.demo.spring.entity.Emp;
import com.demo.spring.exceptions.EmpNotFoundException;

@RestController
public class EmpRestController {
	
	@Autowired
	EmpRepository repo; 
	
	@GetMapping(value="/emp/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findEmpById(@PathVariable("id") int id) {
		
		Optional<Emp> empOp = repo.findById(id);
		if(empOp.isPresent()) {
			return ResponseEntity.ok(empOp.get());
		}
		else {
			return ResponseEntity.status(404).body("{\"status\":\"Emp with id not found.\"}");
		}

	}
	
	@GetMapping(value="/emp/salary/{r1}/{r2}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findEmpBySalaryRange(@PathVariable("r1") double r1, @PathVariable("r2") double r2) {
		return ResponseEntity.ok(repo.findAllBySalaryRange(r1, r2));
	}
	
	@GetMapping(value="/emp/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findEmpByName(@PathVariable("name") String name) {
		try {
		return ResponseEntity.ok(repo.findAllByName(name));
		}catch(RuntimeException ex) {
			return ResponseEntity.status(404).body("Emp Not Found");
		}
		
	}
	

	
	@DeleteMapping(value="/emp/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteEmpById(@PathVariable("id") int id) {
		repo.deleteById(id);
		return ResponseEntity.ok("{\"status\":\"Emp Deleted Successfully.\"}");
	}
	
	@PostMapping(value="/emp", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addEmp(@RequestBody Emp emp) {
		if(repo.existsById(emp.getEmpId())) {
			return ResponseEntity.status(404).body("{\"status\":\"Emp with id found.\"}");
		}
		else {
			repo.save(emp);
		}
		return ResponseEntity.ok("{\"status\":\"Emp Saved Successfully.\"}");
		
	}
	
	
	@PutMapping(value="/emp", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> UpdateEmp(@RequestBody Emp emp) {
		if(repo.existsById(emp.getEmpId())) {
			repo.save(emp);
		}
		else {
			return ResponseEntity.status(404).body("{\"status\":\"Emp with id found.\"}");
		}
		 
		return ResponseEntity.ok("{\"status\":\"Emp Updated Successfully.\"}");
	}
	
	
	@GetMapping(value="/emp", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Emp> findAllEmp() {
			return repo.findAll();
	}

	@GetMapping(value="/emp/list/{dno}")
	public List<Emp> getAllByDno(@PathVariable("dno") int dno){
		return repo.findAllByDeptNo(dno);
	}
	
	
		
	

}
