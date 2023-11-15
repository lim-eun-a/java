package ex10accessmodifier;
/*
 class를 정의할 때는 public or default만 사용해야 함.
 private은 class정의에서는 사용할 수 없다.
 */
/*
해당 클래스는 접근 지정자를 생략하였으므로 default 클래스로 정의한다.
이 경우 동일한 패키지 내에서만 접근할 수 있다.
*/
class DefaultClass1{
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}
/*
 public클래스는 자바파일당 단 하나만 정의할 수 있다.
 */
public class E01AccessModifier1
{
	//멤버변수: 세 가지의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	//멤버메서드: 변수와 동일하게 세가지의 접근지정자를 통해 정의
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 간접 호출: " + privateVar);
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출" + privateVar);
	}
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출" + privateVar);
		privateMethod();
	}

}
