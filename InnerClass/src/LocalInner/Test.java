package LocalInner;

public class Test {
	void f1() {
		System.out.println("inside f1 function");
		
		class LocalInner{
			void f2() {
				System.out.println("inside inner class");
			}
			
			
		}
		LocalInner local = new LocalInner();
		local.f2();
	}
}
