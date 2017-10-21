package edu.bcas.Switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Add");
		System.out.println("Sub");
		System.out.println("Multi");
		System.out.println("Divid");
		System.out.println("Enter : ");
		String calc =scan.next();
		System.out.println("Enter number 1  : ");
		int n1=scan.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2=scan.nextInt ();
		
		switch (calc) {
		case "Add" :
			
			System.out.println(n1+ " + " + n2+" = " +
			(n1 + n2));
			
			break;
		case "Sub" :
			
			System.out.println(n1+ "- " + n2+"=" +
			(n1 - n2));
			
			break;
		case  "Multi":
			
			System.out.println(n1+ "X" + n2+"=" +
			(n1 * n2));
			
			break;
		case "Divid" :
			
			System.out.println(n1+ "/" + n2+"=" +
			(n1 / n2));
			
			break;



		default:
			break;
		}
		
	}

}
