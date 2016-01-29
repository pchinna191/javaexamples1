package com.test.pojo;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private Integer id;
	private String name;
	private String couse;
	private BigDecimal fee;

	public Integer getid() {
		return id;
	}

	public void setSno(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCouse() {
		return couse;
	}

	public void setCouse(String couse) {
		this.couse = couse;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public Student(Integer id, String name, String couse, BigDecimal fee) { // Row
		this.id = id;
		this.name = name;
		this.couse = couse;
		this.fee = fee;
	}

	public Student(Integer id) { //Primary Key
		this.id = id;
	}

	public Student() {//Empty
	}

	@Override
	public String toString() {
		return "Student [sno=" + id + ", name=" + name + ", couse="
				+ couse + ", fee=" + fee + "]";
	}

}
