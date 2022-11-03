package collections_A4;

import java.util.Comparator;

public class ComparatorAccountEmpl implements Comparator<Accoount> {

	@Override
	public int compare(Accoount ac1,Accoount ac2)
	{
		System.out.println("");
		System.out.println("comparing based on ac1.balance: "+ ac1.getBalance()+" , ac2.balance: "+ac2.getBalance());
		return(int)(ac1.getBalance()-ac2.getBalance());
	}
}
