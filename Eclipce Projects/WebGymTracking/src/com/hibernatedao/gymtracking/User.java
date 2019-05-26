package com.hibernatedao.gymtracking;

public class User {
	
	private Long id;
	private String name;
	private String password;
	private String sex;
	private int weight;
	private int height;
	
public User(Long id, String name, String password, String sex, int weight, int height){
		
	this.id = id;
	this.name = name;
	this.password = password;
	this.sex = sex;
	this.weight = weight;
	this.height = height;
	
	}
	
	public User(){
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "[" + id + "," + name + "," + password + "," + sex + 
				"," + weight + "," + height;
		
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
}
