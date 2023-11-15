package ex11static;

class MyStatic{
	
	int instanceVar; //멤버변수
	static int staticVar; //정적멤버변수
	
	//인스턴스형 멤버메서드
	void instanceMethod() {
		System.out.println("instanceVAr= " + instanceVar);
		System.out.println("staticVar=" + staticVar);
		staticMethod();
	}
	/*
	 정적멤버메서드: 정적메서드 내부에서는 인스턴스형 멤버에 접근할 수 없다.
	 main메서드에서는 static으로 선언된 메서드만 호출할 수 있다.
	 */
	static void staticMethod() {
//		System.out.println("instnaceVar=" + instanceVar);
		System.out.println("staticVar=" + staticVar);
//		instanceMethod();
	}
}

public class E01StaticModifier
{

	public static void main(String[] args)
	{
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar=" + myStatic.instanceVar);
		
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar=" + MyStatic.staticVar);
		
		myStatic.staticVar=300;
		System.out.println("myStatic.staticVar=" + myStatic.staticVar);
		
		///////////////////////////////////////
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 100;
		ms2.instanceVar =1000;
		System.out.println("ms1.instanceVar=" + ms1.instanceVar);
		System.out.println("ms2.instanceVar=" + ms2.instanceVar);
		
		ms1.staticVar = 800;
		ms2.staticVar = 900;
		System.out.println("ms1.staticVar=" + ms1.staticVar);
		System.out.println("ms2.staticVar=" + ms2.staticVar);
		
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
//		MyStatic.instanceMethod();
		MyStatic.staticMethod();
	}

}
