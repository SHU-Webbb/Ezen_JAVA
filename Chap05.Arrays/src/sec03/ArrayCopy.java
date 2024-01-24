package sec03;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		// abc, num 배열의 요소를 합한 내용을 저장 할 배열 생성
		char[] result = new char[abc.length+num.length];
		
		System.arraycopy(abc,0,result,0,abc.length);
		System.arraycopy(num, 0, result, abc.length,num.length);
		System.out.println(result);
		

}
}