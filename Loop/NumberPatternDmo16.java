package edu.bcas.Loop;

import java.util.Scanner;

public class NumberPatternDmo16 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter :");
		int row =scan.nextInt ();
		
		for (int i = row; i >=1; i--) {
			for (int j = row; j >=i; j--) {
				if (j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println(" ");
		}
}
}
