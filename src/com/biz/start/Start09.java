package com.biz.start;

public class Start09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	addVar();
	addVar(30);
	addVar(30, 40);
	
	/*
	 * �޼��带 ����ϴ� ����� ���� ������ �����ϹǷ� �ؼ� �̷��ϴ� �����
	 * �����͸� �̷��ϴ� �Ǽ��� �ּ������� �� �� �ִ�
	 * ���� �ڵ� �ۼ���
	 * 
	 */
	}
	
	public static void addVar() {
		System.out.println("���ڸ� �������� ������");
		System.out.println("����� �� �� �����ϴ�.");
	}
	public static void addVar(int intNum) {
		System.out.println("���� 2���� �����ؾ� �մϴ�");

	}

	public static void addVar(int intNum1, int intNum2) {
		System.out.print("�ΰ��� ����");
		System.out.print(intNum1+" ��(��) " +intNum2 +"�� ���ϸ�");
		System.out.println(intNum1 + intNum1 +" �� �ȴ�.");
	}

}
