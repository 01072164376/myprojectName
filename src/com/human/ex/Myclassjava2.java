package com.human.ex;

public class Myclassjava2 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수입력>>");
		String st = sc.nextLine();
		System.out.println(st);
		int i = Integer.parseInt(st);
		System.out.println(i);

		int q,w;

		System.out.print("사각형의 세로 >> ");
		q = Integer.parseInt(sc.nextLine());
		System.out.print("사각형의 가로 >> ");
		w = Integer.parseInt(sc.nextLine());
		System.out.println("사각형의 넓이 : " + (q * w));
           
           int a,s,d;

System.out.print("사각기둥의 세로 >> ");
a = Integer.parseInt(sc.nextLine());
System.out.print("사각기둥의 가로 >> ");
s = Integer.parseInt(sc.nextLine());
System.out.print("사각기둥의 높이 >> ");
d = Integer.parseInt(sc.nextLine());
System.out.println("사각기둥의 부피 : " + (a * s * d));

System.out.print("z센치 미터는");
int cm = Integer.parseInt(sc.nextLine());
System.out.println("z센치 미터는,"+cm/100+"미터"+cm%100+"센치 입니다.");

System.out.print("잔디 1 제곱 미터당 가격 >> ");
int m = Integer.parseInt(sc.nextLine());
System.out.print("사다리꼴의 윗변 >> ");
int n = Integer.parseInt(sc.nextLine());
System.out.print("사다리꼴의 아랫변 >> ");
int b = Integer.parseInt(sc.nextLine());
System.out.print("사라디꼴의 높이 >> ");
int v = Integer.parseInt(sc.nextLine());
System.out.println("비용 : "+((n+b)*v/2)*m+ "원");

System.out.println("이름을 입력하시오. >>");
String name=sc.nextLine();
System.out.println("나이를 입력하시오. >>");
int age=Integer.parseInt(sc.nextLine());
System.out.println("키를 입력하시오. >>");
double height=Integer.parseInt(sc.nextLine());
System.out.println("당신의 이름은 "+name +"입니다.");
System.out.println("당신의 나이는 "+age +"입니다.");
System.out.println("당신의 키는 "+height +"입니다.");


System.out.print("첫번째 수를 입력하시오>>");
int a1=Integer.parseInt(sc.nextLine());
System.out.print("두번째 수를 입력하시오>>");
int a2=Integer.parseInt(sc.nextLine());
System.out.println("두수의 차 :"+(a1-a2));

int z1,z2,z3,z4 ;
System.out.println("국어점수를 입력하시오>>");
z1=Integer.parseInt(sc.nextLine());
System.out.println("영어점수를 입력하시오>>");
z2=Integer.parseInt(sc.nextLine());
System.out.println("수학점수를 입력하시오>>");
z3=Integer.parseInt(sc.nextLine());
z4=(z1+z2+z3)/3;
System.out.println("국어:"+z1+"영어:"+z2+"수학"+z3+"평균:"+z4);


System.out.print("키를 m로 소수점 2째 자리까지 입력 >> ");
height = Double.parseDouble(sc.nextLine());
height *= 100;
System.out.println((int)height + "cm입니다.");

System.out.print("상장의 가로 입력하시오 >> ");
int q1=Integer.parseInt(sc.nextLine());
System.out.print("상장의 세로 입력하시오 >> ");
int q2=Integer.parseInt(sc.nextLine());
System.out.print("상장의 높이 입력하시오 >> ");
int q3=Integer.parseInt(sc.nextLine());
System.out.println("상장의 부피는"+(q1*q2*q3)+"입니다");

 
	}
}
