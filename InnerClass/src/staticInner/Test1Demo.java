package staticInner;

public class Test1Demo {
	public static void main(String[] args) {
		Test1 t1 = new Test1(30,20);
		t1.f1();
		Test1.Inner inner = t1.new Inner(40);
		inner.f2();
	}
}
