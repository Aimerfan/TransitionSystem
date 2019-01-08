package model;

public class Goods {
	
	public static final int AVAILABLE = 0;
	public static final int BORROWED = 1;
	public static final int UNAVAILABLE = 2;
	
	private int status;
	
	public Goods(){
		this.status = 0;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
