package edu.bcas.Loop;

import java.util.Scanner;

public class NumberPatternDemo13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter :");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("* ");

			}
			for (int a = 1; a <= row; a++) {
				for (int j =1; j <=a; j++) {
					System.out.print("*");

				}
				
			System.out.println(" ");

		}
	}
}
