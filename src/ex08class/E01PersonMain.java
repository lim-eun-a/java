package ex08class;
/*
 추상화
 */
/*
 클래스 선언시 class 키워드를 사용
 */
class Person {
	/*
	 멤버변수: 클래스에서 주로 속성(데이터)를 표현
	 사람을 표현한 클래스이므로 나이, 이름 등이 정의
	 */
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	/*
	 멤버메서드: 클래스에서 객체의 동작(행위)를 표현
	 클래스 외부에서 호출할 때 객체의 참조변수를 사용해서 .(닷)으로 호출
	 */
	void eat() {
		System.out.printf("%s가(이) 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가(이) 잠자고 있다\n", age, name);
	}
}


public class E01PersonMain
{

	public static void main(String[] args)
	{
		/*
		 Person 클래스를 통해 객체(인스턴스)를 생성한다.
		 생성시 할당된 주소값을 반환하고, 좌측항의 참조변수가 그 값을 할당받게된다.
		 */
		Person person = new Person();
		
		// 객체의 참조변수를 통해 멤버메서드를 호출
		person.eat();
		person.sleep();
		
		// 객체 생성직후 참조변수를 저정하지 않고도 멤버메서드를 호출할 수 있다.
		new Person().eat();
		new Person().sleep();
	}

}
