package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("하나의 문자를 입력하세요: ");
		int Num = System.in.read();
		
//		if(Num >= '0' && Num <= '9')
//		{
//			System.out.println("숫자입니다.");
//		} else
//		{
//			System.out.println("숫자가 아닙니다.");
//		}
		
		String str = (Num >= '0' && Num <= '9') ? "숫자입니다." : "숫자가 아닙니다.";
		System.out.println(Num + "는(은) " + str);
		
	}

}
