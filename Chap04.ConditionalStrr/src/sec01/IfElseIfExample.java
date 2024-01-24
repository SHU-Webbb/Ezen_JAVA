package sec01;

public class IfElseIfExample {

	public static void main(String[] args) {
		int num = -5;
		
		if (num > 0) {
			System.out.printf("%d는 양수입니다.\n",num);
		}else if (num == 0) {
			System.out.printf("%d는 0입니다.\n",num);
		}else {
			System.out.printf("%d는 음수입니다.\n",num);
		}
		System.out.println("프로그램 종료");
	}

}
