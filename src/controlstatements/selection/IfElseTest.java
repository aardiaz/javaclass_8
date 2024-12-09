package controlstatements.selection;

public class IfElseTest {
	
	/*
	 * ----------- if-else -------------
	 * # syntax :
	 * 
	 *     if(condition){
	 *        //statements
	 *     }else{
	 *        //statements
	 *     }
	 */
	
	
	public static void main(String[] args) {
		
		int x = 464654;
		
		if(x%2 == 0) {
			System.out.println(x+" is even number");
		}else {
			System.out.println(x+ "is odd numebr" );
		}
		
	}

}
