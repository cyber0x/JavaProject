package edu.bcas.Loop;

import java.util.Scanner;

public class NumberPatternDemo12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter :");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j =1; j <= row-i; j++) {
				System.out.print("1 ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");

		}

	}
}
