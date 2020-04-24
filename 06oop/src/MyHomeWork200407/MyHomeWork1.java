package MyHomeWork200407;

public class MyHomeWork1 {
	String name;
	int age;
	int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	
	public int getAge10() {
		return age + 10;
	}
	public int getSalaryParam(int x) {
		return salary + x;
	}
}
