package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05Finally
{

	static void runtime() throws NumberFormatException{
		Integer.parseInt("백");
	}
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = -1;
		try {
			age = scan.nextInt();
			System.out.println("당신은 5년후 " + (age+5) + "살 입니다.");
			return;
		}
		catch(InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요");
		}
		
		finally {
			System.out.println("항상 실행되는 finally절 입니다.");
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		try {
			runtime();
		} 
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		tryCatchFinally();
		
		// finally절에서 exit(0)이 실행되므로 아래 문장은 실행되지 않는다.
		System.out.println("메인메소드 끝");
	}

}
