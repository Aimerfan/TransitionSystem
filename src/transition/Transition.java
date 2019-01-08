package transition;

import data.*;
import view.View;
import model.*;
import java.util.*;

/**
 * 
 */

public abstract class Transition {
	
	private View window;
	private Borrower borrower;
	private Lender lender;

    public Transition(Lender l, Borrower b) {
    	this.lender = l;
    	this.borrower = b;
    	this.window = new View();
    }
    
    public void flow() {
    	String[] cert = window.certificationView();
    	if(!certification(new Borrower(new BorrowerData(cert[0], cert[1])))) {
    		window.dead();
    		return;
    	}
    	System.out.println("login successes.");
    	
    	Goods rent = window.rentView(this.lender.getGoods());
    	if(!this.rent(rent)) {
    		window.dead();
    		return;
    	}
    	System.out.println("rent successes.");
    	
    	// confirmation();
    	finish();
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
    
    protected void confirmation() {
    	
    }
    
    protected void finish() {
    	
    }

}