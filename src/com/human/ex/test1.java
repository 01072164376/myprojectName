package javapro;

public class test1 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		// 1. 세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 보자.

		int q, w;

		System.out.print("사각형의 세로 >> ");
		q = Integer.parseInt(sc.nextLine());
		System.out.print("사각형의 가로 >> ");
		w = Integer.parseInt(sc.nextLine());
		System.out.println("사각형의 넓이 : " + (q * w));

		// 2. 세로 가로 높이를 입력 받아 사각기둥의 부피를 만드는 순서도와 프로그램을 만들어 보자.

		int a, s, d;

		System.out.print("사각기둥의 세로 >> ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("사각기둥의 가로 >> ");
		s = Integer.parseInt(sc.nextLine());
		System.out.print("사각기둥의 높이 >> ");
		d = Integer.parseInt(sc.nextLine());
		System.out.println("사각기둥의 부피 : " + (a * s * d));

		// 3. a 센치미터가 몇 미터 몇 센치인지 출력하는 프로그램을 구현 하시오.
		System.out.print("z센치 미터는");
		int cm = Integer.parseInt(sc.nextLine());
		System.out.println("z센치 미터는," + cm / 100 + "미터" + cm % 100 + "센치 입니다.");

		// 4. 잔디의 가격은 1 제곱 미터에 a원일 때 윗변이 b,아래변이 c, 높이d인 사다리꼴에 잔디를 심으려면 얼마의 비용이 드는지 구하는
		// 순서도를 작성하시오.

		System.out.print("잔디 1 제곱 미터당 가격 >> ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.print("사다리꼴의 윗변 >> ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("사다리꼴의 아랫변 >> ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("사라디꼴의 높이 >> ");
		int v = Integer.parseInt(sc.nextLine());
		System.out.println("비용 : " + ((n + b) * v / 2) * m + "원");

		// 5. 이름 나이 키를 입력받은 화면에 출력하는 프로그램을 작성해 보자. 출력결과: 당신의 이름은 홍길동 입니다.당신의 나이는 23입니다.
		// 당신의 키는 165.5 입니다.

		System.out.println("이름을 입력하시오. >>");
		String name = (sc.nextLine());
		System.out.println("나이를 입력하시오. >>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("키를 입력하시오. >>");
		double height = Integer.parseInt(sc.nextLine());
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 키는 " + height + "입니다.");

		// 6. 두수를 입력받아 두수의 차를 출력하는 프로그램을 작성해보자.

		System.out.print("첫번째 수를 입력하시오>>");
		int a1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수를 입력하시오>>");
		int a2 = Integer.parseInt(sc.nextLine());
		System.out.println("두수의 차 :" + (a1 - a2));

		// 7. 다음은 국어,영어,수학 점수를 입력 받아 평균을 구하여 다음과 같이 출력하는 프로그램을 만들어보자. 출력결과: 국어:80 영어:70
		// 수학:90 평균:80

		int z1, z2, z3, z4;

		System.out.println("국어점수를 입력하시오>>");
		z1 = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수를 입력하시오>>");
		z2 = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수를 입력하시오>>");
		z3 = Integer.parseInt(sc.nextLine());
		z4 = (z1 + z2 + z3) / 3;
		System.out.println("국어:" + z1 + "영어:" + z2 + "수학" + z3 + "평균:" + z4);

		// 8. 키를 m로 소수점 2째 자리까지 입력받아 cm로 바꿔주는 프로그램을 만들어 보자.
		System.out.print("키를 m로 소수점 2째 자리까지 입력 >> ");
		height = Double.parseDouble(sc.nextLine());
		height *= 100;
		System.out.println((int) height + "cm입니다.");

		// 9. 상장의 가로, 세로, 높이를 입력받아 부피를 구하는 프로그램을 만들어 보자.
		System.out.print("상장의 가로 입력하시오 >> ");
		int q1 = Integer.parseInt(sc.nextLine());
		System.out.print("상장의 세로 입력하시오 >> ");
		int q2 = Integer.parseInt(sc.nextLine());
		System.out.print("상장의 높이 입력하시오 >> ");
		int q3 = Integer.parseInt(sc.nextLine());
		System.out.println("상장의 부피는" + (q1 * q2 * q3) + "입니다");

		// 10. 연필 한박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원 이다. 소비자가 몇 박스의 연필과 몇자루의 연필을 구매할 것인지
		// 입력 받아 계산해주는 프로그램을 만들어보자.
		System.out.println("구매할 연필의 개수를 입력하시오. >>");
		int p1 = Integer.parseInt(sc.nextLine());
		System.out.println("박스:" + (p1 / 12) + " 자루:" + p1 + " 금액:" + (p1 * 1000));

	}

}
