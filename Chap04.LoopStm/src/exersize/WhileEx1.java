package exersize;



public class WhileEx1 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while (i<=10) {
			
//			sum = i + sum;
//			i++;
			
			sum += i++; //i변수의 증가를 한문장으로 완성
		}
		
		System.out.println(sum);
	}

}
