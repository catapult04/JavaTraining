package CoreJava.Chap04.Employee;

public abstract class Person {
	//fields
	private String name;
	
	//setter and getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//constructor
	public Person(String name) {
		this.name = name;
	}
	
	//other methods
	public abstract String getDescription();
}
