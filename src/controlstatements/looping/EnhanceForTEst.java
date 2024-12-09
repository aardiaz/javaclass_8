package controlstatements.looping;

public class EnhanceForTEst {
	
	/*
	 * ------------ forEach loop ---------------------------------
	 * # use to read data from collection(array,list,set,map etc)
	 * 
	 *   # syntax:
	 *   
	 *       for(data_type  var :  collection){
	 *       
	 *          //statements
	 *       }
	 */
	
	public static void main(String[] args) {
		
		int values[] = {4,56,7,8,98,76,54,3,56,78,65,43,5,67};
		int s = 0;
		for(int x : values ) {
			System.out.println(x);
			s = s + x;
		}
		System.out.println("sum = "+s);
		
	}

}
