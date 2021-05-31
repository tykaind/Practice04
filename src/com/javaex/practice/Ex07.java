package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] my = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] my2 = new int[10];
		Scanner sc =  new Scanner(System.in);
		System.out.println("금액: ");
		int num = sc.nextInt();
		
		for(int i=0; i<my.length; i++) {
		
				my2[i] = num / my[i];
				num = num % my[i];
				System.out.println(my[i]+"원:"+my2[i]+"개");
		}
		sc.close();
	}

}
