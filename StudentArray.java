package pkg;

// This class implements an array with basic operations.

public class StudentArray {
	
	private Student[] students;
	private int number; 	// to count how many students
	private final int DEFAULT_SIZE = 10;
	
	public StudentArray() {
		this.students = new Student[DEFAULT_SIZE];
		this.number = 0;
	}
	
	public StudentArray(int size) {
		this.students = new Student[size];
		this.number = 0;
	}
	
	public Student Search(int studentNumber) {
		for(int i=0; i < this.number; i++) 
			if(this.students[i].getStudentNumber() == studentNumber)
				return this.students[i];
		return null; 	// no students were found
	}
	
	public boolean Insert(Student student) {
		if(this.Search(student.getStudentNumber()) == null) {
			if(this.number == this.students.length) {
				increaseSize();
			}
			this.students[this.number++] = student;
			return true;
		}
		return false; 	// students number already exist. No insert.
	}
	
	public boolean Delete(int studentNumber) {
		for(int i=0; i < this.number; i++) {
			if(this.students[i].getStudentNumber() == studentNumber) {
				this.students[i] = this.students[number-- - 1];
				return true;
			}
		}
		return false; 	// nothing was done.
	}
	
	public int DeleteInactiveStudents() {
		int nb = 0; 	// count how many students were deleted.
		for(int i= this.number; i>= 0; i--) {
			if(!this.students[i].isActive()) { // if student is active
				for(int j=i; j < this.number; j++)
					this.students[j] = this.students[j + 1];
				this.students[this.number -1] = null;
				number--;
				nb++;
			}
		}
		return nb;
	
	}
	public void Display() {
		for(int i=0; i < this.number; i++)
			System.out.println(this.students[i]);
	}
	
	/**
	 * Increase size of table if needed.
	 */
	private void increaseSize() {
		Student[] temp = new Student[this.students.length*2];
		
		for(int i=0; i < this.number; i++)
			temp[i] = this.students[i];
		this.students = temp;
	}
	

}
