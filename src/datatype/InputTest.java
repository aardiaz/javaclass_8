package datatype;

import java.util.Scanner;

public class InputTest {
	
	public static void main(String[] args) {
		
		int x ;
		int y ;
		
	  //get data from user/keyboard
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter value x ");
		x = sc.nextInt();
		
		System.out.println("Enter value of y ");
		y = sc.nextInt();
		
		int z = x + y;
		System.out.println("Sum = "+z);
		
	}

}
