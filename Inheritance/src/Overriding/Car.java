package Overriding;

public class Car extends Vehicle {
	Car(){
		System.out.println("Car:" + this);
	}
	
	String fuel() {
		return "Diesel";
	}

}
