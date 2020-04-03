package org.sundar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamWorksWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> getAllemployees = Arrays.asList(
	                new Employee(100,"Sundar",45000.00),
	                new Employee(101,"ram",55000.00),
	                new Employee(102,"krishna",75000.00),
	                new Employee(103,"rahim",85000.00),
	                new Employee(104,"edwin",10000.00)
	       );
		
		/*List<Employee> employees = new ArrayList<Employee>(getAllemployees);
		//sort Decending 
		//employees.sort((e1,e2)-> e2.getSalary() - e1.getSalary());
		
		// get first 3 data
		for(int i=0;i<3;i++) {
			Employee e = employees.get(i);
			System.out.println(e.getEmpName());
		}*/
		
		
		
		List<String> e1= getAllemployees.stream()
		  .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		 // .filter(employee -> isActive(employee))
		  .limit(3)
		  .map(Employee::getEmpName)
		  .collect(Collectors.toList());
		
		e1.forEach(System.out::println);

	}
	

}
