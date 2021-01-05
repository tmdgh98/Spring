package co.ho.student;

import java.util.ArrayList;

public class Student {
	private String name;
	private String age;
	private ArrayList<String> hobbys;
	private String height;
	
	public Student(String name, String age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	public String toString() {
		System.out.println("학생명 : "+name);
		System.out.println("나   이 : "+age);
		System.out.println("취   미 : "+hobbys);
		System.out.println("신   장 : "+height);
		return null;
	}
}
