package org.array;

public class Question1 {

	public static void main(String[] args) {
		int sum=0;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length-1; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}

}
