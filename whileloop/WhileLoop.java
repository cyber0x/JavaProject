package edu.bcas.whileloop;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	
	System.out.println("Enter Number : ");
	int i = scan.nextInt();
	int a=1;
	int b = 1;
	while (i>=a) {
		while (a>=b) {
			System.out.print(b+" ");
			b++;
		}
		System.out.println();
		a++;
	}
}
}
