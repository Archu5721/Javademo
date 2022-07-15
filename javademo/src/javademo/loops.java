package javademo;

public class loops {
	public static void main(String[] args) {
		int sum=0,count=0;
		for ( int i =1 ;i<=10;i++) {
			System.out.println("Hiii I'm " + i);
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
		  System.out.println();
		}
		System.out.println();
		for(int i =22 ;i<=98 ;i++) {
			if(i % 2==0) {
				System.out.println("Even numbers : " + i);
			}
		}
		
		System.out.println("");
		for(int i=1;i<=100;i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				sum += i; 
			}
			if(count == 5) {
				break;
			}
			
		}
		System.out.println(count);
		System.out.println("sum =" + sum);
		
		System.out.println("");
		int num = 0;
		while( num <= 5) {
			System.out.println(num);
			num++;
		}
		
	}
}
