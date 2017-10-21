package edu.bcas.uin;

import java.util.Scanner;

public class NumberDemo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Number of Row Do you want ");
		int row=scan.nextInt ();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
