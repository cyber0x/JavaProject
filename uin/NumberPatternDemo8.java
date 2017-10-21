package edu.bcas.uin;

import java.util.Scanner;

public class NumberPatternDemo8 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the rows : ");
	int row = scan.nextInt();
	
	for (int i =row ; i >=1; i--) {
		
		for (int j= i; j >=1; j--) {
			System.out.print(j+"");
			
		}
		System.out.println("");
	}
	}
	

}
