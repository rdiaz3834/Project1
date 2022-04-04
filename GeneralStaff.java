
public class GeneralStaff extends Employee {
	
private String duty;

public GeneralStaff() {
	duty = " ";
	
}
public GeneralStaff(String duty) {
	
}
public GeneralStaff (String deptName, String duty) {
	
}
public GeneralStaff(String name, int birthYear, String deptName, String duty) {
	
}
public String getDuty() {
	return duty;
}
public boolean equals(Object obj) {
	
}
//Override
public String toString() {
	System.out.printf("<content of Employee> GeneralStaff: Duty: %10s", duty);
}

}
