package ex13interface;
/*
 인터페이스
 	- 클래스가 객체의 설계도라면 인터페이스는 클래스의 설계도라 할 수 있다.
 	- 자바는 단일 상속을 원칙으로 하지만 인터페이스를 통해 다중상속을 구현할 수 있다.
 	- 추상클래스와 동일하게 상속을 목적으로 제작되므로 구현받은 하위클래스에서는
 		반드시 추상메서드를 오버라이딩 해야 한다.
 	- 멤버로는 추상메서드와 상수로만 구성된다.
 	- 인터페이스는 생성자를 사용할 수 없다.
 */
interface MyInterface1 {
	// 생성자 사용 불가
//	public MyInterface1() {}
	
	// 인터페이스에서 선언되는 변수는 무조건 상수로 = 대문자로 기술
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = Double.MAX_VALUE;
	
	public abstract void absFunc1();
	void absFunc2();
}

interface MyInterface2 {
	void absFunc2();
}
class SimpleClass{
	int simple = 1;
	void mySimple() {
		System.out.println("simple=" + simple);
	}
}
class MyClass extends SimpleClass implements MyInterface1, MyInterface2{
	@Override
	public void absFunc1() {
		System.out.println("absFunc1() 호출됨");
	}
	@Override
	public void absFunc2() {
		System.out.println("absFunc2() 호출됨");
	}
}

public class E03InterfaceMain
{

	public static void main(String[] args)
	{
		MyInterface1 my1 = new MyClass();
		my1.absFunc1();
		my1.absFunc2();
		((SimpleClass)my1).mySimple();
	}

}
