
package Thread;

public class multithreadingex {

	public static void main(String[] args) {
		
		
		Thread t = new MyThread1();
	//	t.run();
		
		t.start();
		
		
		MyThread2 ob = new MyThread2();
		
		Thread t2 = new Thread(ob);
		t2.start();
		
		
		for(int j=1;j<100;j++)
		{
			
	System.out.println(Thread.currentThread().getName()+" j="+j);
	
	     try
	     {
	       Thread.sleep(3000);
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	
	  
	
		}
		
		
	}

}