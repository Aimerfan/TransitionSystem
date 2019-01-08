package data;

public class BorrowerData {
	private String Name;
	private String Id;
	
	public BorrowerData(String name, String id) {
		setName(name);
		setId(id);
	}

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	
	
}
