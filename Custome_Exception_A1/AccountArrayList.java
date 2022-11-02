package Custome_Exception_A1;
import java.util.*;

import customeexception.Account;

public class AccountArrayList {

  public static void main(String[] args) {


      List<Account> list = new ArrayList<Account>();

      Account a = new Account ("Aniket Choudhari",10000,35000);
      Account b = new Account ("Bibhishan Choudhari",10001,30000);
      Account c = new Account ("Laxmi Choudhari",10002,32000);
      Account d = new Account ("Aabha Choudhari",10003,36000);
      
      list.add(a);
	  list.add(b);
	  
	  System.out.println(list);
  }

  		
}
