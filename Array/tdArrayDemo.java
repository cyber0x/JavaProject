package edu.bcas.Array;

import java.util.Scanner;

public class tdArrayDemo {
public static void main(String[] args) {
	int [][] studentMark=new int [10][4];
	//Scanner scan=new
	
	studentMark [0][0] = 100;
	studentMark [0][1] = 50;
	studentMark [0][2] = 60;
	studentMark [0][3] = 70;
	
	studentMark [1][0] = 90;
	studentMark [1][1] = 40;
	studentMark [1][2] = 45;
	studentMark [1][3] = 75;
	
	studentMark [2][0] = 68;
	studentMark [2][1] = 45;
	studentMark [2][2] = 84;
	studentMark [2][3] = 45;
	
	studentMark [3][0] = 100;
	studentMark [3][1] = 45;
	studentMark [3][2] = 60;
	studentMark [3][3] = 45;
	
	
	
	
	
	for (int r = 0; r< 10; r++) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Student Marks [" +r+"][ " +i +"] : "+ studentMark [r][i]);
		}
		System.out.println("*********************************");
	}
}
}
