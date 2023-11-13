package ex07string;

public class E01StringBasic
{

	public static void main(String[] args)
	{
		int num1=10, num2=20;
		String numResult = (num1 == num2) ? "데이터가 같다" : "데이터가 다르다";
		System.out.println("비교결과: " + numResult);
		
		/*
		 String클래스의 객체 생성 방법1
		 : new를 이용한다. new를 통해 문자열 객체(인스턴스)를 생성하면 
		 동일한 문자열이라도 항상 새로운 메모리를 할당하게 된다.
		 */
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
//		String str2 = "Hello JAVA"; //NEW가 생략된 것임
		
		/*
		 아래의 비교는 참조값(주소값)에 대한 비교를 하게된다. 
		 2개의 객체는 따로 생성되므로 서로 다른 참조값을 가짐
		 */
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		/*
		 equals()메서드
		실제 저장된 문자열을 비교하도록 만들어진 메서드이다.
		 */
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
		String str3 = "자바개발자";
		String str4 = "자바개발자";
		
		System.out.println("equals()메소드로 문자열비교: " + str3.equals(str4));
		
		if(str3==str4) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		System.out.println("The end..!!");
	}

}
