package com.biz.start;

public class Start08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNum();
		addNum(30);
		addNum(9);
		addNum(3,4);

	}
	
	public static void addNum() {
		System.out.println("�Ű� ������ ���� method");
		
	}
	
	public static void addNum(int intNum) {
		if(intNum > 10) {
			System.out.println("10���� ū ���� �Ű� ����");
		}else {
			System.out.println("10������ �Ű� ����");
		}

	}
	public static void addNum(int intNum1, int intNum2) {
		System.out.println(intNum1 + intNum2);
		} 
}

/*
 * method�� ������ �� ���� class ���ο����� ��Ģ������ ������ ���� ���� �̸���
 * method�� ����(����)�� �� ����.
 * 
 * ������ JAVA������(java�� Ư¡ �� 1������) �Ű������� ������ �ٸ��� ���� �̸��� method�� ���� �� �� �ִ�. 
 * => �ߺ�����(OverLoading) �����̶�� �Ѵ�.
 */













