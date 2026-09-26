package DesignPatterns.CreationalPatterns.PrototypePattern;

public class Employee implements Prototype<Employee>{
	private String name;
	private String role;
	
	
	public Employee(String name, String role) {
//		super();
		this.name = name;
		this.role = role;
	}
	
	public Employee clone() {
		return new Employee(this.name,this.role);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + "]";
	}
	
	

}
