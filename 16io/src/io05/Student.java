package io05;

import java.io.Serializable;

//ObjectOutputStream을 사용하기 위한 예제 1
public class Student implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1203922257670479520L; //add generate serial version ID 를 통해 직렬화 아이디 생성
//인터페이스 Serializable을 구현하면 직렬화가 가능한 객체가 됨
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "[name = "+name+", age = "+age+"]";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
