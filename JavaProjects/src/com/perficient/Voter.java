package com.perficient;

import java.util.Comparator;
import java.util.Date;

public class Voter implements Comparator{

	private int id;
	private String name;
	private Date DOB;
	private int age;
	private String address;
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Voter() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Voter(int id, String name, Date dOB, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", DOB=" + DOB + ", age=" + age + ", address=" + address + "]";
	}
}
