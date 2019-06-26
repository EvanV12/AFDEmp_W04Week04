package p05EmployeeSalary;

public abstract class J01Employee {
	private String name;
	private String surname;
	private String id;
	private String insuranceBody;
	private String jobDesc;
	
	
	public J01Employee() {	}
	
	public J01Employee(String s, String n, String id, String ib, String jd) {
		name = s;
		surname = n;
		this.id = id;
		insuranceBody = ib;
		jobDesc = jd;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInsuranceBody() {
		return insuranceBody;
	}
	public void setInsuranceBody(String insuranceBody) {
		this.insuranceBody = insuranceBody;
	}

	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", id=" + id + ", insuranceBody=" + insuranceBody
				+ ", jobDesc=" + jobDesc + "]";
	}
	
	
	public abstract double pay();
	
	
	
	
	
	
	

}
