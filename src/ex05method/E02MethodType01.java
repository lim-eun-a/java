package ex05method;

// 메서드는 반드시 class 내부에 정의해야 한다.
// 메서드 안에 또 다른 메서드를 정의할 수 없다. > 에러발생
// 반환값이 없다면 void를 반드시 명시해야 한다.
// 함수명은 변수명과 동일한 규칙으로 작성한다.

public class E02MethodType01
{
	static void menuPrint() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("=====================");
	}
	
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Return문 이전]");
		
//		return; //주석처리 안하면 아래에서 에러가 발생한다.
		
		if(returnValue%2==0) {
			System.out.println(returnValue + "는 짝수");
			//함수에서 return은 종료를 의미한다.
			return;
		}
		
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
	}
	
	public static void main(String[] args)
	{
		menuPrint();
		returnError();
	}

}
