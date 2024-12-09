package arrayofobject;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//store and print data of 5 customers
		
		//create array
		Customer  customers[] =   new Customer[5];
		
		//write data 
		Scanner  sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
				
			Customer  c = new Customer();
			
			System.out.println("Enter id ");
			c.setId(sc.nextInt());
			
			System.out.println("Enter name ");
			c.setName(sc.next());
			
			System.out.println("Enter city ");
			c.setCity(sc.next());
			
			c.setAge(40);
			c.setPhone("9883434434");
			
			customers[i] = c;
		}
		
		//read data
		for(Customer ct : customers) {
			
			 if(ct.getCity().equals("Pokhara")) {
				 System.out.println(ct);
			 }
			
		}
		
	}

}
