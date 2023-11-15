package ex11static;
/*
 static블럭: 메인메서드보다 먼저 실행되는 블럭
 */
public class E02StaticBlockMain
{
	//인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
	
	//정적 멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	//static 블럭 정의
	static {
		staticVar = 1000;
		
		/*
		 블럭내에서만 사용할 수 있는 변수로, 블럭내에서는 일반변수를 생성할 수 있다.
		 */
		int localVar;
		localVar = 1000;
		System.out.println("localVar=" + localVar);
		
		//static블럭내에서는 인스턴스형 멤버는 사용할 수 없다.
//		System.out.println("instanceVar="+instanceVar);
//		instanceMethod();
		
		System.out.println("staticVar=" + staticVar);
		staticMethod();
		
		System.out.println("===static block 끝===");
	}
	
	public static void main(String[] args)
	{
		System.out.println("==메인메소드==");
		//static블럭내에서 선언된 변수는 지역변수이므로 main메서드에서는 사용할 수 없다.
//		System.out.println("localVar=" + localVar);
	}

}
