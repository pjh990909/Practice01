package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요:");
		double dol = sc.nextDouble();
		System.out.println("받으실 달러는 " + dol/1230.95);
		
		
		sc.close();
		
	
		

	}

}
