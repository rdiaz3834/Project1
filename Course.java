
public class Course implements Comparable<Course>{

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course() {
		
		//Default values
		
		boolean isGraduateCourse = false;
		int courseNum = 0;
		String courseDept = " ";
		int numCredits = 0;
	}
	
	public Course (boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		
		
		//parameter method
		super();
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	
	}
	
	public boolean isGraduateCourse() {
	
		return isGraduateCourse;
	
	}
	
	
	
	public int getCourseNum() {
	
		return this.courseNum;
	
	}
	
	
	
	public String getCourseDept() {
	
		return this.courseDept;
	
	}
	
	
	
	public int getNumCredits() {
	
		return this.numCredits;
	
	}
	public String getCourseName() {
		
		return "G" + courseDept + courseNum;
		
	}
	
	public boolean equals(Object obj) {
		Course a1 = new Course();
		Course a2 = new Course();
		
		if(a1 == a2) {
			return true;
		}
		return isGraduateCourse;
	}
	
	public String toString() {
		
		return String.format("Course: %3s-%3d | Number of Credits: %02d  | Graduate/Undergraduate"
				, courseDept, courseNum, numCredits, isGraduateCourse);
		
	}
	public int compareTo(Course c) {
//		
	}
	

}
