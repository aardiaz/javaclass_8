package datatype;

public class WrapperTEst {
	
	/*
	 * -------------- Wrapper Class ----------------
	 * # every primitive data type has their own respective class is known as
	 *   wrapper class.
	 *  
	 *    Primitive Type    Wrapper Type
	 *   ----------------   --------------
	 *    		byte			Byte
	 *    		Short			Short
	 *    		int				Integer
	 *    		long			Long
	 *    		float			Float
	 *    		double			Double
	 *    		char			Character
	 *    		boolean			Boolean
	 */
	
	  public static void main(String[] args) {
		
		  /*
		   *  -------- Auto-boxing----------------
		   *  # conversion of primitive type into wrapper type.
		   */
		  
		  int a = 6578;
		  Integer p = a;//auto-boxing
		  
		  /*
		   * ---------- Auto-unboxing ---------------
		   * # conversion of wrapper type into primitive type
		   */
		  
		  Double n = 45678.34534;
		  double m = n; //auto-unboxing
		  
		  System.out.println(Integer.toBinaryString(8000));
		  System.out.println(Integer.toOctalString(8000));
		  System.out.println(Integer.toHexString(8000));
		  
	}

}
