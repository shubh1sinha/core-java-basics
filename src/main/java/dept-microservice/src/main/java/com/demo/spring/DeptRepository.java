package com.demo.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.spring.entity.Dept;
import com.demo.spring.entity.Emp;



public interface DeptRepository extends JpaRepository<Dept, Integer>{
	
//	@Query(value = "select e from Emp e join Dept d where dno=? ")
//	public List<Emp> findAllEmpByDept(int dno);
}
