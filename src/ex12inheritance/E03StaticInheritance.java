package ex12inheritance;

/*
 static(정적) 타입의 멤버도 상속이 되고, 
 하위클래스에서 접근시에는 멤버변수의 이름만으로 접근이 가능하다.
 단, 클래스 외부에서 접근할 경우 객체생성없이 클래스명을 통해서도 접근할 수 있다.
 즉 static이 가진 기본적인 규칙을 따른다.
 */
class Adder{
	public static int val = 0;
	/*
	 static으로 선언된 멤버변수는 실제로는 클래스외부(메서드영역)에 생성되어 있으므로
	 클래스명을 통해 접근이 허용된다.
	 코드 레벨에서 보면 해당 클래스의 매개변수이므로 변수명만으로 접근하는 것도 가능
	 즉, 문법적으로는 둘 다 허용되는 코드이다.
	 */
	
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

/*
 부모의 멤버변수가 public이므로 접근이 제한이 없이 아래에 작성된 모든 
 클래스명으로 접근 가능
 */
class AdderFriend extends Adder{
	public void friendAdd(int num) {
		val += num;
		Adder.val += num;
	}
	public void showVal() {
		System.out.println("val=" + val);
		System.out.println("val=" + Adder.val);
	}
}

public class E03StaticInheritance
{

	public static void main(String[] args)
	{
		//부모클래스를 통한 객체생성
		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		Adder.val += 5;
		AdderFriend.val += 7;
		
		adFriend.showVal();
	}
}
