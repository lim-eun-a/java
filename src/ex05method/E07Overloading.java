package ex05method;
/*
 메서드 오버로딩
 */
public class E07Overloading
{
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요.");
		System.out.println("주민번호: " + juminNum);
		System.out.println("군번: " + milNum);
	}
	
//	static void person(int juminNum) {
//		System.out.println("미필자이거나 여성이시군요");
//		System.out.println("주민번호:" + juminNum);
//		return;
//	}
	
	/*
	 반환타입만 다른 경우 에러발생 > 오버로딩이 성립하지 않는다.
	 */
	static int person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호:" + juminNum);
		return 1;
	}

	public static void main(String[] args)
	{
		//매개변수가 2개인 메서드 호출(남성)
		person(123456, 7890123);
		System.out.println("====================");
		//매개변수가 1개인 메서드 호출(여성)
		person(987654);
		System.out.println("====================");
		/*
		 print()문이 대표적인 오버로딩
		 */
		System.out.println(1);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println("안녕하세요");
	}

}
