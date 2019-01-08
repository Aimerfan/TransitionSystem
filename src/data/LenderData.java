package data;

public class LenderData {

	private String name;
	private String id;
	
	public LenderData(String name, String id) {
		setName(name);
		setId(id);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return "Name: "+name+", Id: "+ id;
	}


	
	
}
