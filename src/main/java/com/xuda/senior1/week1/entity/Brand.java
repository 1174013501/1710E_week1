package com.xuda.senior1.week1.entity;
// devdevdevdevdev111111
public class Brand {
	Integer id;
	String name;

	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(Integer id, String name) {
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
		return "Brand [id=" + id + ", name=" + name + "]";
	}

}
