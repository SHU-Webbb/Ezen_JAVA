package sec17_Singleton;

public class singletonTest {

	public static void main(String[] args) {
		
		//Singleton s = new Singleton(); //private 생성자 사용 불가능
		
		Singleton obj1 = Singleton.getInstance(); //static 메소드 호출
		Singleton obj2 = Singleton.getInstance(); // 위와 같은 메모리를 호출
		
		
		if (obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 주소를 참조합니다.");
		}else {
			System.out.println("obj1과 obj2는 같은 주소를 참조합니다.");
		}
	}

}
