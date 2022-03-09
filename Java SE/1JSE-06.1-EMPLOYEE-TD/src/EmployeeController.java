
public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employees [] = {
				new Employee ("José", "Sijpuidir", "FNAC", 31, 1500),
				new Employee ("Sophie", "Dupont", "ORANGE", 24, 2000),
				new Employee ("Patrick", "Apeupres", "FNAC", 45, 2000),
		};
		for (Employee e:employees) {
			e.run();
			System.out.println(e);
		}
		employees[1].coopt(employees[0]);
		
		for (Employee e:employees) {
			System.out.println("après cooptation sophie et josé percoivent " + e);
		}
	}

}
