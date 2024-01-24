package sec07_polymorphism.example1;

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

	// 제품을 구매하는 기능
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 제품을 구매할 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "을/를 구매하였습니다.");

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
		
		System.out.println("현재 남은 잔액은 "+b.money+"원입니다.");
		System.out.println("현재 보너스 포인트는 "+b.bonusPoint+"원입니다.");
		
			
		
	}

}
