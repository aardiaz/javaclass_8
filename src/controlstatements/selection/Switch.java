package controlstatements.selection;

public class Switch {
	
	/*
	 * --------------- switch --------------
	 *     #syntax :
	 *       
	 *        switch(variable){
	 *              case 1 :
	 *                //stm
	 *               break;
	 *               
	 *             case 2 :
	 *                //stm
	 *               break;
	 *               
	 *                   ............
	 *                   ...............
	 *               default :
	 *                  //stm
	 *                    
	 *          }
	 *          
	 *      where case value can be :
	 *        int,Long,String,char,Enums    
	 */
	
	public static void main(String[] args) {
		
		int day = 2;
		
		switch(day) {
		case 1 :
			//System.out.println("Sunday");
			//break;
			
		case 2 :
			//System.out.println("Monday");
			//break;
			
		case 3 :
			System.out.println("Analysis");
			break;
			
		case 4 :
			System.out.println("Wednesday");
			break;
			
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
	      default :
	    	  System.out.println("invalid input");
		}
		
	}

}
