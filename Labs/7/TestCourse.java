
public class TestCourse {

	
	public static void main(String[] args) {

		Course course1 = new Course("Figures in American Currency");

		course1.addStudent("George Washington");
		course1.addStudent("John Adams");
		course1.addStudent("Ben Franklin");

		

		
		course1.dropStudent("John Adams");
		
		System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i<course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		

		
			
		
		
	}

}
