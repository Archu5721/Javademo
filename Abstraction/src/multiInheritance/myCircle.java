package multiInheritance;

public class myCircle implements circle,circleTwo{

//	@Override
//	public void calculateArea() {
//		System.out.println(circle.pi);
//		
//	}

	@Override
	public void display() {
		System.out.println("Display function from circle");
		
	}

	@Override
	public void display1() {
		System.out.println("Display function from circleTwo");
		
	}

	@Override
	public void calculateArea() {
		System.out.println(circleTwo.pi);
		
	}

}
