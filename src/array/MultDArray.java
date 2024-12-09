package array;

import java.util.Scanner;

public class MultDArray {
	
	/*
	 * ------------ Mulit-D Array --------------
	 * # use to store and processing data in row and column form.
	 * # syntax :
	 * 
	 *     data_type  array_name[][] = new data_Type[rows][cols];
	 */
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		//put data
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.println("Enter value of  mat ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		//get data
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
