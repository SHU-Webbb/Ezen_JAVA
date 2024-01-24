package sec03_hashset.package2;

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

	@Override
	public int hashCode() {
		
		return (name + age).hashCode();
	}
	/*
	 * 지금 저장된 Person 객체의 name과 age가 새로 저장될 Person 객체의 
	 * name과 age과 같으면 동일한 데이터로 간주
	 * obj : 새로운 데이터
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { //obj 참조변수가 Person타입으로 변환 가능한지 확인
			Person tmp = (Person) obj;
			boolean result =name.equals(tmp.name) && age == tmp.age;
			return result;
		}
		return false; //obj가 Person 타입이 아닌경우 equals()의 결과를 false로 변환
	}
	
	

}

public class HashSetSolution {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();

		set1.add("abc");
		set1.add("abc");  //abc 중복 데이터이므로 저장되지 않음.
	
		System.out.println("set의 내용  " + set1);

		// set에 Person 타입의 객체 추가
		set1.add(new Person("Michael", 24));
		set1.add(new Person("Michael", 24));  //(new Person("Michael", 24) 객체가 중복 데이터인지 확인 불가능.

		System.out.println("set의 내용  " + set1);
		
	}

}
