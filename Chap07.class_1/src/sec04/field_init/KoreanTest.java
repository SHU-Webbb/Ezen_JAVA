package sec04.field_init;

class Korean {
	String nation = "대한민국";
	String name;
	String birthday;

	// 생성자
	public Korean() {
	}

	public Korean(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;

	}
}

public class KoreanTest {

	public static void main(String[] args) {

		Korean k1 = new Korean();
		Korean k2 = new Korean("이순신", "1990-01-02");

		System.out.println("국적은 " + k1.nation);
		System.out.println("이름은 " + k1.name);
		System.out.println("생일은 " + k1.birthday);

		System.out.println();

		System.out.println("국적은 " + k2.nation);
		System.out.println("이름은 " + k2.name);
		System.out.println("생일은 " + k2.birthday);

	}

}
