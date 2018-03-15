
public class Person {
	
	public static void main (String [] args) {
	}
	
	String name;
	int age;
	String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		
	}
	public void getInfo() {
		
		System.out.println("My name is: " + name);
		System.out.println("I am " + age + " Years old");
		System.out.println("I work as a " + jobTitle);
		
	}
	public String toString() {
		return "My name is: " + name + " I am " + age + " Years old " + " I work as a " + jobTitle;
	}
	
}
