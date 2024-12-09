package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	/*
	 * ---------------- Array with Method ----------------
	 * a> Array as parameter   :
	 * 
	 *     void sum(int data[]){
	 *       
	 *     }
	 * 
	 * b> Array as return type :
	 * 
	 *    int[]  get10IntValues(){
	 *    
	 *         //array = 34,343,43,54,54,54,54,54,54,5;
	 *      return array;
	 *    }
	 */
	
	public static void main(String[] args) {
		int[]  data = {43,5,65,78,99,88,76,54,3,24,56,78};
		add(data);
		
		int[]  odds = getOddNumsFrom1To100();
		System.out.println(Arrays.toString(odds));
	}
	
	//array as parameter
	static void add(int[]  values) {
		
		     int s = 0;
		   for(int x : values) {
			   s = s + x;
		   }
		   System.out.println(s);
	}
	
	//array as return type
	static int[]  getOddNumsFrom1To100() {
		
		int[]  oddnums =  new int[50];
		int j = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%2 !=0 ) {
				
				oddnums[j] = i;
				j++;
			}
		}
		
		return oddnums;
	}

}
