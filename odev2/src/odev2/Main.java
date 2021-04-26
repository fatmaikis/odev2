package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course (1, "C# Yazýlým Geliþtirme Kampý","Oldukça faydalý bir kamp olacaktýr." );
		//course1.id = 1;
		//course1.name = "C# Yazýlým Geliþtirme Kampý";
		//course1.information = "Oldukça faydalý bir kamp olacaktýr. ";
		
		Course course2 = new Course();
		course2.id =2;
		course2.name = "Java Yazýlým Geliþtirme Kampý";
		course2.information = "Oldukça faydalý bir kamp olacaktýr.";
		
		
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			System.out.println(course.name);
		
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "C#";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Java";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);
		

	}

}
