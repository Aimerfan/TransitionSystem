
import java.util.*;

/**
 * 
 */
public abstract class Transition extends Observable{

    public Transition() {
    }

    private Borrower data;
    protected void certification() {
    	
    }

   
    protected void rent() {
    	
    }

   
    protected void confirmation() {

    }

    protected void finish() {
    }

    
    public void flow() {
    	certification();
    	rent();
    	confirmation();
    	finish();
    }

}