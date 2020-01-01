package com.xuda.senior1.week1.entity;

public class Goodskind {
	Integer id;
	String name;

	public Goodskind() {
		// TODO Auto-generated constructor stub
	}

	public Goodskind(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Goodskind [id=" + id + ", name=" + name + "]";
	}

}
