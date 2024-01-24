package exercise.avstraci_ex;

public abstract class Animal {

	int legs;
	
	
	
	Animal(int legs){
		this.legs = legs;
	};
	
	public abstract void move();
	
	public abstract void eat();
	
	
}

class Spider extends Animal {

	Spider() {
		super(8);  //legs = 8

	}

	@Override
	public void move() {
		System.out.printf("거미는 %d개의 다리를 이용하여 움직입니다.\n",legs);

	}

	@Override
	public void eat() {
		System.out.println("거미가 곤충을 잡아 먹습니다.");

	}

}

class Fish extends Animal {
	
	public String name;

	

	public Fish() {
		super(0);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void move() {
		System.out.println("물고기가 헤엄칩니다.\n");

	}

	@Override
	public void eat() {
		
		System.out.println("물고기가 작은 물고기를 잡아 먹습니다.");
	}

}
class Cat extends Animal {
	

	public String name;
	
	Cat(String name){
		super(4);
		this.name = name;
			
	}
	
	Cat() {
		super(4);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.printf("고양이는 %d개의 다리를 이용하여 뜁니다.\n",legs);

	}

	@Override
	public void eat() {
		System.out.println("고양이가 쥐를 잡아먹습니다.");
	}

}

