package edu.bcas.Loop;

import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int x = scan.nextInt ();
		for (i=1;i<=x;i++) {
			System.out.println("WellCome To BCAS ");
		}
	}
}
