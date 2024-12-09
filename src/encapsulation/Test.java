package encapsulation;


public class Test {
	
	public static void main(String[] args) {
		
		Customer  c = new Customer();
		
		 c.setId(3434);
		 c.setName("Ram");
		 c.setAge(23);
		 c.setPhone("9834343434");
		 
		 System.out.println(c);
		
//		System.out.println("Id = "+c.getId());
//		System.out.println("Name  = "+c.getName());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("Phone = "+c.getPhone());
	}

}
