package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		p.id = 3434;
		p.name = "Sulav Giri";
		p.company = "Google";
		p.salary = 700000;
		p.bonus = 50000;
		p.progLang = "java";
		p.project = "G-Map";
		
		p.print();
	}

}
