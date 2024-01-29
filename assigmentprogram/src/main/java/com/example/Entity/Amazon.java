package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Amazon {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String category;
	private double price;
	public Amazon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amazon(String pname, String category, double price) {
		super();
		this.pname = pname;
		this.category = category;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Amazon [pid=" + pid + ", pname=" + pname + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
