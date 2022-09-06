package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Id= " + id + ", Name= " + name + ", Salary= R$ " + String.format("%.2f", salary);
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(Double percentual) {
		this.salary = this.salary + (this.salary * (percentual/100));
	}
	
}
