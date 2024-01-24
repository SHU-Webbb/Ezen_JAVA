package exercise;



class Employee {
	static long baseSarlary = 100000;

	public long getSalary() {

		return baseSarlary;

	}
}
class Manager extends Employee {
				
	public long getSalary() {

		return baseSarlary + 20000;
	
}
}
class Clerk extends Employee {
	
	public long getSalary() {

		return baseSarlary + 10000;
	
}
}

	
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager e1 = new Manager();
		
		System.out.println(e1.getSalary());
		
		Clerk e2 = new Clerk();
		
		System.out.println(e2.getSalary());
		

	}

}
