package NonStatic;

public class Test {
	class Inner{
		void f1() {
			System.out.println("Non-static Inner function f1()");
		}
	}
	void f2() {
		System.out.println("f2() outer function");
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.f2();
		
		Test.Inner inner = test.new Inner();
		inner.f1();
	}
}
