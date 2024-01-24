package exercise;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "철수", "김", 1000000);
		Employee e2 = new Employee(101, "영희", "이", 1100000);
		Employee e3 = new Employee(102, "길동", "홍", 1300000);

		dispSalary(e1);
		dispSalary(e2);
		dispSalary(e3);

		e1.raiseSalary(15);
		System.out.println("철수의 인상된 급여는" + e1.raiseSalary(15));
		dispSalary(e1);

		// employee 타입의 배열을 생성
		Employee[] empArr = new Employee[3];
		empArr[0] = e1;
		empArr[1] = e2;
		empArr[2] = e3;
		
		
		for(Employee emp : empArr) {
			System.out.println(emp.toString());
		}
	}

	public static void dispSalary(Employee e) {

		System.out.printf("사번: %d  이름: %s 월급여 : %d  연봉 : %d \n", e.getId(), e.getName(), e.getSalary(),
				e.getAnnualSalary());

	}
}
