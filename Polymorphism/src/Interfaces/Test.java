package Interfaces;

public class Test {
	public static void main(String[] args) {
//		Laptop l =new HpLaptop();
//		l.sleep();
//		l.start();
		
		//we can't create object for interface
		//upcasting
		Laptop l = new thinkPad();
		l.start();
		l.sleep();
		
		LenovoLap l1 = new launchPad();
		// downcasting - explicit
		launchPad obj = (launchPad) l1;
		l1.start();
		
		LenovoLap pro = new thinkPad();
		thinkPad obj2 = (thinkPad) pro;
		obj2.function();
	
		
	}
}
