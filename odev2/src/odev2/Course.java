package odev2;

public class Course {
	public Course() {
		System.out.println("Constructor �al���yormu");
		}
	
	public Course (int id, String name, String information ) {
	this.id = id;
	this.name = name;
	this.information = information;
	}
	
	
	int id;
	String name;
	String information;
	

}
