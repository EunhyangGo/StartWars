package com.biz.start;

public class Start12 {

	public static void main(String[] args) {
	
		
		triAngle(3); 
		for(int i = 5; i <=20; i++) {
			triAngle(i);
		}
	}
	public static void triAngle(int intStartCount) {
		
		
		// int intStartCount = 5;
		for(int j = 0; j< intStartCount; j++) {
			for(int i = j; i<intStartCount; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k <j ; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
	} 
	} // end triangle

	}

