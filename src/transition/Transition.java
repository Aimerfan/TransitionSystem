package transition;

import data.*;
import view.View;
import model.*;
import java.util.*;

/**
 * 
 */

public abstract class Transition {
	
	protected View window;
	protected Borrower borrower;
	protected Lender lender;

    public Transition(Lender l, Borrower b) {
    	this.lender = l;
    	this.borrower = b;
    	this.window = new View();
    }
    
    public final void flow() {
    	String[] cert = window.certificationView();
    	if(!certification(new Borrower(new BorrowerData(cert[0], cert[1])))) {
    		window.dead();
    	}
    	System.out.println("login successes.");
    	
    	Goods rent = window.rentView(this.lender.getGoods());
    	if(!this.rent(rent)) {
    		window.dead();
    	}
    	System.out.println("rent successes.");
    	
    	if(!this.confirmation(rent)) {
    		window.dead();
    	}
    	System.out.println("rent confirm.");
    	
    	finish();
    }
    
    protected abstract boolean certification(Borrower b);
    protected abstract boolean rent(Goods subject);
    protected abstract boolean confirmation(Goods rent);
    protected abstract void finish();

}