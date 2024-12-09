package abstraction;

public class NepalBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("Nepal Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("15%");
	}
	
}
