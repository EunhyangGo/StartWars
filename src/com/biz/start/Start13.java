package com.biz.start;

public class Start13 {
	public static void main(String[] args) {
		for(int i=5; i < 100; i++){
			triAngle(i);
	 }
		
	}
public static void triAngle(int intStartCount) {
		
	if(intStartCount > 10) {
		System.out.println("별은 10개까지만 찍을 수 있음");
		// method내의 코드가 실행되는 동안 return문을 만나면
		// 그 자리에서 더이상 진행되지 않고
		// method를 중단하고 호출, 실행한 곳으로 돌아간다.
		return;
	}
		
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
