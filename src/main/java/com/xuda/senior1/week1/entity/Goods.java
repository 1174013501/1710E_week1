package com.xuda.senior1.week1.entity;

public class Goods {
	Integer id;
	String name;
	String ename;
	Double size;
	Integer price;
	Integer num;
	String tab;
	String pic;
	Integer bid;
	Integer tid;
	String bname;
	String tname;

	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(Integer id, String name, String ename, Double size, Integer price, Integer num, String tab, String pic,
			Integer bid, Integer tid, String bname, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.num = num;
		this.tab = tab;
		this.pic = pic;
		this.bid = bid;
		this.tid = tid;
		this.bname = bname;
		this.tname = tname;
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

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", ename=" + ename + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", tab=" + tab + ", pic=" + pic + ", bid=" + bid + ", tid=" + tid + ", bname="
				+ bname + ", tname=" + tname + "]";
	}

}
