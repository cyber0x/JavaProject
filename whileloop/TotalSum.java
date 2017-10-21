package edu.bcas.whileloop;

import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Numbers : ");
		int i = scan.nextInt();
		int a = 1;
		int tot = 0;
		double mult = 1;
		while (a<=i) {
			tot = tot+a;
			mult= mult*a; 
			a++;
		}
		System.out.println("Sum of First "+i+" is : "+tot);
		System.out.println("Production of First "+i+" is : "+mult);
	}
}
