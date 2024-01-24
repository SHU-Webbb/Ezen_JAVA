package exercise.avstraci_ex;

import java.time.LocalDate;

public abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void getDescription();
}

class Employee extends Person {

	private int salary;
	private LocalDate hireDay;

	public Employee(String name, int salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	

	public int getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double percent) {
		salary += (int)(salary * percent / 100); 
	}

	
	@Override
	public void getDescription() {
		System.out.println( "급여 " + salary + "원을 받는 직원");
		
	}

}

class Student extends Person{

	String major;
	
	public Student(String name,String major) {
		super(name);
		this.major = major;
	}
	
	
	@Override
	public void getDescription() {
		System.out.println("전공이 " + major + "인 학생");
		
	}

	
}