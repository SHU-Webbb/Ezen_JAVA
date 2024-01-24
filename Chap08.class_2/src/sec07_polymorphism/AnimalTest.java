package sec07_polymorphism;

class Animal {
	public void makeNoise() {
		System.out.println("동물이 짖는 소리");

	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("멍멍");
	}

	public void run() {
		System.out.println("강아지가 네발로 뜁니다.");
	}
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("야옹");
	}
}

class BigDog extends Animal {
	public void makeNoise() {
		System.out.println("왕왕");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		// child class 사용
		Cat cat1 = new Cat();
		cat1.makeNoise();
		Dog dog1 = new Dog();
		dog1.makeNoise();
		BigDog dog2 = new BigDog();
		dog2.makeNoise();
		
		
		
		// 다형성 사용
		Animal animal1 = new Cat();
		animal1.makeNoise();
		Animal animal2 = new Dog();
		//animal2.run(); //조상타입의 변수로는 조상클래스에 없는 메서드를 호출할수없다.
		animal2.makeNoise();
	}

}
