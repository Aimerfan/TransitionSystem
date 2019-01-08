package data;

import model.Goods;

public class Vehicle extends Goods{
	private String name;
	private String type;
	
	public Vehicle(String name, String type) {
		super();
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
		return "Name: " + name + " Type: " + type;
		
	}
}
