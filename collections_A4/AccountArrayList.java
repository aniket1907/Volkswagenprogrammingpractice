package collections_A4;
import java.util.*;

public class AccountArrayList {

  public static void main(String[] args) {


      List<Accoount> list = new ArrayList<Accoount>();

      Accoount a = new Accoount ("Aniket Choudhari",10000,35000);
      Accoount b = new Accoount ("Bibhishan Choudhari",10001,30000);
      Accoount c = new Accoount ("Laxmi Choudhari",10002,32000);
      Accoount d = new Accoount ("Aabha Choudhari",10003,36000);
      
      list.add(a);
	  list.add(b);
	  
	  System.out.println(list);
  }

  		
}
