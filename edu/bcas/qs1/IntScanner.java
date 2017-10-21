package edu.bcas.qs1;

import java.util.Scanner;

public class IntScanner {
	int num1,num2,num3;
	public IntScanner () {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the price 1 : ");
		num1=scan.nextInt();
		System.out.println("Enter the price 2 : ");
		num2=scan.nextInt();
		System.out.println("Enter the price 3 : ");
		num3=scan.nextInt();
		System.out.println("************************");
		System.out.println("Product 1 price "+num1);
		System.out.println("Product 2 price "+num2);
		System.out.println("Product 3 price "+num3);
		System.out.println("************************");		
		}
public static void main(String[] args) {
	IntScanner IS=new IntScanner();
	
}
	
}
