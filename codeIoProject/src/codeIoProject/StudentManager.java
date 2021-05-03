package codeIoProject;

public class StudentManager {
	public void course(User user) {
		System.out.println(user.Name + " Aldığın Eğitimler: " + user.Educations);
	}
	
	public void AddEmail(Student student) {
		System.out.println(student.Name + " kişisinin email adresi: " + student.email);
	}

	public void MultipleEmail(Student[] students) {
		for (Student student : students) {
			AddEmail(student);
		}
	}
	
}
