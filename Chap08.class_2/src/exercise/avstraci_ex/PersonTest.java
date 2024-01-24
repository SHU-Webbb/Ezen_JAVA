package exercise.avstraci_ex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		
		people[0] = new Employee("아무개",50000,2005,10,1);
		people[1] = new Student("장영실","컴퓨터공학");
		
		people[0].getDescription();
		people[1].getDescription();
		
		System.out.println(people[0].getName());
		System.out.println(people[1].getName());
		
		Employee e1 = new Employee("아무무",40000,2023,10,10);

		System.out.println(e1.getName());
		
		
	}

}