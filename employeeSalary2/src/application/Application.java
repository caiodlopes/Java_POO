package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Application {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		//Calendar cal = Calendar.getInstance();
		
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker: ");
		int numberOfContracts = sc.nextInt();
		
		
		for (int i = 0; i < numberOfContracts; i++) {
			
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYY): ");
			Date date = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours):");
			int duration = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		//Date date = sdf2.parse(sc.next());
		//cal.setTime(date);
		//date = cal.getTime();
		//double income = worker.income(cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
		
		
		sc.close();
	}

}
