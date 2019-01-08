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
    	certification(new Borrower(new BorrowerData(cert[0], cert[1])));
    	while(true) {
    		// rent();
    		break;
    	}
    	confirmation();
    	finish();
    }
    
    protected boolean certification(Borrower b) {
    	return this.equals(b);
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