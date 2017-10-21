package edu.bcas.qs1;

import java.util.Scanner;

public class Q3 {
double num1,num2;
public Q3() {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter number 1 : ");
	num1=scan.nextInt();
	System.out.println("Enter number 2 : ");
	num2=scan.nextInt();
}
public void sum () {
	System.out.println(num1+ " + " + num2+ " = " +(num1+num2));
}
public void sub () {
	System.out.println(num1+ " - " + num2+ " = " +(num1-num2) );
}
public void mult () {
	System.out.println(num1+ " X " + num2+ " = " +(num1*num2) );
}
public void div () {
	System.out.println(num1+ " / " + num2+ " = " +(num1/num2) );
}
public static void main(String[] args) {
	Q3 nn=new Q3();
	nn.sum();
	nn.sub();
	nn.mult();
	nn.div();
}
}
