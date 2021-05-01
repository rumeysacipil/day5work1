package odev3;

public class Instructor extends User {
   String coursName;
 String homework;
 
 

 public Instructor(int id, String firstName, String lastName, String email, String password, String coursName,
		String homework) {
	super(id, firstName, lastName, email, password);
	this.coursName = coursName;
	this.homework = homework;
}


public String getCourseName() {
		return coursName;
	}


	public void setCourseName(String courseName) {
		this.coursName = courseName;
	}


public String getHomework() {
	return homework;
}


public void setHomework(String homework) {
	this.homework = homework;
}

  
  
}
