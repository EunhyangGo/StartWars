package com.biz.start;

public class Start13 {
	public static void main(String[] args) {
		for(int i=5; i < 100; i++){
			triAngle(i);
	 }
		
	}
public static void triAngle(int intStartCount) {
		
	if(intStartCount > 10) {
		System.out.println("���� 10�������� ���� �� ����");
		// method���� �ڵ尡 ����Ǵ� ���� return���� ������
		// �� �ڸ����� ���̻� ������� �ʰ�
		// method�� �ߴ��ϰ� ȣ��, ������ ������ ���ư���.
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
