package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int b = sc.nextInt();
		System.out.print("100원 개수: ");
		int n = sc.nextInt();
		System.out.print("50원 개수: ");
		int s = sc.nextInt();
		System.out.print("10원 개수: ");
		int vs = sc.nextInt();
		System.out.println("동전의 총합은 " + (b*500+n*100+s*50+vs*10) + "원 입니다.");
		
		sc.close();

	}

}
