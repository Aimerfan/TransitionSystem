package data;

public class BorrowerData {
	private String Name;
	private String id;
	
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
		return id;
	}


	public void setId(String id) {
		id = id;
	}
	
//	public boolean equals(BorrowerData data) {
//		data.id.equals(id);
//	}
	
	
}
