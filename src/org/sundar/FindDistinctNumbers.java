package org.sundar;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FindDistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {4,8,12,5,3,2,0,70,90};
		
		// normal 
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		 Arrays.sort(copy);
		 
		 // pick first three values if distinct it more complicated
		 for(int i=0;i<3;i++) {
			 System.out.println("First three values: "+copy[i]);
		 }
		 
		 //java8 method chainning for complecated logics the original arrays not muttated 
		 IntStream.of(numbers)
		 .distinct()
		 .sorted()
		 .limit(3)
		 .forEach(System.out::println);
		 
		 // apply all the values
		 IntStream.of(numbers)
		 .distinct()
		 .sorted();
		 //.sum() or .min() or max() or count() or average();
		 
		 //three distinct part of streem 1. Create 2. process  3. consume 
		 IntStream.of(numbers) // creating the sttreem 
		 .distinct()  // process the streem appling the logic or algorithem for sort of filtering 
		 .sorted() // process the stream
		 .limit(3) // process the stream 
		 .forEach(System.out::println); // consume the stream using the process values
		 
		 // range 
		 IntStream.range(1, 100)
		    .forEach(System.out::println);
		 
		 //collect the array
		 IntStream.range(1, 100)
		    .toArray();
		//collect in to List
		 IntStream.range(1, 100)
		    .boxed().collect(Collectors.toList());
		 
		//collect the  any match pridicate
		 IntStream.of(numbers)
		    .anyMatch(n->n%2==1);
		 
		//collect the all match
		 IntStream.of(numbers)
		    .allMatch(n->n%2==1);
		 
		 
		 
		 

	}

}
