package yieldDemo;

public class simpleYield implements Runnable {
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println(tname + ":" +i);
		}
	}

}
