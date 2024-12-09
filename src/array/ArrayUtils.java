package array;

import java.util.Arrays;

public class ArrayUtils {
	
	public static void main(String[] args) {
		
		int[]  values = {2,34,6,54,6,35,23,4,53,5,34,2,34};
		
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 600);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 4, 9, 900);
		System.out.println(Arrays.toString(values));
		
		System.out.println(Arrays.toString(Arrays.copyOf(values, 5)));
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(values, 6, 12)));
		
	}

}
