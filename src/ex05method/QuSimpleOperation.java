package ex05method;

import java.util.Scanner;

/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 
단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
 */

public class QuSimpleOperation
{

	static void arithmetic(int a, int b) {
		System.out.println("덧셈결과 -> " + (a+b));
		System.out.println("뺄셈결과 -> " + (a-b));
		System.out.println("곱셈결과 -> " + (a*b));
		System.out.println("나눗셈 몫 -> " + (a/b));
		System.out.println("나눗셈 나머지 -> " + (a%b));
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = scanner.nextInt();
		arithmetic(num1, num2);
	}

}
