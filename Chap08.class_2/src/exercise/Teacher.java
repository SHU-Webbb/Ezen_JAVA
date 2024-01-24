package exercise;

public class Teacher extends Person {

	private static final int MAX_COURSE = 5;
	private int numCourses = 0;
	private String[] courses = new String[MAX_COURSE];

	public Teacher(String name, String address) {

		super(name, address);

	}

	public boolean addCourse(String course) {
		if(numCourses >= MAX_COURSE) {
			System.out.println("등록과목수는 5과목을 넘을 수 없습니다.");
		}

		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				System.out.println("이미 등록한 과목입니다");
				return false;
			}

		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	public boolean removeCourse(String course) {
		int index = 0; // 과목 지운 위치 저장

		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courses[i] = "";
				index = i;
				break;
			}
		}
		// 지운 과목 뒤의 요소들의 하나씩 앞으로 복사
		for (int i = index; i < numCourses-1; i++) {
			courses[i] = courses[i + 1];
		}
		numCourses--;
		return true;
	}

	public void printCourses() {
		System.out.println("<강의중인 과목>");

		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i]);
		}

	}
}