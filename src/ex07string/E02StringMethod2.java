package ex07string;

public class E02StringMethod2
{

	public static void main(String[] args)
	{
		System.out.println("String 클래스의 주요 메소드2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		/*
		 6. codePointAt()
		 */
		System.out.println("### 6 ###");
		System.out.println("str1 첫번째 문자의 아스키코드: " + str1.codePointAt(0));
		System.out.println("str2 세번째 문자의 아스키코드: " + str2.codePointAt(2));
		
		/*
		 7. endsWith()
		 8. startsWith()
		 */
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));

		/*
		 9. format()
		 */
		System.out.println("### 9 ###");
		
		
	}

}
