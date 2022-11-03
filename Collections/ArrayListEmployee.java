package Collections;
//import classesandobject.Employee;
import java.util.*;

public class ArrayListEmployee {

  public static void main(String[] args) {


      List<Employee> lst = new ArrayList<Employee>();

      Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

      lst.add(e1);

      Employee e = new Employee(1,"Anubhav Sinha",15000,10);

      lst.add(e);

      lst.add(new Employee(3,"Sangeeta Shah",35000,10));
      lst.add(new Employee(2,"Raj Malhotra",25000,10));


      System.out.println(lst);

      System.out.println(lst.size());      


      /*
       * contains method checks if element is present by comparing it with every element in collection
       * it uses equals method for comparison. 
       * so you have to override equals method in the elements class if two elements are supposed to
       * be equal i.e. meaningfully same application-wise
       * 
       * reason:- why you should override the equals method.
       * if you dont override equals in Employee then Object class equal will be called
       * and it checks if two objects are memory-wise equal - so u wont get the expected result.
       */
        boolean isPresent = lst.contains(new Employee(3,"Sangeeta Shah",35000,10));
        System.out.println("Employee with empid 3 and name Sangeeta Shah is Present or not? = "+isPresent);

        System.out.println("Iterate through list of employees");
        Iterator<Employee> itr =lst.iterator();
        while(itr.hasNext()) 
        {
        	
        	Employee ex=itr.next();
        	System.out.println(ex.calcAnnSal());
        	System.out.println(ex);
        }
        
        System.out.println("Printing employees of arraylist using for each");
        lst.forEach(ex->
        {
        	System.out.println(ex);
        	double sal=ex.calcAnnSal();
        	System.out.println(sal);
        	
        }
        );

        
        lst.forEach(ex->System.out.println(ex));
        
        System.out.println("is empty :- "+lst.isEmpty());
        lst.clear();
        System.out.println("is empty :- "+lst.isEmpty());
        


  }

  		
}
