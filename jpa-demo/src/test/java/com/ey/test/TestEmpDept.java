package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.dao.EmpDeptDao;
import com.ey.entity.Department;
import com.ey.entity.Employee;

public class TestEmpDept {

	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpName("vasta");
		emp.setSalary(4500);
		dao.addEmp(emp, 20);
	}
	
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDepNo(80);
		dept.setDeptName("HR");
		dao.addDept(dept);
	}
	
	@Test
	public void testFindDept() {
		Department dept = dao.findDept(70);
		System.out.println(dept);
		dept.getEmps().forEach(System.out::println);
	}
	
	@Test
	public void testRemove() {
		dao.removeDept(20);
	}
	
	@Test
	public void testList() {
		List<Employee> employees = dao.list();
		assertEquals(4, employees.size());
	}
}
