package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		CentralBank  b = new NepalBank();
		
		 b.getBankName();
		 b.getInterestRate();
		 
		 UserService  service = new UserServiceImpl();
		 
		 service.addUser();
		 service.deleteUser();
		 service.print();
		 service.update();
		 
		 UserService.edit();
		 
//		CommonService cs = new UserServiceImpl();
//		cs.print();
		 
	}
}
