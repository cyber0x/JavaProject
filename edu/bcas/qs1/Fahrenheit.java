package edu.bcas.qs1;

import java.util.Scanner;

public class Fahrenheit {
public static double fahrenheit = 0.0;
//public static int celsius=0;
public static Scanner Scan=new Scanner (System.in);
	public static double GetFahrenheit () {
		
		System.out.println("Enter The Fahrenheit value : ");
		fahrenheit = Scan.nextInt();
		return fahrenheit;
	}
	public static void main(String[] args) {
		GetFahrenheit ();
		System.out.println(fahrenheit);
		
		double celsius=(fahrenheit-32.0)*5.0/9.0;	
		System.out.println("Celsius value is : "+celsius);
	}
	
}

