package execFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " Main method starts");
		Worker[] wts = new Worker[3];
		wts[0] = new Worker("ATM");
		wts[1] = new Worker("BANK");
		wts[2] = new Worker("MOBILE");
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for(Worker w : wts) {
			fixedThreadPool.submit(w);
		}
		fixedThreadPool.shutdown();
		
		System.out.println(tname + "Main method Ends ");
	}
}
