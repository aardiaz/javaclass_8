package constructor;

public class User {

	//instance variables
	String username;
	String password;
	
	//-----------default Constructor --------------
	User(){
		username = "root";
		password = "1234";
	}
	
	//---------------- parameterized constructor -----------
	User(String username, String password){
		
		   //this();//calling default constructor
		   //this(34,343);//calling param. constructor
		
		  this.username = username;
		  this.password = password;//calling instance variables
		  
		  //this.printUser();//instance method
		  
		  /*
		   * # 'this' keyword represents current object.
		   * # using 'this' keyword we can call:
		   *    -> instance variables
		   *    -> Instance methods
		   *    -> constructors
		   */
	}
	
	User(String username){
		  this.username = username;
	}
	
	void printUser() {
		System.out.println("UserName = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
//		int a,b;
//		a = 500;
//		
//		User x,y,z;
//		x = new User();
		
	    User  u = new User("hari", "h3434");
		u.printUser();
		
		/**
		 * ----------- Object Class --------------
		 * 
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */
	}
}
