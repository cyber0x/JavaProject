package edu.bcas.Array;

public class Array1 {
	public static void main(String[] args) {
		int numberArray[]= new int [10];
		String Sarray[]= {"Thuvee","sajith","Rangith","Nishanthan"};
		numberArray[0] = 50;
		numberArray[1] = 40;
		numberArray[2] = 61;
		numberArray[3] = 52;
		numberArray[4] =84;
		numberArray [5] = 64;
		
		
		
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println("Number Array (" +i+ ") = "+numberArray[i]);
			
		}
		for (int j = 0; j < Sarray.length; j++) {
			System.out.println("String Array ("+j+ ") = " +Sarray[j]);
		}
	}

}
