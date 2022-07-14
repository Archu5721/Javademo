package javademo;

public class operators {
	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		int x = 10, y =15 , z =5;
		if(x < y && x >z) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		//ternary
		int var =10;
		boolean condition;
		condition = (var ==10) ? true : false ;
		System.out.println("isTen " +condition);
		System.out.println("");
		System.out.println("Basic Structure");
		boolean condition1 = true,condition2=false;
		boolean result = condition1 ? (condition2 ? true : false): false; 
		System.out.println(result);
		System.out.println("");
		int rent = 4000;
		boolean haveMoney = (rent <= 5000) ? true: false;
		boolean facility = true;
		String result1 = haveMoney ? (facility ? "CanLive" : "Can't" ): "Search for another home" ;
		System.out.println("Rent :" + result1);
	}
}
