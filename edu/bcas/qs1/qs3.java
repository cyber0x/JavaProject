package edu.bcas.qs1;

import java.util.Scanner;

public class qs3 {
	public static int num1,num2;
	public qs3 () {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter the number : ");
		num1=scan.nextInt();
		System.out.println("Enter the number : ");
		num2=scan.nextInt();
	}
	public static void main(String[] args) {
		qs3 nums=new qs3();
		int n=num1%num2;
		
		
	if(n==0) {
		System.out.println("%d is a multiple of%d " +num1 +" "+num2);
		
	}else {
		System.out.println("%d isn't a multiple of%d "+num1 +" "+num2);
	}
		
		
	}
}
