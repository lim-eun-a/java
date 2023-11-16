package ex12inheritance;
/*
 오버로딩 VS 오버라이딩
 */
class A{
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}
class C extends B {
	@Override
	public void  rideMethod() {
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
}

public class E07RideAndLoad01
{

	public static void main(String[] args)
	{
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		System.out.println("오버로딩 처리된 메소드");
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);
		
		ref1.loadMethod();
//		ref1.loadMethod(1);
//		ref1.loadMethod(1.1);
		
		
		////////////////////////////////////////////////
		// 부모 참조변수로 자식객체를 참조할 수 있다.
		A refNum1 = new B();
		A refNum2 = new C();
		A refNum3 = new C();
		
		C refAddr1 = new C();
		B refAddr2 = refAddr1; //B타입 -> C타입: 참조가능
		A refAddr3 = refAddr1; //A타입 -> C타입: 참조가능
		
		A refId1 = new C(); 	// A->C: 참조가능
//		B refId2 = refId1; 		// B->A: 참조불가능
//		C refId3 = refId1; 		// C->A: 참조불가능 
//		
		//다운캐스팅(강제형변환)
		B refId2 = (B)refId1;
		C refId3 = (C)refId1;
		
	}

}
