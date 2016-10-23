package com.calculatrice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int number, rest;
		
		Scanner input = new Scanner(System.in);		
		ArrayList<Integer> divisor = new ArrayList<>();
		
		
		System.out.println("Enter a number");
		number = input.nextInt();
		
		for (int i = 2; i < Math.sqrt(number); i++) {
			rest = number % i;
			
			if (rest == 0) {
				divisor.add(i);
			} 
		}
		
		if (divisor.size()== 0){
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}
	
	}

}
