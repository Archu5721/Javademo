package join;

import java.util.Scanner;

public class joinDemo extends Thread{
	static int num;
	static int sum=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		joinDemo.num = sc.nextInt();
		joinDemo jd = new joinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum :"+joinDemo.sum);
		
	}
	
	public void run() {
		for(int i=1;i<=joinDemo.num;i++) {
			joinDemo.sum+=i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
