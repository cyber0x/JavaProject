package edu.bcas.Array;

import java.util.Scanner;

public class input2dArray {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	
	System.out.println("Number of Student : ");
	int nstudent= scan.nextInt();
	
	System.out.println("Number of Subject :");
	int nsub= scan.nextInt();
	
	int sum=0,avg=0;
	int [][] studentMarks = new int [nstudent][nsub];
	String [] sName= new String[nstudent];
	String [] subject = new String [nsub];
	
	
	// input data 
	for (int row= 0; row < nstudent; row++) {
		
		System.out.println("Enter Student Name :" ); //input the student name
		sName[row]=scan.next();	
		for (int i = 0; i < nsub; i++) {
			System.out.println("Enter Subject " + i +" Name :" ); //input the student name
			subject[i]=scan.next();
							
		}
		System.out.println("*********************************");
		
		for (int i = 0; i < nsub; i++) {
			
			System.out.println("Enter " +subject[i] +" Mark" );
			studentMarks [row][i] = scan.nextInt();					
		}
		System.out.println("*********************************");
	}
	
	// data Out put 
	for (int r = 0; r< nstudent; r++) {
		System.out.println("Student Name : "+sName[r]);
		for (int i = 0; i < nsub; i++) {
			System.out.println(subject [i]+" Marks : " + studentMarks [r][i]);
			sum = sum + studentMarks [r] [i];
		}
		
		System.out.println("*********************************");
		System.out.println("Total Mark [" + r +"]: " +sum );
		System.out.println("Avarage mark [" + r +"]: " +(sum/nsub));
		System.out.println("*********************************");

		}
	}
}
