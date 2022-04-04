
public class Student extends Person {

	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		coursesTaken = [];
		numCoursesTaken = 0;
		isGraduate = false;
	}
	public Student(boolean isGraduate) {
		
	}
	public Student(String major, boolean isGraduate) {
		
	}
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		
	}
	public boolean isGraduate() {
		return isGraduate;
		
	}
	public int getNumCoursesTaken() {
		
	}
	public static int getNumStudents() {
		
	}
	public int getStudentID() {
		
	}
	public int getMajor() {
		
	}
	public void setIsGraduate(boolean isGraduate) {
		
	}
	public void setMajor(String major) {
		//appends course to the end of the existing array

	}
	public void addCourseTaken(Course course) {
		//appends courses to the end of the existing array
	}
	public void addCousesTaken(Course [] course){
		// note: index must be verified. Return “null” if invalid
	}
	public Course getCourseTaken(int index) {
		// note: index must be verified. Return “” if invalid
        // returns “courseDept-courseNum”

	}
	public String getCourseTakenAsString() {// comma separated list of all courses taught
		  //  uses getCourseTakenAsString(int index) as a helper method

	}
	public String getAllCoursesTakenAsString() {
		System.out.printf("<content of Person> Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s"
		, studentID, major, isGraduate, numCoursesTaken, getAllCoursesTakenAsString()); 

	}
	public boolean equals(Object obj) {
		//all attributes inherited+local must match for 2 Student objects to be considered equal

	}
	public String toString() {
		//”<content of Person> Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s”
		//, studentID, major, Graduate/Undergraduate, numCoursesTaken, getAllCoursesTakenAsString() 

	}
	public int compareTo(Person p) {
		//use the Comparable interface specification, sort by numCredits
	}
	
}
