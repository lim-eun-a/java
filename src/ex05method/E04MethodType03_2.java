package ex05method;

import java.util.Scanner;

public class E04MethodType03_2
{
	/*
	 연습문제] 사용자로부터 2~9사이의 숫자 중 2개를 입력받아
	 그에 해당하는 구구단을 출력하는 메서드를 작성하시오.
	 무조건 첫번째 입력받는 수가 작아야 한다.
	 입력 예]
	 	첫번째숫자: 3
	 	두번째숫자: 12
	 	3*1=3 3*2=6...
	 	...
	 	...... 12*9=108
	 */

	static void inputGugudan(int sNum, int eNum) {
		//2~9단까지 반복 => sNum~eNum단까지 반복
		for(int dan=sNum; dan<=eNum; dan++) {
			// 수에 해당하는 for문(1~9까지 증가)
			for(int su=1; su<=9; su++){
				System.out.printf("%-2d*%-2d=%2d ", dan, su, (dan*su));
			}
			System.out.println(); //줄바꿈
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 단: ");
		int s = scanner.nextInt();
		System.out.print("끝 단: ");
		int e = scanner.nextInt();
		inputGugudan(s,e);
	}

}
