package Chaining;

public class Child extends Parent{
	int b;
	Child(){
		System.out.println("Child : No args");
	}
	Child(int b){
		super(5);
		this.b=b;
		System.out.println("Child : one args");
	}
}
