package edu.bcas.qs1;

import java.util.Scanner;

public class Larger {
 public static int num1,num2;
	public Larger() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the  Number 1 : ");
		 num1=scan.nextInt();
		System.out.println("Enter the  Number 2 : ");
		num2=scan.nextInt();
		
	}
	public static void main(String[] args) {
		Larger ne=new Larger();
		
		if (num1>num2) {
			System.out.println(num1+ "is larger than " +num2);
		}
		else if (num1<num2) {
			System.out.println(num2+ " is larger than " +num1);
		}
		else if (num1==num2) {
			System.out.println("These numbers are equal");
		}
	}
}
