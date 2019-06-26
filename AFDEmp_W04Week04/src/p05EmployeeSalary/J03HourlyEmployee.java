package p05EmployeeSalary;

public class J03HourlyEmployee extends J01Employee implements Payable{
	private int hours;
	private double rate;

	public J03HourlyEmployee() {
		super();
		
	}

	public J03HourlyEmployee(String s, String n, String id, String ib, String jd, int h, double r) {
		super(s, n, id, ib, jd);
		hours = h;
		rate = r;
	}

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", rate=" + rate + "]";
	}
	
	public double pay() {
		return hours * rate;
		
	}

	
	
}
