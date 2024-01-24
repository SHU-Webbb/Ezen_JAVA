package exercise;

class Swap<E,T> {
	
	private E ee;
	private T tt;
	
	Swap (E ee,T tt){
		this.ee = ee;
		this.tt = tt;
		
	}
	
	public void swap() {
		System.out.print("("+tt+ ",");
		System.out.print(""+ee+")");
		System.out.println();
	}
}

public class SwapTest_me {

	public static void main(String[] args) {
		
		Swap<Integer,Integer> list1 = new Swap<>(1,2);
		
		list1.swap();
		
		Swap<String,String> list2 = new Swap<>("hi","there");
		
		list2.swap();
		
	}

}
