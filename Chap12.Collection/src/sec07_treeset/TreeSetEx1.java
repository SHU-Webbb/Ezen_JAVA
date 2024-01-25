package sec07_treeset;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("첫번째 객체는 " + set.first());
		System.out.println("마지막 객체는 " + set.last());
		System.out.println("disk의 headset은 " + set.headSet("disc")); // disc 값 제외
		System.out.println("disk의 tailset은 " + set.tailSet("disc")); // disc 값 포함
		System.out.println("'disc'의 lower는 "+ set.lower("disc"));
		System.out.println("'disc'의 floor는 " + set.floor("disc"));
		
	}

}
