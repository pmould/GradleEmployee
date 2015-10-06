package com.creationmachine.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Department")
public class Department {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="DEPT_ID", nullable=false)
	private int id;
	
	@NotNull
	@Size(min=1, max=40)
	@Column(name="DEPT_NAME", nullable=false)
	private String deptName;
	
	@NotNull
	@Size(min=1, max=40)
	@Column(name="DEPT_HEAD", nullable=false)
	private String deptHead;	

	@OneToMany(mappedBy="department")
	private Set<Employee> employees;
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployee(Set<Employee> employees) {
		this.employees = employees;
	}
}
