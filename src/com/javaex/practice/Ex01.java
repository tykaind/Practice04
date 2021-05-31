package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		//intArray배열에 저장되있는 값을 result에 다더해서 출력해준다.
		int[] intArray = new int[5];
		intArray[0] =3;
		intArray[1] =7;
		intArray[2] =12;
		intArray[3] =13;
		intArray[4] =14;
		
		int result = 0;
		
		for(int i=0; i< intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
