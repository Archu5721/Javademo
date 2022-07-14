package javademo;

public class wrapperClasses {
	
	public static void main(String[] args) {
		int x = 5;
		Integer var = 10;
		Integer z = new Integer(9);
		int var1;
		//Autoboxing
		var = x;
		var1 = z.intValue();//explicit boxing
		System.out.println(var1);
		
		
		
		
	}

}
