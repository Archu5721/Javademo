package returnPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) {
		//String tname =Thread.currentThread().getName();
		//System.out.println(tname + "Main Mathod Starts");
		returnDemo[] rds = new returnDemo[2];
		rds[0] = new returnDemo(30);
		rds[1] = new returnDemo(1);
		
		ExecutorService service =  Executors.newFixedThreadPool(2);
		for(returnDemo rd : rds) {
			Future<Integer> future = service.submit(rd);{
				try {
					Integer total = future.get();
					System.out.println("Total : " + total);
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		service.shutdown();
		
	}
}
