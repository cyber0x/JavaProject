package edu.bcas.Loop;

import java.util.Scanner;

public class NmberPatternDemo10 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter :");
		int row =scan.nextInt ();
		
		for (int i = row; i >=1; i--) {
			for (int j = row; j >=i; j--) {
				System.out.print(j+"");
			}
			System.out.println(" ");
		}
}
}
