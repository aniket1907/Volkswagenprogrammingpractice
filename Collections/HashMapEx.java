package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args)
	{
		
		
		Map<Employee,Double> mp=new HashMap<Employee,Double>();
		
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		mp.put(e1,e1.getSalary());
		Employee e = new Employee(1,"Anubhav Sinha",15000,10);
		mp.put(e,e.getSalary());
	
		
		mp.put(new Employee(3,"Aniket Choudhari",30000,10),28000.0);
		mp.put(new Employee(2,"Bibhishan Choudhari",20000,10),18000.0);
	
		System.out.println("contains key Employee Namita with id=13:"+mp.containsKey(new Employee(13,"Namita Shah",35000,20)));
		
		System.out.println("Contains key,Employee Aniket with id=3 :- "+mp.containsKey(new Employee(3,"Aniket Choudhari",35000,20)));
		System.out.println("Contains Value, salary value of 1500 rs:- "+mp.containsValue(15000.0));
		
		
		
		System.out.println(mp);
		
		
	}
	
	static void meth(Map<Employee,Double> mp)
	{
		System.out.println("Inside meth method"+mp.get(new Employee(1,"Anubhav Sinha",1600,10)));
		
//		mp.put(10,"abc");
	}
	

}


//package collections;
//
//import java.util.HashMap;
//import java.util.Map;
// 
//public class HasMapEx {
// 
//    public static void main(String[] args) {
//        Map<Employee,Double> mp = new HashMap<Employee,Double>();
//
//        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
//
//         mp.put(e1,e1.getSalary());
//
//        Employee e = new Employee(1,"Anubhav Sinha",15000,10);
//
//        mp.put(e,e.getSalary());
//
//
//        mp.put (new Employee(3,"Sangeeta Shah",35000,20),35000.0);
//        mp.put(new Employee(2,"Raj Malhotra",25000,10),25000.0);
//
//
//
//        System.out.println("contains key Employee Namita with id=13:"+mp.containsKey(new Employee(13,"Namita Shah",35000,20)));
//
//
//        System.out.println("contains key,  Employee Sangeeta with id=3:"+mp.containsKey(new Employee(3,"Sangeeta Shah",35000,20)));
//        System.out.println("contains value, salary value of 15000 rs:"+mp.containsValue(15000.0));
//
//        System.out.println(mp);
//
//        meth(mp);
//
// 
//    }
//
//
//    static void meth(Map<Employee,Double> mp)
//    {
//
//        System.out.println("inside meth method:"+mp.get(new Employee(1,"Anubhav Sinha",15000,10)));
//
//    //    mp.put(10, "jjj");
//
//    }
// 
//}

