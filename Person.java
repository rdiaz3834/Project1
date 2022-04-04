
public class Person {

//	name: String
//	birthYear: int

	private String name;
	private int birthYear;
	
	Person(){
		
		this.name = " ";
		this.birthYear = 0;
		
	}
	Person(String name, int birthYear){
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public boolean equals(Object obj) {
		
	}
	
}
