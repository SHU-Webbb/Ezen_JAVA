package sec03;

public class RandomExample {

	public static void main(String[] args) {
		double value = Math.random();
		
		System.out.println("value = " + value);
		System.out.println("(int)value = " + (int)(value*10));
		//1~10 사이의 정수를 구하는 코드
		//Math.radom()* 10 + 1
		System.out.printf("(int)(value*10)+1 = %d", (int)(value*10)+1);
	}

}
