package pkg;

public class Student {

	private int studentNumber;
	private String firstName;
	private String lastName;
	private boolean isActive;
	
	public Student(int studentNumber, String firstName, String lastName, boolean isActive) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		String s = isActive ? "(active)" : "(inactive)"; 	//condition ? (if yes) : (if no)
		return "#" + this.studentNumber + " " + this.firstName + " " + this.lastName + " " + s;
	}
	
	public boolean isActive() { return isActive;}
	
	public int getStudentNumber() {	return studentNumber; }
	
	public String getLastName() {return lastName; }
	
	public String getFirstName() {return firstName; }
	
}
