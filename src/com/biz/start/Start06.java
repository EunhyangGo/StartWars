package com.biz.start;

public class Start06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		triAngle(5); //���� 5��¥��
		triAngle(7); //���� 7��¥��
		triAngle(10); //���� 10��¥��
		
	} //end main
	// method�� �����ϸ鼭 ()�ȿ� ���� ������ �θ� �� method�� ���(ȣ��, call, ����)�Ҷ�
	// method(��) ���·� �ڵ带 �ۼ��Ѵ�.
	// ���� void method(int a)���¶�� �ϸ� ����Ҷ��� method(3)�̶�� �ۼ��ϸ�
	// java�� method(int a =3)�̶�� �������� �ٽ� ������ �Ѵ�.
	// ��ġ method ���ο��� int a =3�̶�� ������ ����, �����ѰͰ� ����.
	
	// �̶� method()���� ����� ������ ȣ���ϴ� ������ ������ ���� method�� �����ϴ� �Ű�ü ������ �Ѵ�.
	// �� ������ �Ű�����(���� �����ϴ� ������)��� �θ���.
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
