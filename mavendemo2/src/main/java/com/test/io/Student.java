package com.test.io;
import java.lang.Comparable;


public class Student implements Comparable<Student> {
	private int eno;
	private String ename;
	private double fee;
	private String course;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student() {
		
	}
	public Student(int eno, String ename, double fee,String course) {
		
		this.eno = eno;
		this.ename = ename;
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return " [" + eno + "," + ename + "," + fee +","+course+ "]";
		
	}
	
	@Override
/*	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (Double.doubleToLongBits(fee) != Double.doubleToLongBits(other.fee))
			return false;
		return true;
	}*/
	
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student stu=(Student)obj;
			if((this.getEno()==stu.getEno())){
				return true;
		}
		return false;
		}
		return false;
		}
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		long temp;
		temp = Double.doubleToLongBits(fee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
		
	@Override
	public int compareTo(Student studentObj) { // default Sort Logic
		if(this.eno < studentObj.getEno()){
			return -1; // <
		}else if (this.eno > studentObj.getEno()){
			return 1; // >
		}else
			return  0; // ==
	}
		
		
	}

