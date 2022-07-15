package javademo;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int num;
		int fact=1;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=a.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial =" + fact);
	}

}
