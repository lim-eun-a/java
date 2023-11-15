package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain
{

	public static void main(String[] args)
	{
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		E01AccessModifier1 one = new E01AccessModifier1();
		
//		System.out.println("one.privateVar= " + one.privateVar);  // 에러발생
		System.out.println("one.defaultVar= " + one.defaultVar);
		System.out.println("one.publicVar= " + one.publicVar);
		
//		one.privateMethod(); // 에러발생
		one.defaultMethod();
		one.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
//		System.out.println("two.privateVar= " + two.privateVar); // 에러발생
//		System.out.println("two.defaultVar= " + two.defaultVar); // 에러발생
		System.out.println("two.publicVar= " + two.publicVar); 
		
//		two.privateMethod(); // 에러발생
//		two.defaultMethod(); // 에러발생
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc(); // 에러발생

	}

}
