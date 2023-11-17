package ex12inheritance;
/*
 다형성
 */
class Parent{
	int parentMember;
	void parentMethod() {
		System.out.println("부모의메소드: parentMethod()");
	}
}
class Child extends Parent{
	int childMember;
	void childMethod() {
		System.out.println("자식의메소드: childMethod()");
	}
	@Override
	void parentMethod() {
		System.out.println("자식에서 Overriding한 메소드" + "parentMethod()");
	}
	//오버로딩해서 정의한 확장메서드
	void parentMethod(int childMember) {
		this.childMember = childMember;
		System.out.println("Overloading: 자식에서 확장한 메소드" + ": parentMethod(int childMember)");
	}
}
public class E11Polymorphism
{
	public static void main(String[] args)
	{
		System.out.println("[자식으로 자식객체 참조 - 동질화]");
		Child homeChild = new Child();
		homeChild.childMember = 10;
		homeChild.parentMember = 100;
		homeChild.childMethod();
		homeChild.parentMethod(1000);
		homeChild.parentMethod();
		
		/*
		 이질화: 부모타입의 변수로 자식객체를 참조하는 것
		 */
		System.out.println("[부모로 자식객체 참조 - 이질화]");
		Parent parent1 = homeChild;
		parent1.parentMember = 1;
//		parent1.childMember = 1;
		parent1.parentMethod();
		Parent parent2 = new Child();
		parent2.parentMember=1;
		parent2.parentMethod();
		
//		(Child)parent2.childMember = 1;
		((Child)parent2).childMember = 1;
		((Child)parent2).childMethod();
		((Child)parent2).parentMethod();
		
		Child child2 = (Child)parent2;  //int a = (int)3.14; 이와 비슷함
		child2.childMember =1;
		child2.childMethod();
		child2.parentMethod(1);
		
		System.out.println("[클래스의 끝판왕 Object]");
		Object object = new Child();
		((Parent)object).parentMethod();
		
	}

}
