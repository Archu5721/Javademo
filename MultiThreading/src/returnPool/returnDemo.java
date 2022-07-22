package returnPool;

import java.util.concurrent.Callable;

public class returnDemo implements Callable<Integer>{
	int num;
	public returnDemo(int num) {
		this.num=num;
	}
	@Override
	public Integer call() throws Exception {
		String tname = Thread.currentThread().getName();
		
		System.out.println(tname + "Calculation starts!!");
		int total =0;
		for(int i=1;i<=num;i++) {
			total += i;
		}
		Thread.sleep(500);
		System.out.println(tname + "Calculation Ends!!");
		return total;
	}

	
}
