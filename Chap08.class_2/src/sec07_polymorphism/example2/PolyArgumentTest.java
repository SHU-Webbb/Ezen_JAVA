package sec07_polymorphism.example2;

/*
 * 전자제품 클래스
 */
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 포인트

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 포인트는 제품 가격의 10%
	}

}

class Tv extends Product {
	Tv() {
		super(1000);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(800);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(2000);
	}

	public String toString() {
		return "Audio";
	}
}

// 제품 구매자 클래스
class Buyer {
	int money = 10000; // 구매자가 가진 금액
	int bonusPoint = 0; // 구매자가 가진 보너스 포인트
	Product[] items = new Product[10]; //구매한 제품을 저장하는 배열
	int index = 0; //Product 배열에 사용할 인덱스
	

	// 제품을 구매하는 기능
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 제품을 구매할 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[index++] = p;  //구매한 제품을 Product[]에 저장
		System.out.println(p.toString() + "을/를 구매하였습니다.");

	}
	/*
	 * 제품 구매한 목록 출력
	 */
	void summary() {
		int total = 0;
		
		System.out.println("구매한 물품의 목록 : " );
		
		//Null pointer 예외 발생
//		for (int i = 0; i<items.length; i++) {
//			total += items[i].price;
//			System.out.println(items[i].toString()+",");
//		}
		
		for (int i = 0; i<index; i++) {
			total += items[i].price;
			System.out.println(items[i].toString()+",");
		}
		System.out.println("구매한 총 금액은 " + total + "원 입니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv1 = new Tv();
		b.buy(tv1);
		
		// Upcasting
		Product p = new Computer();
		b.buy(p);
		
		b.buy(new Audio());
		
		b.summary();
		
		System.out.println("현재 남은 잔액은 "+b.money+"원입니다.");
		System.out.println("현재 보너스 포인트는 "+b.bonusPoint+"원입니다.");
		
		
		
			
		
	}

}
