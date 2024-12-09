package controlstatements.looping;

public class DoWhileTest {
	
	/*
	 * ------------- do - while -------------
	 * # syntax :
	 * 
	 *    do{
	 *    
	 *        //stm
	 *        //inc/dec
	 *    
	 *    }while(condition);
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * .........
		 * ............
		 * 5 x 10 = 50
		 */
		
		int n = 6543;
		int i = 1;
		
		do {
			
			System.out.println(n+" x "+i+" = "+(n*i));
			i++;
		}while(i<=10);
		
		
	}

}
