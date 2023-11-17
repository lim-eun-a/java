package ex13interface;
/*
 추상클래스
 	- 객체생성을 허용X
 	- 상속받는 클래스는 반드시 추상메서드를 오버라이딩 해야함
 	- 객체생성은 할 수 없으나, 참조변수, 상속 등의 모든 기능을 사용 가능
 */
abstract class AbsClass1{
	public static final int MAX_INT = Integer.MAX_VALUE;
	void instanceMethod() {} //멤버메서드
	static void staticMethod() {} //정적멤버메서드
}
class AbsClassChild1 extends AbsClass1{
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}

abstract class AbsClass2{
	abstract void absMethod(int number);
}
class AbsClassChild2 extends AbsClass2{
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라이딩");
	}
	void newMethod() {
		System.out.println("확장한 메소드");
	}
}

public class E01AbstractMain
{

	public static void main(String[] args)
	{
		//추상클래스는 객체를 생성할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1();
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		//추상클래스는 객체(인스턴스)생성은 할 수 없지만, 참조변수로는 사용 가능
		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		//부모타입으로 자식객체에 접근하려면 반드시 다운캐스팅 해야함
		((AbsClassChild2)absClass2).newMethod();
		
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값: " + AbsClass1.MAX_INT);
	}

}
