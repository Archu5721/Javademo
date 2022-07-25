package staticInner;

public class Test1 {
	private int x;
	private int y;
	public Test1(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void f1() {
		System.out.println("f1 function in outer class");
	}
	
	class Inner{
		private int x;
		Inner(int x){
			this.x=x;
		}
		void f2() {
			System.out.println("f2() function in outer class");
			System.out.println("Outer x : " + Test1.this.x);
			System.out.println("Outer y : " + Test1.this.y);
			System.out.println("Inner x : " + this.x);
		}
	}
}
