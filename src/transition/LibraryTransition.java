package transition;

import java.util.ArrayList;

import data.*;
import model.*;

public class LibraryTransition extends Transition {

  public LibraryTransition(Lender l, Borrower b) {
    super(l, b);
  }
  
  protected boolean certification(Borrower b) {
  	return this.borrower.equals(b);
  }
  
  protected boolean rent(Goods subject) {
  	if(subject.getStatus() == Goods.AVAILABLE) {
  		subject.setStatus(Goods.BORROWED);
  		return true;
  	}
  	else {
  		return false;
  	}
  }
  
  protected boolean confirmation(Goods rent) {
  	return this.window.confirmationView(rent.getName());
  }
  
  protected void finish() {
  	window.finishView();
  }

}