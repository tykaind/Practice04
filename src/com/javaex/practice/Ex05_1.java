package com.javaex.practice;

import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {
		int j = 0;
		double k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 입력해주세요");
		for(int i=0; i<5; i++) {
			j = sc.nextInt();
			k +=(double)j;
		}
		System.out.println("평균은 "+k/5+" 입니다.");
		sc.close();
	}

}
