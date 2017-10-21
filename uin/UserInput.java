package edu.bcas.uin;

import java.util.Scanner;

public class UserInput {
		public static void main(String[] args) {
			int marks;
			int IncrementValue= 10;
			int lastmark=90;
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter your Name : ");
			String name = scan.next ();
			
			System.out.println("Enter your Marks : ");
			marks = scan.nextInt();
			 if (marks<lastmark) {
			int newMark = marks + IncrementValue;
			System.out.println("hi "+name+ "Your New Mark is : "+newMark);
			}
			 else if (marks>100){
				 System.out.println("not in range");
			 }
			 else {
				 System.out.println("sorry "+name+" dont have any increment your final mark is : "+marks);
			 }
			 
			
					
			
		}
}
