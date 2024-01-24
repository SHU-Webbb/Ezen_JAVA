package sec01;

public class NestedForExamplee {

	public static void main(String[] args) {
		for ( int i =1 ; i <= 5 ; i++) {
			System.out.printf("i의 %d번째 반복>>\n",i);
			
			for(int j = 1; j<=5; j++) {
			    System.out.print(j + " ");                      
			}
			System.out.println();
		}

	}

}
