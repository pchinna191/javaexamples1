package com.test.bean;

public class Student {
	private int sno;
	private String sname;
	private String course;
	private int fee;
	private Address address;
	private Course courseObj;
	
	public Course getCourseObj() {
		return courseObj;
	}
	public void setCourseObj(Course courseObj) {
		this.courseObj = courseObj;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", fee=" + fee + "]";
	}
	public Student(int sno, String sname, String course, int fee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	public Student() {
		super();
	}
}
