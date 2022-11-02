package Custome_Exception_A1;


public class Accoount 
{
	private String accountHolderName;
	private int accNo;
	private double balance;

	public Accoount(String accountHolderName, int accNo, double balance) 
	{
		super();
		this.accountHolderName = accountHolderName;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccountHolderName() 
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}

	public int getAccNo()
	{
		return accNo;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void deposit(double amount) 
	{
		this.balance += amount;
	}
	
	public double withdraw(double amount) throws InsufficientBalanceException, ZeroBalanceException
	{
		if (amount <= balance) 
		{
			this.balance -= amount;	
			if(balance == 0)
			{
				throw new ZeroBalanceException(this.balance, amount, this.accNo);
			}
			System.out.println("Current balance is: " + this.balance + " after withdrawing amount: " + amount);
		} else 
		{			
			throw new InsufficientBalanceException(this.balance, amount, this.accNo);
		}
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
		
}
