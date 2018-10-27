import java.util.Arrays;


public class Course {

	private String courseName;

	private String students[] = new String[5];
	private int numberOfStudents;
	
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		if (numberOfStudents == students.length-1) {
			expandCourse();
		}
	} 
	
	public String[] expandCourse() {

			String studentsEx[] = Arrays.copyOf(students, students.length);
			String students[] = Arrays.copyOf(studentsEx, studentsEx.length+5);
			System.out.println(students.length); //tester
					
		return students;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	} 
	
	public void clear() {
		students = null;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i<numberOfStudents; i++) {
			if(students[i].equals(student)) {
				for (int j = i+1; j< numberOfStudents; j++) {
					students[j-1] = students[j];
				}
				numberOfStudents--;
				return;
			}
		}
	}
	

}
