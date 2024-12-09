package methods;

public class MethodTest {

	public static void main(String[] args) {
		// sum();
		//printTable(987);
		int sumof100 = getSumOf1To100();
		System.out.println("Sum of 1-100 = "+sumof100);
		
		int sv = getSmallestValue(768, 7689);
		System.out.println(sv);
	}

	// 1. no return type no arguments
	static void sum() {

		int a = 3434;
		int b = 4540;

		int c = a + b;
		System.out.println("Total  =" + c);
	}

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	// 3. return type with no arguments
	static int getSumOf1To100() {

		int s = 0;
		for (int i = 1; i <= 100; i++) {
			s += i;
		}

		return s;
	}
	
	//4.return type with arguments
	static int getSmallestValue(int x, int y) {
		   if(x<y)
			   return x;
		   return y;
	 }

}
