package edu.bcas.uin;

import java.util.Scanner;

public class NumberPatternDemo3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Number of Row Do you want ");
		int row=scan.nextInt ();
		for (int i = row; i >= 1; i--){
			for (int j =1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
