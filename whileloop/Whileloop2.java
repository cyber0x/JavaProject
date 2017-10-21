package edu.bcas.whileloop;

import java.util.Scanner;

public class Whileloop2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Numbers : ");
		int row = scan.nextInt();
		int cal=1;
		for (int i = 0; i <=row; i++) {
			cal=i + cal;
			System.out.print(cal+" ");
			
		}
		}
}

