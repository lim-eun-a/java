package ex05method;

import java.util.Scanner;

/*
매서드형태3] 매개변수는 있으나 반환값은 없는 경우
 */

public class E04MethodType03_1
{	
	/*
	 시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는 수를
	 모두 더하여 출력하는 프로그램을 작성하시오.
	 	출력결과]
	 		시작값: 5
	 		종료값: 9
	 		결과: 5+6+7+8+9= ??
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값: ");
		int s = scanner.nextInt();
		System.out.print("종료값: ");
		int e = scanner.nextInt();
		/*
		 반환값이 없는 매서드 이므로 단독적으로 호출만한다.
		 앞에서 입력받은 2개의 정수를 인수(Argument)로 전달한다.
		 */
		myWantSum(s, e);
//		scanner.close();
	}
	
	/*
	 main() 매서드에서 호출시 전달한 2개의 정수를 매개변수가 순서대로 값을 받게된다. 
	 매개변수는 해당 매서드에서 즉시 사용할 수 있다.
	 */
	static void myWantSum(int startNum, int endNum) 
	{
		int sum = 0;
		for(int i=startNum; i<=endNum ; i++) {
			sum +=i;
		}
		System.out.printf("%d~%d까지의 합은: %d", startNum, endNum, sum);
	}

}
