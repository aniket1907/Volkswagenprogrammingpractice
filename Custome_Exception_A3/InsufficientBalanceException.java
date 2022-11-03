package Custome_Exception_A3;

public class InsufficientBalanceException extends Exception 
{
	private double currBal;
	private double withdrawAmt;
	private int accountNo;
	public InsufficientBalanceException(double currBal, double withdrawAmt, int accountNo) 
	{
		super();
		this.currBal = currBal;
		this.withdrawAmt = withdrawAmt;
		this.accountNo = accountNo;
	}
	
	@Override
	public String toString() {
		return "InsufficientBalancException [currBal=" + currBal + ", withdrawAmt=" + withdrawAmt + ", accountNo="
				+ accountNo + "]";
	}

	
}
