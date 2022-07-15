package javademo;

public class Foreacheg {
	public static void main(String[] args) {
		int a[]= {20,80,32,123};
		int sum=0;
		for  (int x : a) {
			sum +=x;
		}
		System.out.println("Sum = " +sum);
		
	}

}
