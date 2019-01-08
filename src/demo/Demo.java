package demo;

import data.BorrowerData;
import data.LenderData;
import model.Borrower;
import model.Lender;

import java.util.ArrayList;

import data.Book;

public class Demo {

	public static void main(String[] args) {
		Borrower borrower = new Borrower(new BorrowerData("John", "L123456789"));
		Borrower borrower1 = new Borrower(new BorrowerData("John", "L123456789"));
		
		System.out.println(borrower.equals(borrower1));
		
		Book book = new Book("可怕的家锪","恐懼");
		Book book1 = new Book("開心的家園","開勳");
		
		ArrayList<Book> books = new ArrayList<Book> ();
		books.add(book);
		books.add(book1);
		
		Lender lender = new Lender(new LenderData("John", "L123456789"), books );
		System.out.println(lender.toString());
		

	}

}
