package javaCampD3H2;

public class User {
	
	int id;
	String name;
	String lastName;
	String Email;

public User() {
	
}
public User(int id, String name, String lastName,String Email) {
	
	super();
	this.id=id;
	this.name=name;
	this.lastName=lastName;
	this.Email=Email;
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}




}