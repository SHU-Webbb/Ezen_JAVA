package sec04;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i= 1 ; i<=10; i++) {
			if (i%3 == 0) continue; //3의 배수이면 다음 반복으로 넘어간다.
			System.out.println(i);
		}

	}

}
