package array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//store and print age of 5 students.
		
		//create array
		int  age[] = new int[5];
		
		//0 1 2 3 4 
		//[][][][][]
		
		//write data in array
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<age.length; i++) {
			
			System.out.println("Enter your age ");
		    age[i] = sc.nextInt();
		}
		
		//read data from array
		int ta = 0;
		 for(int x : age) {
			 System.out.println(x);
			 ta = ta + x;
		 }
		 System.out.println("Total age = "+ta);
		
	}

}
