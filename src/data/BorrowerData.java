package data;

public class BorrowerData {
  private String name;
  private String id;

  public BorrowerData(String name, String id) {
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

  public boolean equals(BorrowerData data) {
    return id.equals(data.id) && name.equals(data.name);
  }

  public String toString() {

    return "Name: " + this.name + ", id:" + this.id;
  }

}
