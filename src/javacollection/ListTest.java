package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		 //List<String>  list = new ArrayList<>();
		 List<String>  list = new LinkedList<>();
		 
		 list.add("nepal");
		 list.add("china");
		 list.add("japan");
		 list.add("canada");
		 
		 //list.remove(2);
		 //list.remove("china");
		 System.out.println(list.contains("us"));
		 
		// System.out.println(list);
		 for(String s : list) {
			 System.out.println(s);
		 }
		 
		 /*
		  * List<Student>  list = new ArrayList<>();
		  * Student s1 = new Student();
		  * s1.setId(3434);
		  * ............
		  * ............
		  * 
		  * list.add(s1);
		  * 
		  * Q> List of Student,Cow, Mobile
		  */
		
	}

}
