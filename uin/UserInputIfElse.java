package edu.bcas.uin;

import java.util.Scanner;

public class UserInputIfElse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Marks : ");
		int mark = scan.nextInt();
		char result='F';
		
		if (mark>=0 && mark <=100) { if (mark <35) {
			 result = 'F';
			 
		 } else if (mark>=35 && mark<=50){
			 result ='S';
			 
		 }else if (mark>=51 && mark<=64) {
			 result ='C';
			 
		 }else if (mark>=65 && mark <=74) {
			 result ='B';
			 
		 }else if (mark>=75 && mark <=100) {
			 result = 'A';
		 }
		 System.out.println("Your result is : "+result);
	} else {
		System.out.println("Invalied marks !!!");
	}
}
}
