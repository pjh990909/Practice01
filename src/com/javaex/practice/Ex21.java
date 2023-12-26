package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i % 2;
		
		System.out.println(i); //11
		System.out.println(n); //1
		
		/*20과 다른점은 20은 i++이기에 대입후 더하는거라 계산 할때 10으로 계산
		  21은 ++i라서 더하고 대입하기때문에 11로 계산함*/
		
		

	}

}
