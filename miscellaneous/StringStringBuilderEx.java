package miscellaneous;

public class StringStringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="Aniket";
		System.out.println(a+"Choudhari");
		System.out.println(a);
		
		 a=a+"Choudhari";
		System.out.println(a);
		
		String a1=a+"Choudhari";
		System.out.println(a);

		System.out.println(a1);

		String a2="Choudhari";
	
		Employee e1=new Employee(2,"Raj Malhotra",25000,10);
		e1.setEmpname("Aniket");
		System.out.println(e1);
		
		Employee e2=new Employee(2,"Raj Malhotra",25000,10);
		System.out.println(e2);

	   
     

      //String imp conversions    

      //char to String        
      char ch = 'n';
      String chstr = Character.toString(ch);
      System.out.println("char ch="+ch+" to String:"+chstr);

      
      //String to char
      String yesno = "n";
       ch =  yesno.charAt(0);
       System.out.println("String "+yesno+" to char:"+ch);
       System.out.println(ch);

       
       //char to unicode value
       ch = 'A';
       Character x = ch;  //autoboxing char to Character
       int charval = Character.getNumericValue(ch);
       System.out.println("char ch="+ch+" to Unicode value:"+charval);



      //important methods of string

      String str = "Core Java Batch";
      
      String str1 = str.substring(5,8);
      System.out.println(str1);

      str1 = str.substring(5);
      System.out.println(str1);

      System.out.println(str.toLowerCase());

      
      //String to char array
      char[] arr = str.toCharArray();



	}

}
