package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(4,56,78,97,67,54,3,56,78,9,76,5,45,67);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
