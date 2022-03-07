package com.human.ex;

public class myclassjava3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�����Է�>>");
		String st = sc.nextLine();
		System.out.println(st);
		int i = Integer.parseInt(st);
		System.out.println(i);

		double hheight;

		System.out.print("Ű�� m�� �Ҽ��� 2° �ڸ����� �Է� >> ");
		hheight = Double.parseDouble(sc.nextLine());
		hheight *= 100;
		System.out.println((int) hheight + "cm�Դϴ�.");
		System.out.println();

		System.out.print("������ ���� �Է��Ͻÿ� >> ");
		int q1 = Integer.parseInt(sc.nextLine());
		System.out.print("������ ���� �Է��Ͻÿ� >> ");
		int q2 = Integer.parseInt(sc.nextLine());
		System.out.print("������ ���� �Է��Ͻÿ� >> ");
		int q3 = Integer.parseInt(sc.nextLine());
		System.out.println("������ ���Ǵ�" + (q1 * q2 * q3) + "�Դϴ�");

		System.out.println("������ ������ ������ �Է��Ͻÿ�. >>");
		int p1 = Integer.parseInt(sc.nextLine());
		System.out.println("�ڽ�:" + (p1 / 12) + " �ڷ�:" + p1 + " �ݾ�:" + (p1 * 1000));

	}
}
