package exercise;

public class TestPerson {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", "경기도");
		
		
		System.out.println(stu1.getName());
		
		stu1.addCouseGrade("영어", 97);
		stu1.addCouseGrade("수학", 75);
		stu1.addCouseGrade("영어", 80);
		
		stu1.printGrades();
		
		System.out.println("평균점수는 " +stu1.getAverageGrade());
		

		System.out.println(">>> Teacher 클래스 테스트");
		
		Teacher t1 = new Teacher("홍선생","서울");
		
		t1.addCourse("국어");
		t1.addCourse("영어");
		t1.addCourse("수학");
		t1.addCourse("사회");
		t1.addCourse("물리");
		
		t1.printCourses();
		
		System.out.println("<수학> 과목 폐강");
		t1.removeCourse("수학");
		t1.printCourses();
		
		
		
	}

}
