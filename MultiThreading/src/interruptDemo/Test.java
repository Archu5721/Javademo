package interruptDemo;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": starts");
		Thread t1 = new Thread(new interrupt());
		t1.setName("t1");
		t1.start();

		try {
			Thread.sleep(3000);
			t1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tname +":Ends");
	}

}
