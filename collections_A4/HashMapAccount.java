package collections_A4;

import java.util.HashMap;
import java.util.Map;


public class HashMapAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Accoount, Double> hMap = new HashMap<Accoount, Double>();

		 Accoount a1 = new Accoount ("Aniket Choudhari",10000,35000);
	     Accoount a2 = new Accoount ("Bibhishan Choudhari",10001,30000);
	     Accoount a3 = new Accoount ("Laxmi Choudhari",10002,32000);
	     Accoount a4 = new Accoount ("Aabha Choudhari",10003,36000);
	      
		
	    hMap.put(a1, a1.getBalance());
		hMap.put(a2, a2.getBalance());
		hMap.put(a3, a3.getBalance());
		hMap.put(a4, a4.getBalance());
		
		System.out.println(hMap);
		
		System.out.println("contains key accNo=1002: "+hMap.containsKey(new Accoount ("Laxmi Choudhari",10002,32000)));
		System.out.println("contains value balance of ac3=3200: "+hMap.containsValue(a3.getBalance()));
	
	}

}
