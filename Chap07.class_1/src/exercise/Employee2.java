package exercise;

public class Employee2 {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee2(int id, String firstName, String lastName, int salary) {
		this.id =id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		salary = (int)((1 + percent/100.0) * salary);
		
		return salary;
	}
	
	public String toString() {
		return "Employee[id="+id+", name="+getName()+", salary="+salary+"]";
	}
}
