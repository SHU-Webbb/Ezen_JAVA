package exercise;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> ranNum = new LinkedList<>();

		for (int i = 0; i <= 9; i++) {
			int j = (int) (Math.random() * 101);
			ranNum.add(j);
		}

		System.out.println(ranNum);

		change(ranNum);

		System.out.println(ranNum);

	}

	public static void change(LinkedList<Integer> n) {

		int tmp;
		int tmp2;
		tmp = n.get(3);
		tmp2 = n.get(4);
		n.set(4, tmp);
		n.set(3, tmp2);

	}

	public static void change(LinkedList<Integer> n, int index1, int index2) {

		if (index1 < 0 || index2 < 0 || index1 >= n.size() || index1 >= n.size()) {
			System.out.println("index값이 잘못되었습니다.");
		}
		int temp = n.get(index1);
		n.set(index1, n.get(index2));
		n.set(index2,temp);
	}

}
