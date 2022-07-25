package staticInner;

public class Test {
	static class Inner{
		static void f1() {
			System.out.println("Static Inner Function f1()");
		}
	}
	static void f2() {
		System.out.println("Outer function f2()");
	}
	public static void main(String[] args) {
		Test.f2();
		
		Test.Inner.f1();
	}
}
