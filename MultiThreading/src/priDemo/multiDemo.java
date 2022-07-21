package priDemo;

public class multiDemo extends Thread {
	public static void main(String[] args) throws InterruptedException {
		multiDemo md1 = new multiDemo();
		md1.setName("one");
		md1.setPriority(MIN_PRIORITY);
		md1.start();
		multiDemo md2 = new multiDemo();
		md2.setName("two");
		md2.setPriority(MAX_PRIORITY);
		md2.start();

	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
