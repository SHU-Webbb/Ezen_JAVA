package exercise.avstraci_ex;

public class AnimalTest {

	public static void main(String[] args) {
		
		Fish d = new Fish();
		Cat c = new Cat("나비");
		Animal a = new Fish();
		Animal e = new Spider();
		Animal p = new Cat();
		

		// 각 객체에서 메소드를 호출
		d.setName("MyFish");
		d.eat();
		System.out.println("This fish's name is "+d.getName());
		d.move();
		c.eat();
		System.out.println("This Cat's name is "+c.getName());
		c.move();
		
		
		((Fish)a).setName("MyFish2");
		((Fish)a).eat();
		System.out.println("This fish's name is "+((Fish)a).getName());
		((Fish)a).move();
		
		
		((Spider)e).eat();
		((Spider)e).move();
		
		
		((Cat)p).setName("MyCat"); 
		// p.steName // Animal 타입에는 setName()이 없어 사용할 수 없음.
		p.eat();
		System.out.println("This Cat's name is "+((Cat)p).getName());
		p.move();

		

	}

}
