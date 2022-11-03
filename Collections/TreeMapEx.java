package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Employee,Double> smp=new TreeMap<Employee,Double>();
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		smp.put(e1,e1.getSalary());
		Employee e = new Employee(1,"Anubhav Sinha",15000,10);
		smp.put(e,e.getSalary());
	

		smp.put(new Employee(3,"Aniket Choudhari",30000,10),28000.0);
		smp.put(new Employee(2,"Bibhishan Choudhari",20000,10),18000.0);
	
		System.out.println(smp);

//		Sort employee keys of tree map in asending order of rmp salary
		Comparator<Employee> c=new ComparatorEmpl();
		
		Employee e11 = new Employee(2,"Raj Malhotra",25000,10);
		smp.put(e11,e11.getSalary());
		Employee ee = new Employee(1,"Anubhav Sinha",15000,10);
		smp.put(ee,ee.getSalary());
	

		smp.put(new Employee(3,"Aniket Choudhari",30000,10),28000.0);
		smp.put(new Employee(2,"Bibhishan Choudhari",20000,10),18000.0);
	
		System.out.println(smp);
		
	}
	

}
