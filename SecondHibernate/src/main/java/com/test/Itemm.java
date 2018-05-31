package com.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Itemm")
public class Itemm {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iId;
	private String Iname;
	private float price;
	
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [iId=" + iId + ", Iname=" + Iname + ", price=" + price + "]";
	}
	public Itemm(int iId, String iname, float price) {
		super();
		this.iId = iId;
		Iname = iname;
		this.price = price;
	}
	public Itemm() {
		super();
	}

}
