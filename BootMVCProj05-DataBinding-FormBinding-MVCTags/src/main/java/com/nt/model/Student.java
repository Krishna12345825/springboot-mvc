package com.nt.model;

import lombok.Data;

@Data
public class Student {
	private Integer sno;
	private String sname;
	private String sadd="hyd";
	private Float avg;
	
	public Student() {
		System.out.println("Student:: 0-param consturctor");
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public Float getAvg() {
		return avg;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}
	
	
	

}
