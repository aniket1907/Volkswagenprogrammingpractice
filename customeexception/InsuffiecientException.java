package customeexception;

public class InsuffiecientException extends Exception {
	
	private double currBal;
	private double withAmt;
	private int acctno;
	
	
	public InsuffiecientException(double currBal, double withAmt, int acctno) {
		super();
		this.currBal = currBal;
		this.withAmt = withAmt;
		this.acctno = acctno;
	}


	@Override
	public String toString() {
	
		return "InsufficientBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
	}
	
	
	
	
	
	

}

