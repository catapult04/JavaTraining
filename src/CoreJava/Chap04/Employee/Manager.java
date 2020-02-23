package CoreJava.Chap04.Employee;

public class Manager extends Employee{
	private double bonus;
	
	public void setBonus(double vbonus) {
		this.bonus = vbonus;
	}
	public double getBonus() {
		return this.bonus;
	}

	public Manager(String name, double salary, int year, int month, int day, double bonus) {
		super(name, salary, year, month, day);
		this.bonus = bonus;
	}
	
	//other methods
	public double getSalary() {
		return super.getSalary() + this.bonus;
	}
	public String getDescription() {
		return "An manager with a salary of $" + this.getSalary(); 
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
				&& this.getSalary() == other.getSalary()
				&& this.getHireDay().equals(other.getHireDay());
	}
}
