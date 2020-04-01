package org.sundar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWorksWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		List<String> e1= employees.stream()
		  .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		 // .filter(employee -> isActive(employee))
		  .limit(3)
		  .map(Employee::getEmpName)
		  .collect(Collectors.toList());

	}

}
