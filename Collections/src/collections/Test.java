package collections;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		int arr[]= {23,12,34,54,13,1};
		System.out.print("Before : ");  
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.sort(arr);
		System.out.println(" ");
		System.out.print("After : ");
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println("");
		
		System.out.println("POS " + Arrays.binarySearch(arr, 12));
	}
}
