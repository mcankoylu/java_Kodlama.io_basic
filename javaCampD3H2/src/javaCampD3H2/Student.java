package javaCampD3H2;

public class Student extends User {

		String requestedCourses;
		
		public Student() {
			
			
		}
		
public Student(String requestedCourses) {
			super();
			this.requestedCourses=requestedCourses;
					
		}

public String getRequestedCourses() {
	return requestedCourses;
}

public void setRequestedCourses(String requestedCourses) {
	this.requestedCourses = requestedCourses;
}

		
}
