package sec04;

public class NamedBreakExample {

	public static void main(String[] args) {
		Loop1:for ( int i =2; i <= 9 ; i++) {// 구구단의 단
			System.out.printf("구구단의 %d단>>\n",i);
			
			for(int j = 1; j<=9; j++) {
				if (j == 5)
					break Loop1;
			    System.out.printf("%d * %d = %d\n" ,i, j, i*j);                      
			}
			System.out.println();
		}

	}

}
