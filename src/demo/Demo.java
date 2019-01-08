package demo;

import java.util.ArrayList;

import data.Book;
import data.BorrowerData;
import data.LenderData;
import model.Borrower;
import model.Goods;
import model.Lender;
import transition.LibraryTransition;

public class Demo {

  public static void main(String[] args) {
    ArrayList<Borrower> bowrdata = new ArrayList<Borrower>();
    bowrdata.add(new Borrower(new BorrowerData("John", "L123456789")));
    bowrdata.add(new Borrower(new BorrowerData("Nicky", "N987654321")));
    
    ArrayList<Goods> books = new ArrayList<Goods>();
    books.add(new Book("可怕的家伙","恐懼"));
    books.add(new Book("開心的家園","開勳"));
    
    Lender lender = new Lender(new LenderData("John", "L123456789"), books);
    Borrower borrower = bowrdata.get(0);
    LibraryTransition t = new LibraryTransition(lender, borrower);
    
    t.flow();
  }

}
