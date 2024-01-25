package sec08_comparable;

import java.util.*;

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet<Person> tset = new TreeSet<>();
		
		tset.add(new Person("홍길동",35));
		tset.add(new Person("이순신",39));
		tset.add(new Person("유관순",19));
		
		Iterator<Person> it = tset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(tset);
	}

}
