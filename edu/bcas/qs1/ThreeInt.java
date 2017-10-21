package edu.bcas.qs1;

import java.util.Scanner;

public class ThreeInt {
	static int   num1,num2,num3;
	public ThreeInt () {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter number 1 : ");
		num1=scan.nextInt();
		System.out.println("Enter number 2 : ");
		num2=scan.nextInt();
		System.out.println("Enter number 3 : ");
		num3=scan.nextInt();
		
	}
	public void sum () {
		System.out.println("Total : "+(num1+num2+num3));
	}
	public void Avg () {
		System.out.println("Average : " +(num1+num2+num3)/3);
	}
	public void mult () {
		System.out.println("Product : " +(num1*num2*num3));
	}
	public static void main(String[] args) {
		ThreeInt num=new ThreeInt ();
		int bigger;
		int smaller = 0;
		if (num1>num2) {
			if (num1>num3) {
				bigger=num1;
			}
			else {
				bigger=num3;
			}
		} else {
			if (num2>num3) {
				bigger=num2;
			}
			else {
				bigger=num3;
			}
		}
		
		if (num1<num2&&num1<num3) {
			smaller=num1;
		}
		else if (num2<num3&&num2<num1) {
			smaller=num2;
		}else if (num3<num1&&num3<num2) {
			smaller=num3;
		}else {
			System.out.println("Both values are equal");
			
		}
		
		
		num.sum();
		num.Avg();
		num.mult();
		System.out.println("larger number is : " +bigger);
		System.out.println("Smaller number is : "+smaller);
		
		
	}
}
