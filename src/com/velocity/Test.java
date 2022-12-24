package com.velocity;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int a=number;
		int temp;
		int z = 0;
		while (number > 0) {
			temp = number % 10;
			z = (z * 10) + temp;
			number = number / 10;

		}
		if(a==z) {
			System.out.println("Number is Palindrom");
			
		}else {
			
			System.out.println("Number is Not Palindrom");
		}
	}

}
