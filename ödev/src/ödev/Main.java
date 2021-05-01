package ödev;


public class Main {

	
	   
	public static void main(String[] args) {
		
		Course course1=new Course(1, "Engin Demiroð", "Java geliþtirici yetiþtirme kursu(java+react)", 32);
		Course course2=new Course(2, "Engin Demiroð", "yazýlým geliþtirici yetiþtirme kursu", 12);
		Course course3=new Course(3, "Engin Demiroð", "Programlamaya giriþ için temel kursu ", 25);
		System.out.println("KURSLAR");
		Course[] courses= {course1,course2,course3};
		for (Course course :courses ) {
		
			System.out.println(course.name+"%"+course.percent+"tamamlandý");
			System.out.println("Eðitmen:"+course.instructor);
			System.out.println("\t");
		}
		CourseManager courseManager=new CourseManager();
		courseManager.record(course1);
		courseManager.exit(course3);
		System.out.println("\t");
		
		instructor instructor1=new instructor(1, "Engin Demiroð");
		instructor[]instructors= {instructor1};
		for(instructor Instructer:instructors) {
			System.out.println("Eðitmen="+Instructer.name);
		}
		System.out.println("\t");
		
		
	}

}
