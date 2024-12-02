package quesBank3;

class Student{
	private static int studentCounter = 0;
	private int enrollNumber;
	private String name;
	public Student(String name) {
		this.name = name;
		this.enrollNumber = ++studentCounter;
	}
	public String toString() {
		return enrollNumber + ":" + name;
	}
}

public class StudentCounter {

}
