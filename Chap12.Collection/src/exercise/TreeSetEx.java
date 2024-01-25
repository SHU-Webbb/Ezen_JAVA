package exercise;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		
		Integer[] score = {80, 95, 50 , 35, 45, 65, 10, 100};
		
		TreeSet<Integer> num = new TreeSet<>(Arrays.asList(score));
		
				
		System.out.println(num);
		System.out.println("50보다 작은 데이터 " + num.headSet(50));
		System.out.println("50보다 큰 데이터 " + num.tailSet(num.higher(50)));
					

	}
}
