package collections_A4;

import java.util.HashSet;
import java.util.Set;


public class HashSetAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Accoount> hSet = new HashSet<Accoount>();

		 Accoount a1 = new Accoount ("Aniket Choudhari",10000,35000);
	     Accoount a2 = new Accoount ("Bibhishan Choudhari",10001,30000);
	     Accoount a3 = new Accoount ("Laxmi Choudhari",10002,32000);
	     Accoount a4 = new Accoount ("Aabha Choudhari",10003,36000);
	      
		
	     hSet.add(a1);
	     hSet.add(a2);
	     hSet.add(a3);
	     hSet.add(a4);
		
		
		
		
		System.out.println("------ forEach loop ------");
        hSet.forEach(emp -> System.out.println(emp));
        
        System.out.println("Set size: "+hSet.size());
	}
	}


