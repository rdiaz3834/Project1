
public class Employee extends Person {

	private String deptName;
	private static int numEmployees;
	private int employeeID;

	public Employee() {
		super();
		this.deptName = " ";
		this.employeeID = 0;
	}

	public Employee(String deptName) {

	}

	public Employee(String name, int birthYear, String deptName) {

	}

	public String getDeptName() {

		return this.deptName = deptName;
	}

	public static int getNumEmployees() {

		return numEmployees++;

	}

	public int getEmployeeID() {

		return this.employeeID = employeeID;
	}

	public void setDeptName(String deptName) {

		this.deptName = deptName;
	}

	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		
		if(this.employeeID != e.employeeID) 
			return false;
		
		if(!e.getDeptName().equals(this.getDeptName()))
			return false;
		
		if()
	}
}
