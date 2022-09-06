package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer numberEmployes;
		Integer id;
		String name;
		Double salary;
		Double percent;

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many emplyees will be registered? ");
		numberEmployes = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= numberEmployes; i++) {
			
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			id = sc.nextInt();
			
			while (hasId(employees, id)) {
				System.out.print("This Id already exists, type another one: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();

			System.out.println();
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
		}

		System.out.print("Enter the  employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		//Integer pos = idPosition(employees, id);
		Employee emp = employees.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			percent = sc.nextDouble();
			//employees.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
			
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		sc.close();
	}
	
	public static Integer idPosition(List<Employee> list, Integer id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
