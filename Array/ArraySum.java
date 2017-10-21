package edu.bcas.Array;

import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println(" How many value do you have : ");
	int length=scan.nextInt();
	double marks []= new double [length];
	String name []= new String [length];
	for (int i = 0; i <length; i++) {	
		System.out.println(" Enter the student name : ");
		name [i] = scan.next();
		System.out.println( " Enter the student marks : ");
		marks [i] = scan.nextDouble ();	
	}	
	double sum= 0;
	System.out.println("Students Details");
	System.out.println("___________________________________________");
	for (int j = 0; j < marks.length; j++) {
		
		System.out.println(name[j]+"     "+marks[j]);
		
		sum=sum + marks[j];		
	}
	System.out.println("___________________________________________");
	System.out.println("Sum of total Marks = "+sum);
	double avg=sum/marks.length;
	System.out.println("average of total Marks = "+avg);
	System.out.println("___________________________________________");
	}
}
