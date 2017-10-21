package edu.bcas.uin;

import java.util.Scanner;

public class NumberPatternDemo9 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter :");
		int row =scan.nextInt ();
		
		for (int i = 1; i <=row; i++) {
			for (int j = row; j >=i; j--) {
				System.out.print(j+"");
			}
			System.out.println(" ");
		}
	}
}
