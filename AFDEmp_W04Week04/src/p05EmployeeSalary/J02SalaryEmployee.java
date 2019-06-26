package p05EmployeeSalary;

public class J02SalaryEmployee extends J01Employee implements Payable{
	private double salary;

	public J02SalaryEmployee() { }

	public J02SalaryEmployee(String s, String n, String id, String ib, String jd, double sal) {
		super(s, n, id, ib, jd);
		salary = sal;
		}

	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}
	
	
	
	public double pay() {
		return salary;
	}
	
	

}
