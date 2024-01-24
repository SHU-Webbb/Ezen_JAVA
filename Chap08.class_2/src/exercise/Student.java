package exercise;

public class Student extends Person {
	
	private static final int MAX_COURSE = 30;
	private int numCourses = 0;
	private String[] courses = new String[MAX_COURSE];
	private int[] grades = new int[MAX_COURSE];

	public Student(String name, String address) {

		super(name, address);

	}

	public boolean addCouseGrade(String course, int grade) {
		if(numCourses >= MAX_COURSE) {
			System.out.println("수강신청 과목수는 30과목을 넘을 수 없습니다.");
		}
		
		for(int i = 0; i < numCourses ; i++) {
			if(courses[i].equals(course)) {
				System.out.println("이미, 신청한 과목입니다");
				return false;
			}
		}
		this.courses[numCourses] = course;
		this.grades[numCourses] = grade;
		numCourses = numCourses + 1;
		return true;
	}

	public void printGrades() {
		int i;

		for (i = 0; i < numCourses; i++) {
			System.out.println("과목 : " + courses[i] + ", " + "점수 : " + grades[i]);
		}

	}

	public double getAverageGrade() {
		double sum = 0;
		double aver = 0;

		for (int k = 0; k < numCourses; k++) {
			System.out.println("과목 : " + courses[k]);
			sum += grades[k];
			aver = sum / numCourses;
		}
		return aver;
	}
	
	public String toString() {
		return "Student [ name = " + getName() + ", address = " + getAddress()+ "]";
	}

}
