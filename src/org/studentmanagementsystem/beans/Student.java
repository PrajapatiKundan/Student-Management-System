package org.studentmanagementsystem.beans;

public class Student {
	private int rollNumer;
	private String name;
	private String fatherName;
	private String city;
	private String phone;
	private String course;

	public int getRollNumer() {
		return rollNumer;
	}

	public void setRollNumer(int rollNumer) {
		this.rollNumer = rollNumer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
