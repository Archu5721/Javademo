package Chaining;

public class Parent {
	int a;
	
	Parent(){
		this(10);
		System.out.println("Parent : No args");
	}
	
	Parent(int a){
		this.a=a;
		System.out.println("Parent : one args");
	}

}
