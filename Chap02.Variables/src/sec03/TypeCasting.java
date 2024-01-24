package sec03;

/**
 * Type Casting :
 * 서로 다른 타입의 데이터를 타입변환하여 저장하는 기능
 * 
 */

public class TypeCasting {

	public static void main(String[] args) {
		int intValue = 65;
		char chValue = (char)intValue;
//		char chValue = intValue;
		
		System.out.println("intValue = "+ intValue);
		System.out.println("chValue = "+ chValue);
		
		long longValue = 1245678012345689L;
		intValue = (int)longValue;  // 큰 수의 값이 잘려나가므로 주의 요망
		
		System.out.println("longValue = "+ longValue);
		System.out.println("intValue = " + intValue);
		
		// 부동소스의 형변환
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		
		System.out.println("dounleValue = " + doubleValue);
		System.out.println("intValue = " + intValue);

		// 작은 크기타입에서 큰 타입으로 변환 시
		intValue = 65;
		longValue = intValue;
		
		System.out.println("longValue = " + longValue);
		
		// 큰 크기의 타입에서 작은 크기의 타입 변환시 명시적 형변환 필요
		longValue = 132;
		
		intValue = (int)longValue;
		
		System.out.println("intValue = " + intValue);
		
	}

}
