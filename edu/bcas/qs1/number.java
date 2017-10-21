package edu.bcas.qs1;

import java.util.Scanner;

public class number {
	static int   num1,num2,num3,num4;
	public number () {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter number 1 : ");
		num1=scan.nextInt();
		System.out.println("Enter number 2 : ");
		num2=scan.nextInt();
		System.out.println("Enter number 3 : ");
		num3=scan.nextInt();
		System.out.println("Enter number 4 : ");
		num4=scan.nextInt();
	}
public static void main(String[] args) {
	number num=new number();
	
	System.out.println(num1 +" "+ num2+" "+num3+" "+ num4);
	System.out.print(num1 +" "+ num2+" "+num3+" "+ num4+ "\n");
	System.out.printf(num1 +" "+ num2+" "+num3+" "+ num4);
	
}
}
