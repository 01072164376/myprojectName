package com.human.ex;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("hello");
		System.out.println(" world");

		// 자료형 : 기본자료형(크기 명확,저장된 메모리에 실제 데이터)
		// 자로형 : 참조자료형(
		// 기본자료형 : boolean(1)
		// 정수 : 정수 byte(1),short(2),int(4),long(8)
		// 살수 : floot(4),double(8)
		// 문자 : char(2)

		int a = 5;
		System.out.println(a++);//5
		System.out.println(++a);//7)
		System.out.println(a);//7
		
		System.out.println(--a);//6
		System.out.println(--a);//5
		System.out.println(a--);//5
		System.out.println(a);//4
		
		int b=5;
		b=(true)?6:7;
		System.out.println(b);
		
		int c=5,d=6;
		int sum=c+d;
		c=7;
		System.out.println(sum+":"+c+":"+d+":"); 
		sum=c+d ;
		System.out.println(sum+":"+c+":"+d+":");
		
		int hot=0;
		hot=3*6 ;
		hot=5+hot;
		System.out.println(hot);
		
		int q,w,e;
		q=5+3;
		w=8*6;
		e=48;
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
	
		//2%6+3+(2+5)+3/2 변수 3개 사용

		int a2=2+5;
		int b2=2%6;
		int c2=3/2;
		b2=b2+3;
		System.out.println(b2+a2+c2);
		
//		int a1 = 10000000000l;
//		int a2=12.24;
//		float a3 = 23.5;
		
		
		
		
	}

}
