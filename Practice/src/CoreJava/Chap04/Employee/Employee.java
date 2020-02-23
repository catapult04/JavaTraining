package CoreJava.Chap04.Employee;

public class Employee extends Person {
	//instance fields
	private double salary = 0;
	private Date hireDay = null;
	
	//constructor
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		this.hireDay = new Date(year, month, day);		
	}
	public Employee() {
		this("", 0 , 2020, 1, 1);
	}
	//getter setter
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
	//other methods
	public void raiseSalary(double x) {
		this.salary = this.salary*(1+x/100);
	}	
	public static void tripleSalary(Employee x) {
		x.salary = x.salary*3;
	}
	public String getDescription() {
		return "An employee with a salary of $" + this.getSalary(); 
	}
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are identical
		if (this == otherObject) return true;
		
		// must return false if the explicit parameter is null
		if (otherObject == null) return false;
		
		// if the classes don't match, they can't be equal
		if (getClass() != otherObject.getClass())
			return false;
		
		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;
		
		// test whether the fields have identical values
		return this.getName().equals(other.getName())
			&& salary == other.salary
			&& hireDay.equals(other.hireDay);
	}
}