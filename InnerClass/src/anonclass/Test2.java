package anonclass;

public class Test2 implements Test1{

	@Override
	public void area(int side) {
		System.out.println("Area Test2: " + side*side);
	}
	
}
