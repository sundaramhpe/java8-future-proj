package org.sundar;

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
		int minm = IntStream.of(numbers).min().getAsInt();
		System.out.println("Minimum :"+minm);
		
		
		

	}

}
