package etu;

import java.sql.Date;

public class Person {
	private int age;
	private String name;
	private Date date;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", date=" + date + "]";
	}
}
