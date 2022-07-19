package pkg;

public class Main {

	public static void main(String[] args) {
		StudentArray students = new StudentArray(5);
		
		// a few insert
		students.Insert(new Student(9, "Matty", "Bukov", false));
		// ill save you guys time.
		students.Insert(new Student(24, "Phill", "Smith", true));
		students.Insert(new Student(18, "Craig", "Millan", true));
		students.Insert(new Student(24, "Brandon", "Broll", true)); // insert error
		students.Insert(new Student(17, "Wally", "Bowman", false));
        students.Insert(new Student(39, "Charles", "Lachine", true));
		students.Insert(new Student(7, "Danny", "Bouchard", false)); 
		students.Insert(new Student(2, "Miloslav", "Dvorak", true));
		
		System.out.println("-- LIST OF STUDENTS --");
		students.Display(); 	// Brandon Broll wont be in the list
		
		// -- search --
		Student s = students.Search(24);
		
		if(s != null)
			System.out.println("\nSearch: " + s);
		s = students.Search(13);
		
		if(s != null) 	// next line should not be executed
			System.out.println("\nSearch: " + s);
		
		// -- delete --
		students.Delete(18);
		
		System.out.println("\n-- LIST OF STUDENTS --");
		students.Display(); 	// Craig Millan should not be there anymore.
		
		int n = students.DeleteInactiveStudents();
		System.out.println("\n" + n + " inactive students were suppressed.");
		
		System.out.println("\n--LIST OF STUDENTS--");
		students.Display(); 	// Craig Millan should not be there anymore.
		

	}

}
