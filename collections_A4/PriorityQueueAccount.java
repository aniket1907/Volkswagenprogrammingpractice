package collections_A4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueAccount {

	public static void main(String[] args) 
	{
		Accoount a1 = new Accoount ("Aniket Choudhari",10000,35000);
	    Accoount a2 = new Accoount ("Bibhishan Choudhari",10001,30000);
	    Accoount a3 = new Accoount ("Laxmi Choudhari",10002,32000);
	    Accoount a4 = new Accoount ("Aabha Choudhari",10003,36000);
	      
	System.out.println("\n Priority Queue Implementation");
	Queue<Accoount> queAcc = new PriorityQueue<Accoount>();
	
	// uses overriden compareTo() in Employee class
	queAcc.offer(a3);
	queAcc.offer(a2);
	queAcc.offer(a1);
	queAcc.offer(a4);
	
	System.out.println(queAcc);
	System.out.println("Size: "+queAcc.size());
	System.out.println(queAcc.poll()); // 1st element shown sorted by empId
	System.out.println("Size: "+ queAcc.size());
	System.out.println(queAcc.peek()); // 1st element removed sorted by empId
	
	System.out.println("\nLinkedlist implementation");
	queAcc = new LinkedList<Accoount>();
	
	// unsorted storage in linkedlist
	queAcc.offer(a1);
	queAcc.offer(a2);
	queAcc.offer(a3);
	queAcc.offer(a4);
	
	System.out.println(queAcc);
	System.out.println("Size: "+queAcc.size());
	System.out.println(queAcc.poll()); // 1st element shown
	System.out.println("Size: "+ queAcc.size());
	System.out.println(queAcc.peek()); // 1st element removed 
	
}
}
