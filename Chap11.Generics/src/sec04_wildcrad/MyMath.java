package sec04_wildcrad;

public class MyMath {
	/*
	 * 임의의 숫자 타입의 매개변수를 받아서 더한 결과를 double 타입으로 반환
	 */
	public static <T extends Number> double add(T first, T second) {
		return first.doubleValue() + second.doubleValue();
	}

	public static void main(String[] args) {

		System.out.println("53+47 = " + add(Integer.valueOf(53), Integer.valueOf(47)));
		
		System.out.println("5.3f + 4.2f = "+add(5.3f, 4.2f));
		
		// String 타입은 Number에서 상속된 타입이 아니므로 사용 불가능
		//System.out.println("add(\"Java\",\"program\")" + add("Java","Program"));
	}
	

}
