package transition;

import java.util.*;

import model.*;

/**
 * 
 */
public class VehichesTransition extends Transition {
	
    public VehichesTransition(Lender l, Borrower b) {
    	super(l, b);
    }

	@Override
	protected boolean certification(Borrower b) {
		return false;
	}

	@Override
	protected boolean rent(Goods subject) {
		return false;
	}

	@Override
	protected boolean confirmation(Goods rent) {
		return false;
	}

	@Override
	protected void finish() {
		
	}
    
}