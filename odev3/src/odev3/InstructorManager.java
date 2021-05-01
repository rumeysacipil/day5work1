package odev3;

public class InstructorManager {
public void addcourse(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursunu eklediniz");
}
public void deletecourse(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursunu sildiniz");
}
public void addedHomework(Instructor instructor) {
	System.out.println(instructor.getHomework()+" ödevi yüklendi");
}
}
