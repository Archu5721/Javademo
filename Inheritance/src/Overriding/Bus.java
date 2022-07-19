package Overriding;

public class Bus extends Vehicle{
	Bus(){
		System.out.println("Bus:" + this);
	}
	
	String fuel() {
		return "Gas";
	}

}
