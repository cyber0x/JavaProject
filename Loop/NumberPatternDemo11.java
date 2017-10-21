package edu.bcas.Loop;

import java.util.Scanner;

public class NumberPatternDemo11 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter :");
		int row =scan.nextInt ();
		
		for (int i = row; i >=1; i--) {
			for (int j =1; j <=i; j++) {
				System.out.print("1 ");
				
			}
			for (int j = row; j >=i; j--) {
				System.out.print(i+" ");
			}
					System.out.println(" ");
			
			}
			
		}
}

