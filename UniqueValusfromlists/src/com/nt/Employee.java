package com.nt;

import java.util.List;

public class Employee {

	
	public int empid;
	public String empName;
	public double empsal;
	public String empadd;
	public String empstate;
	public String empEmailid;
	public List<Long> empphonenumbers;
	public Employee() {
		super();        
	}
	public Employee(int empid, String empName, double empsal, String empadd, String empstate, String empEmailid,
			List<Long> empphonenumbers) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsal = empsal;
		this.empadd = empadd;
		this.empstate = empstate;
		this.empEmailid = empEmailid;
		this.empphonenumbers = empphonenumbers;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public String getEmpstate() {
		return empstate;
	}
	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}
	public String getEmpEmailid() {
		return empEmailid;
	}
	public void setEmpEmailid(String empEmailid) {
		this.empEmailid = empEmailid;
	}
	public List<Long> getEmpphonenumbers() {
		return empphonenumbers;
	}
	public void setEmpphonenumbers(List<Long> empphonenumbers) {
		this.empphonenumbers = empphonenumbers;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsal=" + empsal + ", empadd=" + empadd
				+ ", empstate=" + empstate + ", empEmailid=" + empEmailid + ", empphonenumbers=" + empphonenumbers
				+ "]";
	}
	
	
	
	
}
