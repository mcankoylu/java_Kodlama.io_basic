package javaCampD3H2;

public class Instructor extends User{

	String givenCourses;
	
	public Instructor() {
	
	}

	public Instructor(String givenCourses) {
		
		this.givenCourses = givenCourses;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
}
