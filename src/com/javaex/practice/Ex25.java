package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		
		int a =13;
		
		System.out.println((a>13)&&(a>=13)); // f&&t f
		System.out.println((a>13)||(a>=13)); // f||t t
		System.out.println((a/3==4)&&(a%3==2)); // t%%f f
		System.out.println((a/3==4)||(a%3==2)); // t||f t
		System.out.println((a/3==4)&&(a%3==2)||(a/3==4)); // t&&f||t f||t t
		
		
		
		
		

	}

}
