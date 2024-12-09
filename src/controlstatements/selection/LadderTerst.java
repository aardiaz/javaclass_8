package controlstatements.selection;

public class LadderTerst {
	
	/*
	 * ------------- else if -------------------
	 * # syntax :
	 * 
	 *           if(condition-1){
	 *               //statements
	 *           }
	 *           
	 *           else if(condition-2){
	 *               //statements
	 *           }
	 *           
	 *            else if(condition-3){
	 *               //statements
	 *           }
	 *           .................
	 *           ................
	 *           ....................
	 *           else{
	 *              //statements
	 *           }
	 *           
	 *           
	 */
	
	public static void main(String[] args) {
		
		  int marks =7;
		  
		  if(marks >= 80) {
			  System.out.println("Distinction");
		  }
		  
		  else if(marks >= 60) {
			  System.out.println("First");
		  }
		  
		  else if(marks >= 45) {
			  System.out.println("2nd");
		  }
		  
		  
		  else if(marks >= 32) {
			  System.out.println("3rd");
		  }
		  
		  else {
			  System.out.println("failed!!");
		  }
		
	}

}









