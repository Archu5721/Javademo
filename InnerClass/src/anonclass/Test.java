package anonclass;

public class Test {
	public static void main(String[] args) {
		Test1 t1 = new Test1() {

			@Override
			public void area(int side) {
				// TODO Auto-generated method stub
				System.out.println("Area : " + side*side);
			}
		};
		t1.area(5);
		 
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Separate Thread");
			}
		});
		th.start();
		
	}
}
