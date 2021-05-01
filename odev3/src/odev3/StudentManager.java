package odev3;

public class StudentManager {
	
public void record(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursuna kayýt yaptýnýz");
}
public void exit(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursundan ayrýldýnýz");
}
public void uploadinghomework(Instructor instructor)
{
	System.out.println(instructor.getHomework()+ " ödevi yüklediniz");
}

}
