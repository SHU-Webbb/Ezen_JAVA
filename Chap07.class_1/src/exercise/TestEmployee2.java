package exercise;

public class TestEmployee2 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(100, "철수", "김", 1000000);
		Employee2 e2 = new Employee2(101, "영희", "이", 1100000);
		Employee2 e3 = new Employee2(102, "길동", "홍", 1300000);
		
		dispSalary(e1);
		dispSalary(e2);
		dispSalary(e3);
		
		// 철수의 급여를 15% 인상
		e1.raiseSalary(15);
		System.out.println("철수의 인상된 급여는" + e1.getSalary());
		dispSalary(e1);
		
		// Employee2 타입의 배열을 생성
		Employee2[] empArr = new Employee2[3];
		empArr[0] = e1; 
		empArr[1] = e2;
		empArr[2] = e3;
		
		// toString() 이용 출력
		for ( Employee2 emp : empArr) {
			System.out.println(emp.toString());
		}
	}

	public static void dispSalary(Employee2 e) {
		System.out.printf("사번:%d  이름:%s  월급여:%d  년봉:%d\n",
				e.getID(), e.getName(), e.getSalary(), e.getAnnualSalary());
	}
}
