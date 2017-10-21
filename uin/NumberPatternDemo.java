package edu.bcas.uin;

import java.util.Scanner;

public class NumberPatternDemo {

		public static void main(String[] args) {
			Scanner scan=new Scanner (System.in);
			
			System.out.println("Number of Row Do you want ");
			int row=scan.nextInt ();
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				System.out.println("");
			}
		}
}
