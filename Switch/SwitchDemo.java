package edu.bcas.Switch;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter the Month: ");
	int month =scan.nextInt();
	
	switch (month) {
	case 1:
		System.out.println("This is january has 31 days");
				break;
	case 2:
		System.out.println("This is Fabrary  has 28 days");
		break;
	case 3:
		System.out.println("This is March has 31 days");
		break;
	case 4:
		System.out.println("This is Apral has 30 days");
		break;
	case 5:
		System.out.println("This is May has 31 days");
		break;
	case 6:
		System.out.println("This is June has 30 days");
		break;
	case 7:
		System.out.println("This is july has 31 days");
		break;
	case 8:
		System.out.println("This is january has 31 days");
		break;
	case 9:
		System.out.println("This is january has 31 days");
		break;
	case 10:
		System.out.println("This is january has 31 days");
		break;
	case 11:
		System.out.println("This is january has 31 days");
		break;
	case 12:
		System.out.println("This is january has 31 days");
		break;
	
	default:
		System.out.println("Invalied Month");
		break;
	}
}
}
