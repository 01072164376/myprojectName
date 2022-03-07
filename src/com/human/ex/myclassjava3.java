package com.human.ex;

public class myclassjava3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수입력>>");
		String st = sc.nextLine();
		System.out.println(st);
		int i = Integer.parseInt(st);
		System.out.println(i);

		double hheight;

		System.out.print("키를 m로 소수점 2째 자리까지 입력 >> ");
		hheight = Double.parseDouble(sc.nextLine());
		hheight *= 100;
		System.out.println((int) hheight + "cm입니다.");
		System.out.println();

		System.out.print("상장의 가로 입력하시오 >> ");
		int q1 = Integer.parseInt(sc.nextLine());
		System.out.print("상장의 세로 입력하시오 >> ");
		int q2 = Integer.parseInt(sc.nextLine());
		System.out.print("상장의 높이 입력하시오 >> ");
		int q3 = Integer.parseInt(sc.nextLine());
		System.out.println("상장의 부피는" + (q1 * q2 * q3) + "입니다");

		System.out.println("구매할 연필의 개수를 입력하시오. >>");
		int p1 = Integer.parseInt(sc.nextLine());
		System.out.println("박스:" + (p1 / 12) + " 자루:" + p1 + " 금액:" + (p1 * 1000));

	}
}
