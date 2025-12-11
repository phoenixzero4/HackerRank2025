package hackerRank2025.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private int id;
	private String email;
	
	public Student(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static void main(String[] args) {
		Class<Student> student = Student.class;
		Method[] methods = student.getDeclaredMethods();
		Field[] fields = student.getDeclaredFields();
		
		ArrayList<String> methodList = new ArrayList<>();
		for(Method m: methods) {
			methodList.add(m.getName());
		}

		Collections.sort(methodList);
		for(String name: methodList) {
			System.out.println(name);
		}
	}

}
