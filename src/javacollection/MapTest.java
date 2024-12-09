package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//subject - marks
		//Map<String, Integer>  map = new HashMap<>();
		//Map<String, Integer>  map = new TreeMap<>();
		Map<String, Integer>  map = new LinkedHashMap<>();
		
		map.put("Math", 90);
		map.put("Science", 80);
		map.put("Computer", 95);
		map.put("English", 99);
		
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
		/* Q>
		 *   Subjects  Marks		 Total     Grade
		 *   Math    : 60,50,90,70     ?         ?
		 *   English : 80,70,60,80
		 *   Computer: 70,50,40,70
		 *   Nepali  : 90,78,98,67
		 *   
		 *   Note:
		 *   Map<String, List<Integer>>  map = new HashMap<>()
		 *      map.put("Math", Arrays.asList(90,80,88,77));
		 */
		
	}

}
