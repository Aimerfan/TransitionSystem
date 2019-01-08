package transition;

import model.*;
import java.util.*;

/**
 * 
 */
public abstract class Transition extends Observable{
	
	private Borrower borrower;
	private Lender lender;

    public Transition(Lender l, Borrower b) {
    	this.lender = l;
    	this.borrower = b;
    }
    
    public void flow() {
    	//certification();
    	//rent();
    	confirmation();
    	finish();
    }
    
    protected boolean certification(Borrower b) {
    	return true;
    }
    
    protected boolean rent(Goods subject) {
    	
    	return true;
    }
    
    protected void confirmation() {
    	
    }
    
    protected void finish() {
    	
    }

}