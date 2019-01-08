package model;

public interface Goods {
	
	public static final int AVAILABLE = 0;
	public static final int BORROWED = 1;
	public static final int UNAVAILABLE = 2;
	
	public void setStatus(int status);
	
}
