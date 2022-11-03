package miscellaneous;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String to integer
		String a ="10";
		int b=Integer.parseInt(a.trim());
		System.out.println(b);
		
		String a1 ="1010";
		int b1=Integer.parseInt(a1,2);
		System.out.println(b1);
				
		//Integer to string conversion
		Integer c=b1;
		String d=c.toString();
		System.out.println("int "+ b +"to (decimal) string: "+d);

		d=Integer.toBinaryString(b1);
		System.out.println("primitive int "+ b +"to (binary) string: "+d);

	
		//Integer to double primitive
		
		int n=100;
		double e=n;
		
		//double primitive to int
		double cost=45.50;
		Double dd=cost;
		int n1=dd.intValue();
		System.out.println(n1);

		//double primitive to long
		long l=dd.longValue();
		System.out.println(l);
		
		//int to byte
        Integer val = 123;
        byte b2 = val.byteValue();
        System.out.println("int "+val+" to byte:"+b2);
        
		//int to short
		Integer i = 123;
        short sn = i.shortValue();
        System.out.println("int primitive "+123+" to short primitive"+sn);

	
		
	}

}
