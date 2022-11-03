package Collections;
import classesandobject.Employee;

public class objectequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   		 Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

	       Employee e = e1;

	    //   Employee e = new Employee(1,"Anubhav Sinha",15000,10);

	       System.out.println(e==e1); //true , == checks whether object is actually same (same memory)

	       e.setSalary(2500);
	 
	       System.out.println("e1's salary:"+e1.getSalary());
	       
	       Employee e2 = new Employee(2,"Raj Malhotra",25000,10);

	       System.out.println(e==e1);
	       System.out.println(e==e1); //true , == checks whether object is actually same (same memory)

	       e.setSalary(2500);
	 
	       System.out.println("e1's salary:"+e1.getSalary());
		
	       int no=5,no1=5;
	       System.out.println(no==no1);
	}

}
