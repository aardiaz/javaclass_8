package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car  c = new Car();
		c.setColor("Blue");
		c.setPrice(50000000);
		c.setModel("MXT600");
		
		Employee  emp = new Employee();
		
		emp.setId(343434);
		emp.setName("Bishnu Rawal");
		emp.setSalary(800000);
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("------ car info -------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("Model  ="+emp.getCar().getModel());
		
	}

}
