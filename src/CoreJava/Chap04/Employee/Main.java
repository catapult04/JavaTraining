package CoreJava.Chap04.Employee;

public class Main {
	public static void main(String [] args) {	
		Employee s1 = new Employee("Minh", 2000, 2020, 1, 1);
		Employee s2 = new Employee("Minh", 2000, 2020, 1, 1);
		Main.println("Result: " + s1.equals(s2));
		
		
	}
	
	///////////////////////////
	public static void println(String content) {
		System.out.println(content);
	}
	public static void print(String content) {
		System.out.print(content);
	}
}


















