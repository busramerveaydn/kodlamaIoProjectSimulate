package codeIoProject;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.Name = "B��ra Merve Ayd�n";
		student.email = "busramerveaydin@abcd.com";
		student.Educations = "Java";
		
		Student student2 = new Student();
		student2.Name = "Merve Ayd�n";
		student2.email = "merveaydin@abc.com";
		
		
		Instructor instructor = new Instructor();
		instructor.Name = "Engin Demiro�";
		instructor.Educations = "Java";
		
		UserManager userManager = new UserManager();
		
		User[] users = {student,student2,instructor};
		userManager.multipleAdd(users);
		
		System.out.println("--------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.course(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.educationName(instructor);
		
		System.out.println("--------------------------------");
		
		Student[] students = {student,student2};
		studentManager.MultipleEmail(students);
		
		System.out.println("--------------------------------");
	}
}
