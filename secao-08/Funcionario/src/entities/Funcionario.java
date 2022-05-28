package entities;

public class Funcionario {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary () {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * (percentage / 100);
	}
	
	public String toString () {
		return name + ", $ " + this.netSalary();
	}
}
