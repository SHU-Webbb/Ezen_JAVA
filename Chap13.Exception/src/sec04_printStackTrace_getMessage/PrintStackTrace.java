package sec04_printStackTrace_getMessage;

public class PrintStackTrace {

	public static void main(String[] args) {
		
		//예외가 발생되면 메서드를 통해 내용을 가져올수있다.
		//printStackTrace() 호출스택에 있었떤 메서드의 정보와 예외 메시지 출력
		//getMessage() 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음.
		
		System.out.println("1");
		System.out.println("2");

		try {
			System.out.println("3");
			System.out.println(0 / 0);
			System.out.println("4");
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				ae.printStackTrace();
				System.out.println(ae.getMessage());
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception a) {
			System.out.println("Exception");//모든 예외의 최고조상 Exception
		}
		System.out.println("6");

		

	}

}
