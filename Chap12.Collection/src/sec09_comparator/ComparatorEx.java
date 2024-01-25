package sec09_comparator;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		TreeSet<Product> pSet = new TreeSet<>(new DescendingComperator());
		
		pSet.add(new Product("컴퓨터", 5000));
		pSet.add(new Product("냉장고", 9000));
		pSet.add(new Product("세탁기", 8000));
		pSet.add(new Product("TV", 10000));
		
		Iterator<Product> it = pSet.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.printf("%s : %d\n", p.name, p.price);
		}

	}

}
