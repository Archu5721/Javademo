package yieldDemo;

public class Test {
	public static void main(String[] args) {
		
		simpleYield sy1 = new simpleYield();
		Thread t1 = new Thread(sy1);
		t1.setName("t1");
		t1.start();
		simpleYield sy2 = new simpleYield();
		Thread t2 = new Thread(sy2);
		t2.setName("t2");
		t2.start();
		
		
		String tname = Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			System.out.println(tname + ":" +i);
		}
	}
}
