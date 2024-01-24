package sec14.final_field;

class Person {

	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;

	}
}

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("881212-1234567", "유관순");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	//	p1.nation ="USA"; //final 변수에 다른 값을 대입할 수 없음.
	//	p1.ssn = "343434";

		Person p2 = new Person("920202-1234567", "홍길동");

		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}
