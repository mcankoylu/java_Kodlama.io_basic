package javaCampD3H2;

public class InstructorManager {

	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " Yeni Olusturulan Kurs  " + instructor.getGivenCourses());
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " Silinen Kurs  " + instructor.getGivenCourses());
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " Guncellenen Kurs" + instructor.getGivenCourses());
	}
}
