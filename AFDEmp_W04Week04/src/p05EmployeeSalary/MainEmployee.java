package p05EmployeeSalary;

public class MainEmployee {

	public MainEmployee() { }

	public static void main(String[] args) {
		
		J01Employee h;
		
		J03HourlyEmployee h1 = new J03HourlyEmployee();
		h1.setName("Joe");
		h1.setSurname("Black");
		h1.setId("24");
		h1.setInsuranceBody("Example1");
		h1.setJobDesc("Hourly Man");
		h1.setHours(48);
		h1.setRate(33.4);
		
		
		J01Employee h2 = new J03HourlyEmployee("Jimmy", "Novak", "4000", "Example2", "Hourly Man", 96, 44.7);
		
		h = h1;
		h.pay();
		
		System.out.println(h.toString());
		System.out.println(h.pay());
		
		h = h2;
		
		
		System.out.println(h.toString());
	}

}
