
import java.util.*;

/**
 * 
 */
public class Borrower {
	private Data data;
    
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	public Borrower(Data data) {
		setData(data);
    }

}