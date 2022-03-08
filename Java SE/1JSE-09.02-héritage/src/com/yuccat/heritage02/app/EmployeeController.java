package com.yuccat.heritage02.app;


import com.yuccat.heritage02.model.Employee;
import com.yuccat.heritage02.model.Manager;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employees [] = new Employee [] {
				new Employee("josé", 1000),
				new Manager("sophie", 1000)
				
		};
		for (Employee e:employees) {
			e.run();
			System.out.println(e);
		}
	}

}
