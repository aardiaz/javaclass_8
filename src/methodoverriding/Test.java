package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		NabilBank  nb = new NabilBank();
		
		nb.getBankName();
		nb.getInterestRate();
		
		//up-casting
		CentralBank bank = new NabilBank();
		printBankInfo(bank);
	}
	
	//late or dynamic binding of object
	//run time polymorphism
	static void  printBankInfo(CentralBank  b) {
		
		b.getBankName();
		b.getInterestRate();
	}
 

}
