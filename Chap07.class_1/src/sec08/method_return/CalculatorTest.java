package sec08.method_return;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		// add()를 수행한 결과를 받아 total에 저장
		int total = c1.add(4, 3);
		
		System.out.println("add(4,3) 수행 결과는 " + total);
		
		int x = 25;
		int y = 41;
		total = c1.add(x, y);
		
		System.out.println("add(x,y) 수행 결과는 "+ total);
		
		//return 값이 없는 매소드 호출
		c1.multiply(7, 5);
		
		c1.dispResult();
		
		// 매개 변수의 갯수를 알 수 없는 경우 매소드 호출
		total = c1.sum(2,3,5);
		
		System.out.println("c1.sum(2,3,5)의 결과 " + total);
		
		total = c1.sum(1,3,5,7,9);
		
		System.out.println("c1.sum(1,3,5,7,9)의 결과 " + total);		
	}

}
