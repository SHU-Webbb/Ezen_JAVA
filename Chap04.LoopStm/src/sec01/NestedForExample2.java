package sec01;

public class NestedForExample2 {

	public static void main(String[] args) {
		for ( int i =2; i <= 9 ; i++) {// 구구단의 단
			System.out.printf("구구단의 %d단>>\n",i);
			
			for(int j = 1; j<=9; j++) {
			    System.out.printf("%d * %d = %d\n" ,i, j, i*j);                      
			}
			System.out.println();
		}

	}

}
