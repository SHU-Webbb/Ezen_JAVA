package exercise;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFistName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return this.salary;
	}

//	public void setSalary() {
//		this.salary = raiseSalary() + this.salary;
//	}

	int getAnnualSalary() {
		return salary * 12;
	}

	int raiseSalary(int percent) {
		int result = (int) ((salary * ((double)percent) / 100.0) + salary);
		return result;
	}

	public String toString() {
		return "Employee[id = " + id + ", name =" + getName() + ", salary = " + salary + "]";
	}

}
