package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println(13/5); // 1
		System.out.println((double)13/5); // 2
		System.out.println(13/(double)5); // 3
		System.out.println((double)13/(double)5); // 4
		System.out.println(13.0/5); // 5
		System.out.println(13/5.0); // 6
		System.out.println((double)(13/5)); // 7
		
		/*1,7 1번은 정수로만 이루어져 있어서 실수로 표현이 안됨
		 7번은 1번과 같이 정수로만 이루어져 있는 부분이 계산되고 실수로
		 바뀐거라서 값이 다름*/
		

	}

}
