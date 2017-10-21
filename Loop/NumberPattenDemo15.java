package edu.bcas.Loop;

import java.util.Scanner;

public class NumberPattenDemo15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter :");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(" ");
				
			}
			for (int j2 =1; j2 <= row-i+1; j2++) {
				System.out.print(j2+" ");
				
			}
			System.out.println(" ");
		}
		for (int a = row; a >= 1; a--) {
				for (int j =1; j <=a; j++) {
					System.out.print(" ");

				}	
				for (int j3=1; j3 <= row-a+1; j3++) {
					System.out.print(j3+" ");
					
				}
			System.out.println(" ");

		}

	}
	}

