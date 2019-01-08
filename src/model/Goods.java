package model;

public class Goods {

  public static final int AVAILABLE = 0;
  public static final int BORROWED = 1;
  public static final int UNAVAILABLE = 2;

  private String name;
  private String type;
  private int status;

  public Goods(String name, String type) {
    this.status = 0;
    setName(name);
    setType(type);
  }

  public void setStatus(int status) {
    this.status = status;
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
