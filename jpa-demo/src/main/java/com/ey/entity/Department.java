package com.ey.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	@Column(name = "dept_no")
	private int depNo;
	@Column(name = "dname", length = 20)
	private String deptName;
	
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Employee> emps;

	public Department() {
	}

	public Department(int depNo, String deptName) {
		this.depNo = depNo;
		this.deptName = deptName;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [depNo=" + depNo + ", deptName=" + deptName + "]";
	}
	
	
}
