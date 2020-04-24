package MyHomeWork200407;

public class MyHomeWork0 {
	public String name;
	int age;
	int salary;
	
	public MyHomeWork0(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String returnName() {
		return name;
	}
	public int returnAge() {
		return age;
	}
	public int returnSalary() {
		return salary;
	}
	public int returnAge10() {
		return age+10;
	}
	public int returnSalaryParam(int x) {
		return salary + x;
	}
	
}
