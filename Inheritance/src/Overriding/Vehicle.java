package Overriding;

public class Vehicle {
	
	Vehicle(){
		System.out.println("Vehicle:" + this);
	}
	
	String fuel() {
		return "Petrol";
	}

}
