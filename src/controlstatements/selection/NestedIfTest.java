package controlstatements.selection;

public class NestedIfTest {
	
	/*
	 * ----------- nested if-else -----------------
	 * # syntax :
	 * 
	 *      if(condition-1){
	 *      
	 *             if(condition-2){
	 *             
	 *                  if(condition-3){
	 *                    ....................
	 *                    .............
	 *                    ..................
	 *                  }else{
	 *                  
	 *                  }
	 *             
	 *             }else{
	 *             
	 *             }
	 *          
	 *      }else{
	 *      
	 *      }
	 */
	
	public static void main(String[] args) {
	
		String citizen = "nepali";
		int age = 150;
		boolean haveVoterId = false;
		
		
		  if(citizen.equals("nepali")) {
			  
			    if(age >= 18) {
			    	
			    	  if(haveVoterId) {
			    		  System.out.println("U can vote");
			    	  }else {
			    		  System.out.println("No voter Id");
			    	  }
			    	
			    }else {
			    	System.out.println("sorry !! u r under age");
			    }
			  
		  }else {
			  System.out.println("invalid citizenship !!");
		  }
		
	}

}








