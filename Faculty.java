
public class Faculty extends Employee{
	
	private int[] course ; 
	private int numCoursesTaught;
	private boolean isTenured;
	

	public faculty() {
		course = new int [100];
		this.coursesTaught = [];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
		
	}
	
	public Faculty (boolean isTenured) {
		super();
		coursesTaught = [];
		numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	public Faculty(String deptName, boolean isTenured){
		
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		
	}
	public boolean isTenured() {
		return false;
	}
	public int getNumCourseTaught() {
		return  numCoursesTaught;
	}
	public void setIsTenured(boolean isTenured) {
		
	}
	public void addCourseTaught(Course course) {
		
	}
	public void addCoursesTaught(Course [] course) {
		
	}
	public Course getCourseTaught(int index) {
		return null;
		
	}
	public String getCourseTaughtAsString(int index) {
		return null;
		
	}
	public String getAllCoursesTaughtAsString() {
		
	}
	public boolean equals(Object obj) {
		Faculty fac1 = new Faculty(isTenured, numCoursesTaught);
	}
	public String toString() {
		System.out.printf("<content of Employee> Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s",
				isTenured , numCoursesTaught,
        getAllCoursesTaughtAsString());
		return null;

	}
	public int compareTo(Person p) {
		return numCoursesTaught;
		
	}
	
}
