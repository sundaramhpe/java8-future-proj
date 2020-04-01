package org.sundar;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal methds
		int[] numbers = {4,8,12,5,3,2,0,70,90};
		int min = numbers[0];
		for(int i= 1;i<numbers.length;i++) {
			if(min>numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("Minimum is:"+ min);
		
		// java8
		int minm = IntStream.of(numbers).min().getAsInt(); // carefull if value is there return otherwise throw as error.
	     IntStream.of(numbers)
				   .min()
				   .ifPresent(m -> System.out.println(m)); 
	     
	     // instance of keep calling instance again and again to avoid that function call summary statistics
	    /* IntStream.of(numbers).max().ifPresent(m -> System.out.println("Max :"+m)); 
	     IntStream.of(numbers).average().ifPresent(m -> System.out.println("Average :"+m)); 
	      IntStream.of(numbers).count();
	      IntStream.of(numbers).sum();*/
	     
	     //statistics
	    IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
	    System.out.println(statistics.getMin());
	    System.out.println(statistics.getMax());
	    System.out.println(statistics.getAverage());
	    System.out.println(statistics.getCount());
	    System.out.println(statistics.getSum());
	    
	     
	     // Static method referance
	     IntStream.of(numbers)
		   .min()
		   .ifPresent(System.out::println); 
		
		System.out.println("Minimum :"+minm);
		
		
		

	}

}
