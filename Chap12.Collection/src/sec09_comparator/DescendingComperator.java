package sec09_comparator;

import java.util.Comparator;

public class DescendingComperator implements Comparator<Product> {
	/*
	 * 역순 정력(내림차순)
	 */
	@Override
	public int compare(Product o1, Product o2) {
		if (o1.price < o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;

	}

}
