package model;

import java.util.ArrayList;

import data.LenderData;
import data.Book;


public class Lender {

	private LenderData data;
	private ArrayList<Book> books;
    
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public LenderData getData() {
		return data;
	}
	public void setData(LenderData data) {
		this.data = data;
	}

	public Lender(LenderData data, ArrayList<Book> books) {
		setData(data);
		setBooks(books);
    }
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(Book b: books) {
			s.append("\n");
			s.append(b.toString());
		}
		return data.toString()+"\nbooks: "+ s.toString();
	}

}
