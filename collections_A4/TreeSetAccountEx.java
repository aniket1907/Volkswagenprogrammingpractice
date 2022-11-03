package collections_A4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAccountEx {

	public static void main(String[] args) {
		 Accoount a1 = new Accoount ("Aniket Choudhari",10000,35000);
	     Accoount a2 = new Accoount ("Bibhishan Choudhari",10001,30000);
	     Accoount a3 = new Accoount ("Laxmi Choudhari",10002,32000);
	     Accoount a4 = new Accoount ("Aabha Choudhari",10003,36000);
	      
		SortedSet<Accoount> sstAcc = new TreeSet<Accoount>();
		
		sstAcc.add(a1);
		sstAcc.add(a2);
		sstAcc.add(a3);
		sstAcc.add(a4);
		sstAcc.add(a2); // duplicate
		
		System.out.println(sstAcc);
		System.out.println(sstAcc.size());
		System.out.println(sstAcc.contains(new Accoount("Tony Stark", 1005, 8000)));
		
		// custom comparator with account balance
		Comparator<Accoount> c = new ComparatorAccountEmpl();
		sstAcc = new TreeSet<Accoount>(c);
		
		sstAcc.add(a1);
		sstAcc.add(a2);
		sstAcc.add(a3);
		sstAcc.add(a4);
		sstAcc.add(a2); // duplicate
		
		System.out.println(sstAcc);
		System.out.println(sstAcc.size());
		System.out.println(sstAcc.contains(new Accoount("Bruce Banner", 1009, 1000)));
		
		
	}

}