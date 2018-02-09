package com.suqc.ws.pojo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
public class Book implements Serializable{
	private String id;
	private String name;
	private String author;
	private Double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
