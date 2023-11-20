package ex16exception;

import java.io.IOException;
/*
예외처리방법2
*/
public class Ex03ExceptionCase2
{
	static void compileFunc() {
		try {
			System.out.println("하나의 문자를 입력하세요: ");
			int userChr = System.in.read();
			System.out.println("입력한 문자는: " + (char)userChr);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		compileFunc();
	}
}
