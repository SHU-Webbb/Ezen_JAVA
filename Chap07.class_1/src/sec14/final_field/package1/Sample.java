package sec14.final_field.package1;

import java.util.*; //java util 안에 있는 여러 클래스 사용시 * 사용


//다른 패키지에 있는 클래스 또는 프로그램 사용시 import문 사용
import sec02.field_declare.Car;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		sec01_new_class.Student s1 = new sec01_new_class.Student();
		
		Car car1 = new Car();
		
		//import 사용시 패키지명을 지정할 필요 없음.
		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		
		
	}

}
