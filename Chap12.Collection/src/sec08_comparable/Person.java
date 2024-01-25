package sec08_comparable;
/*
 * Person 클래스 객체를 TreeSet에 저장하기 위해
 * 값을 비교할 수 있는 기능이 필요
 * Comparable 인터페이스를 구현
 * 
 */
public class Person implements Comparable<Person>{

	public String name;
	public int age;

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	/*
	 * Person 데이터의 비교 기준 구현
	 * 저장된 값이 작으면 : -1
	 * 같으면 : 0
	 * 저장된 값이 크면 : +1
	 */
	@Override
	public int compareTo(Person o) {
		if(this.age < o.age) 
			return -1;
		else if (age == o.age)
			return 0;
		else 
			return 1;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
