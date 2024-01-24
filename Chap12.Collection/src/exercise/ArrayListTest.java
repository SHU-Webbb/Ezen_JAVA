package exercise;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int stud_no;
	private String name;
	private int age;
	
	public Student (int stud_no, String name,int age ) {
		this.stud_no = stud_no;
		this.age = age;
		this.name = name;
	}

	public int getStud_no() {
		return stud_no;
	}

	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList<>();
		
		studList.add(new Student(101,"홍길동",25));
		studList.add(new Student(102,"이순신",33));
		studList.add(new Student(103,"장영실",29));
		
		System.out.println(studList);
		printList(studList);
		
	}
	
	public static void printList(ArrayList<Student> list) {
		for( int i=0; i<list.size(); i++) {
			System.out.println("번호 : " + list.get(i).getStud_no());
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("나이 : " + list.get(i).getAge());
		}
		
	}
}
