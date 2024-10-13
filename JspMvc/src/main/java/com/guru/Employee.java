package com.guru;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empid;
	private String empname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int validate()
	{
		if(empname.equals("admin") && empid==0) return 1;
		return 0;
			
	}
}
