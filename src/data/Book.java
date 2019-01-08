package data;

import model.Goods;

public class Book implements Goods{
	private String name;
	private String type;
	
	public Book(String name, String type) {
		setName(name);
		setType(type);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Name: "+ name +" Type: "+type;
		
	}
	
}
