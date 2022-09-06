package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public Double income(Integer month, Integer year) {
		Double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract contract : this.contracts) {
			cal.setTime(contract.getDate());
			int contractYear = cal.get(Calendar.YEAR);
			//o mês no calendar começa com 0, então tem que somar 1
			int contractMonth = 1 + cal.get(Calendar.MONTH);
			if(contractYear == year && contractMonth == month) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
}
