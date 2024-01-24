package sec03_hashset.package1;

import java.util.*;

class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " : " + age;
	}
	
	

}

public class HashSetProblem {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		
		set1.add("abc");
		set1.add("abc");
		
		System.out.println("set의 내용  "+ set1);
		
		// set에 Person 타입의 객체 추가
		set1.add(new Person("Michael",24));
		set1.add(new Person("Michael",24));
		
		System.out.println("set의 내용  "+ set1);
		
	}

}
