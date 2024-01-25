package sec05_hashmap;

import java.util.*;
import java.util.Map.Entry;

class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(sno,name);
	}
	//두개의 객체가 같은지 비교
	//this : 저장된 데이터
	//obj : 새로 들어온 데이터
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			
			return(this.sno == student.sno) && (this.name.equals(student.getName()));
		}
		return false;
	}
	
	
}

public class StudentTest {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "이순신"), 92);
		map.put(new Student(1, "홍길동"), 91);

		Set<Entry<Student, Integer>> entry = map.entrySet();
		System.out.println(entry);
		
	}

}
