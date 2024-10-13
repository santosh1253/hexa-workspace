package com.guru.springboot.controller;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Course {
	
    @Column
	private String name;
	@Id
	private int rollno;
    @Column
	private String loc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Course(String name, int rollno, String loc) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.loc = loc;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", rollno=" + rollno + ", loc=" + loc + "]";
	}
	
}
