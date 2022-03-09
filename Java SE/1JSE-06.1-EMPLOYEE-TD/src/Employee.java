
public class Employee {

	//private static final monthlyPay = 2200;
	private String name ;
	private String lastname ;
	private String society ;
	private int age ;
	private int monthlyPay ;
	
	private int annualPay ; // OUT

	
	public Employee(String name, String lastname, String society, int age, int monthlyPay) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.society = society;
		this.age = age;
		this.monthlyPay = monthlyPay;
	}


	public void run() {
		this.annualPay = society.equalsIgnoreCase("ORANGE") ?  monthlyPay * 13 : monthlyPay * 12;
	}
	
	public void coopt(Employee emp) {
		this.annualPay += 1000;
		emp.society = this.society;
		emp.run();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getSociety() {
		return society;
	}


	public void setSociety(String society) {
		this.society = society;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMonthlyPay() {
		return monthlyPay;
	}


	public void setMonthlyPay(int monthlyPay) {
		this.monthlyPay = monthlyPay;
	}


	public int getAnnualPay() {
		return annualPay;
	}


	public void setAnnualPay(int annualPay) {
		this.annualPay = annualPay;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", society=" + society + ", age=" + age
				+ ", monthlyPay=" + monthlyPay + ", annualPay=" + annualPay + "]";
	}

	
}
