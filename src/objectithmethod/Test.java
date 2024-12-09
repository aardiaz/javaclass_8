package objectithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		Proudct p = t.getProductData();
		t.printProduct(p);
	}
	
	//object as parameter
	void printProduct(Proudct p) {
		
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
	}
	
	//object as return type 
	Proudct  getProductData() {
		
      Proudct p = new Proudct();
		
		p.setId(3434);
		p.setName("TV");
		p.setCompany("CG");
		p.setPrice(900000);
		
		return p;
	}
	
	//array of object as parameter
	
	
	//array of object as return type

}
