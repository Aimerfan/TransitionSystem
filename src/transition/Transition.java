package transition;

import view.View;
import model.*;
import java.util.*;

/**
 * 
 */

public abstract class Transition extends Observable{
	
	private View window;
	private Borrower borrower;
	private Lender lender;

    public Transition(Lender l, Borrower b) {
    	this.lender = l;
    	this.borrower = b;
    	this.window = new View();
    }
    
    public void flow() {
    	certification();
    	while(true) {
    		rent(new Goods());
    		break;
    	}
    	confirmation();
    	finish();
    }
    
    protected boolean certification() {
    	return true;
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