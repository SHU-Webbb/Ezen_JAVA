package exercise;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Stack<Integer> twoNum = new Stack<>();
		
		
		System.out.println("이진수로 변환 할 정수를 입력하세요.");
		
		int num = input.nextInt();
		int remainder = 0;
//		int tmp = num/2;
//		do {	
//			twoNum.push(num%2);
//			
//			if(tmp > 2) {
//				twoNum.push(tmp%2);
//			}
//			
//		}while(tmp < 2 );
//			
		
		while (num>0) {
			remainder = num % 2;
			twoNum.push(remainder);
			
			num /= 2;
		}
		
		
		while(!twoNum.isEmpty()) {
			System.out.print(twoNum.pop());
		}
		
		
		
	}

}
