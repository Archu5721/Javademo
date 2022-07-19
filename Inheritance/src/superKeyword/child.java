package superKeyword;

public class child extends Parent {
	int c;
	int d;
	child(int a,int b,int c, int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	child(int c,int d){
		super(12,12);
		this.c=c;
		this.d=d;
	}
	void display() {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("c :"+c);
		System.out.println("d :"+d);
	}
}
