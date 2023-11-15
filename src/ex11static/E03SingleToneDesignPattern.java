package ex11static;
/*
 싱글톤 디자인 패턴: 클래스를 설계하는 디자인패턴의 하나로써 하나의 인스턴스
 즉, 하나의 메모리를 생성해 이를 공유해서 사용하고자 할 때 쓰는 패턴이다.
 
 작성방법
 1. 생성자의 접근지정자를 private으로 선언한다.
 2. 클래스 외부에서는 생성자에 접근할 수 없으므로 new를 통해 객체 생성은 할 수 없다.
 3. 클래스 내부에 정적메서드로 해당 클래스의 참조값을 반환하도록 정의한다.
 	주로 getInstance() 메서드로 작성
 4. 위 방법을 통해 객체를 사용하면 메모리에 딱 하나의 객체만 만들어지게된다.
 */

//일반적인 클래스 정의
class NoSingleTone{
	int instVar;
	/*
	 생성자는 거의 대부분 pulibc으로 선언한다. 이유는 public으로 선언해야지만 
	 클래스 외부에서 new를 통해 객체를 생성할 수 있다.
	 */
	public NoSingleTone() {}
}

//싱글턴 패턴이 적용된 클래스
class SingleTone{
	// 멤버변수
	int shareVar;
	/*
	 JVM(자바가상머신)에 의해 프로그램이 시작될 때 
	 정적변수는 미리 메서드영역에 로딩되어 사용할 준비를 마치게 된다.
	 */
	private static SingleTone single = new SingleTone();
	
	//기본생성자
	private SingleTone() {
		
	}
	//유틸리티 메서드
	public static SingleTone getInstance() {
		return single;
	}
	//멤버변수 출력용 멤버메서드
	void print(){
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}

public class E03SingleToneDesignPattern
{

	public static void main(String[] args)
	{
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1=" + nst1);

		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2=" + nst2);
		
		//생성자가 private이므로 새로운 객체를 생성할 수 없다.
//		SingleTone st1 = new SingleTone();
		
		//정적메서드이므로 클래스명을 직접 호출할 수 있다.
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		System.out.println(String.format("st2의 주소: %s", st2));
		System.out.println(String.format("st3의 주소: %s", st3));
		
		System.out.println(String.format("st2의 shareVar: %d ", st2.shareVar));
		System.out.println(String.format("st3의 shareVar: %d ", st3.shareVar));
	}

}
