package model;

import java.util.ArrayList;

import data.LenderData;
import data.Book;


public class Lender implements Goods{

	private LenderData data;
	private ArrayList<Book> books;
    
	public LenderData getData() {
		return data;
	}
	public void setData(LenderData data) {
		this.data = data;
	}

	public Lender(LenderData data, ArrayList<Book> books) {
		setData(data);
    }

}
