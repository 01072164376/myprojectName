package com.human.ex;

public class Myclassjava2 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�����Է�>>");
		String st = sc.nextLine();
		System.out.println(st);
		int i = Integer.parseInt(st);
		System.out.println(i);

		int q,w;

		System.out.print("�簢���� ���� >> ");
		q = Integer.parseInt(sc.nextLine());
		System.out.print("�簢���� ���� >> ");
		w = Integer.parseInt(sc.nextLine());
		System.out.println("�簢���� ���� : " + (q * w));
           
           int a,s,d;

System.out.print("�簢����� ���� >> ");
a = Integer.parseInt(sc.nextLine());
System.out.print("�簢����� ���� >> ");
s = Integer.parseInt(sc.nextLine());
System.out.print("�簢����� ���� >> ");
d = Integer.parseInt(sc.nextLine());
System.out.println("�簢����� ���� : " + (a * s * d));

System.out.print("z��ġ ���ʹ�");
int cm = Integer.parseInt(sc.nextLine());
System.out.println("z��ġ ���ʹ�,"+cm/100+"����"+cm%100+"��ġ �Դϴ�.");

System.out.print("�ܵ� 1 ���� ���ʹ� ���� >> ");
int m = Integer.parseInt(sc.nextLine());
System.out.print("��ٸ����� ���� >> ");
int n = Integer.parseInt(sc.nextLine());
System.out.print("��ٸ����� �Ʒ��� >> ");
int b = Integer.parseInt(sc.nextLine());
System.out.print("������� ���� >> ");
int v = Integer.parseInt(sc.nextLine());
System.out.println("��� : "+((n+b)*v/2)*m+ "��");

System.out.println("�̸��� �Է��Ͻÿ�. >>");
String name=sc.nextLine();
System.out.println("���̸� �Է��Ͻÿ�. >>");
int age=Integer.parseInt(sc.nextLine());
System.out.println("Ű�� �Է��Ͻÿ�. >>");
double height=Integer.parseInt(sc.nextLine());
System.out.println("����� �̸��� "+name +"�Դϴ�.");
System.out.println("����� ���̴� "+age +"�Դϴ�.");
System.out.println("����� Ű�� "+height +"�Դϴ�.");


System.out.print("ù��° ���� �Է��Ͻÿ�>>");
int a1=Integer.parseInt(sc.nextLine());
System.out.print("�ι�° ���� �Է��Ͻÿ�>>");
int a2=Integer.parseInt(sc.nextLine());
System.out.println("�μ��� �� :"+(a1-a2));

int z1,z2,z3,z4 ;
System.out.println("���������� �Է��Ͻÿ�>>");
z1=Integer.parseInt(sc.nextLine());
System.out.println("���������� �Է��Ͻÿ�>>");
z2=Integer.parseInt(sc.nextLine());
System.out.println("���������� �Է��Ͻÿ�>>");
z3=Integer.parseInt(sc.nextLine());
z4=(z1+z2+z3)/3;
System.out.println("����:"+z1+"����:"+z2+"����"+z3+"���:"+z4);


System.out.print("Ű�� m�� �Ҽ��� 2° �ڸ����� �Է� >> ");
height = Double.parseDouble(sc.nextLine());
height *= 100;
System.out.println((int)height + "cm�Դϴ�.");

System.out.print("������ ���� �Է��Ͻÿ� >> ");
int q1=Integer.parseInt(sc.nextLine());
System.out.print("������ ���� �Է��Ͻÿ� >> ");
int q2=Integer.parseInt(sc.nextLine());
System.out.print("������ ���� �Է��Ͻÿ� >> ");
int q3=Integer.parseInt(sc.nextLine());
System.out.println("������ ���Ǵ�"+(q1*q2*q3)+"�Դϴ�");

 
	}
}
